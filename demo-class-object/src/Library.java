public class Library {
  // A library has many books
  // A Book has attributes, title & author
  // The library has funtions:
  // 1) add(), return void. add book
  // 2) removeByTitle , return book.
  // 3) searchByTitle , return Book[] e.g: Book: hello world ,when search 'll'

  // Librarian(add , remove), Library(search) , Book
  public Book[] books;

  // ------------------------------Construtor
  public Library() {
    this.books = new Book[0];
  }

  // --------------------------Getter
  public Book[] getBooks() {
    return this.books;
  }

  // -----setter?
  public void setBooks() {
    this.books = books;
  }

  // method signatures
  public void addBook(Book books) {
    Book[] newBooks = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++) {
      newBooks[i] = this.books[i];
    }
    newBooks[newBooks.length - 1] = books;
    this.books = newBooks;
  }

  // ----------------------------------------------
  // remove book
  public Book removeByTitle(String title) {
    Book[] newBooks = new Book[this.books.length - 1];
    int idx = 0;
    int countTarget = 0;
    Book deletedBook = null;

    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].getTitle().equals(title) && countTarget == 0) {
        // this.book[i].getTitle().content()
        countTarget++;
        deletedBook = this.books[i];// write down the address
        continue;
      }
      newBooks[idx++] = this.books[i];// remember to resize the array
    }
    this.books = newBooks;

    return deletedBook;
  }
  // work!
  // Vincent----------------------------------------[Remove Book]
  // public Book removeByTitle (String title){
  // int targetRemoveIndex = -1;
  // for (int i = 0; i< this.books.length; i++){
  // if (this.books[i].getTitle().equals(title)){
  // targetRemoveIndex = i;
  // break;
  // }
  // }
  // Book targetRemoveBook = null;
  // if (targetRemoveIndex != -1){
  // Book []books = new Book [this.books.length -1];
  // int idx = 0;
  // for (int i = 0; i< this.books.length; i++){
  // if (i != targetRemoveIndex){
  // }else {
  // targetRemoveBook = this.books[i];
  // }
  // }
  // this.books = books;
  // }
  // return targetRemoveBook;
  // }

  // ----------------------------------------------
  // use title search books
  public Book[] searchByTitle(String title) {
    Book[] newBooks = new Book[this.books.length];
    int count = 0;
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].getTitle().contains(title)) {
        count++;
      }
    }
    Book[] books = new Book[count];
    int idx = 0;
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].getTitle().contains(title)) {
        books[idx++] = this.books[i];
      }
    }
    return books;
  }
  // work!
  // Vincent-----------search book-----------------------------
  // public Book [] searchByTitle (String title){//didn't change the value of this.books
  // int count = 0;
  // for (int i = 0; i< this.books.length; i++){
  // if (this.books[i].getTitle().contains(title))
  // count++;
  // }
  // Book []books = new Book [count ];
  // int idx = 0;
  // for (int i = 0; i< this.books.length; i++){
  // if (this.books[i].getTitle().contains(title))
  // books[idx++] = this.books[i];
  // }
  // return books;
  // }
  // public int size(){
  // return this.books.length;
  // }

  // ----------------------------------------------

  public static void main(String[] args) {
    // Book b1 = new Book("abc", "Sharon");
    // Book b2 = new Book("def", "Tom");
    // Library L1 = new Library();

    Library L1 = new Library();
    L1.addBook(new Book("ABC", "Sharon"));
    L1.addBook(new Book("DEF", "Tom"));
    L1.addBook(new Book("ABCD", "Jenny"));

    for (Book book : L1.getBooks()) {
      System.out.println(book.getTitle() + " " + book.getAuthor());
    }
    // ABC Sharon
    // DEF Tom
    // ABCD Jenny

    for (Book book : L1.searchByTitle("BC")) {
      System.out.println(book.getTitle() + " " + book.getAuthor());
    } // ABC Sharon
      // ABCD Jenny

    Book removeBook = L1.removeByTitle("ABC");
    System.out.println(removeBook.getTitle() + " " + removeBook.getAuthor());
    // DEF Tom
    // System.out.println(L1.size());
    // 2


  }
}
