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

}
