public class Library {
  // A library has many books
  //A Book has attributes, title & author
  //The library has funtions: 
  //1) add(),  return void.      add book
  //2) removeByTitle , return book.
  //3) searchByTitle , return Book[] e.g: Book: hello world ,when search 'll'

  //Librarian(add , remove), Library(search) , Book
  private Book[] books;

  //Construtor
  public Library(){
    this.books = new Book[0];
  }

  

  //method signatures
  public void addBook (Book books){
    Book [] newBooks = new Book[this.books.length +1];
    for (int i = 0; i < this.books.length; i++){
      newBooks[i] = this.books[i];
    }
    newBooks[newBooks.length -1] = books;
    this.books = newBooks;
  }
//----------------------------------------------
  //remove book 
  public Book removeByTitle (String title){
  Book [] newBooks = new Book[this.books.length -1];
    int idx = 0;
    int countTarget = 0;

  for (int i = 0; i < this.books.length; i++){
    if (this.books[i].getTitle().equals(title) && countTarget ==0){
      countTarget++;
      continue;
    }
    newBooks[idx++] = this.books[i];
  }
  this.books = newBooks;
  return removeByTitle(title);
  }
  
  //----------------------------------------------
  //use title search books
  public Book [] searchByTitle(String title){
    Book[] newBooks = new Book[this.books.length];
    for (int i = 0; i< this.books.length; i++){
      if (this.books[i].getTitle().equals(title)){
        newBooks[newBooks.length -1] = this.books[i];
      }
    }
    return searchByTitle(title);
  }
//----------------------------------------------

  public static void main (String []args){
    Book b1 = new Book("abc", "Sharon");
    Library L1 = new Library();

    L1.addBook(b1);
    L1.removeByTitle("abc");
    L1.searchByTitle("abc");

    System.out.println(L1.books[0].getTitle());
    System.out.println(L1.removeByTitle("abc"));
    System.out.println(L1.searchByTitle("abc"));
  }
}
