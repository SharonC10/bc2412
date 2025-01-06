public class Librarian {
  private String name;
  private Library library;

  // Librarian -> Library
  //Library -> librarian
  public Librarian(Library library) {
    this.library = library;
  }

  //add 
  //removeByTitle()
  public void add(Book book){
    Book [] books = new Book [this.library.size() + 1];
    for (int i= 0; i< this.library.size() ; i++){
      books[i] = this.library.getBooks()[i];
    }
books[books.length -1 ] = book;
this.library.setBooks(books);
  }

  //Assume remove the first book with same title 
  //1. Remove the item 
  //2. return removed item 
  public Book removeBook (String title){
    int targetRemoveIndex = -1;
    for (int i = 0; i < this.library.size(); i++){
      if (this.library.getBook()[i].getTitle().equals(title)){
        targetRemoveIndex = i;
        break;
      }
    }
    Book targetBook = null;
    if (targetRemoveIndex!= -1){ //book found
      Book [] books =new Book [this.library.size() -1];
    int idx = 0;
  for (int i = 0; i< this.library.size(); i++){
    if (i != targetRemoveIndex){
      books[idx++] = this.library.getBooks()[i];
    }
  }}
  }

}
