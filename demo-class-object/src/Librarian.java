public class Librarian {
  private String name;
  private Library library;

  // Librarian -> Library
  //Library -> librarian
  public Librarian(Library library) {
    this.library = library;
  }

}
