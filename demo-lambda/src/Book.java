public record Book(String name, double price) {
  //private String author;

  public static final double PI = 3.14;

  // public Book (){

  // }
  public void print(){
    System.out.println(name + price);
  }
  public static void main(String[] args) {
    Book b1 = new Book("ABC", 10.5);
  System.out.println(b1.name()); //ABC
  System.out.println(b1.price()); //10.5
  System.out.println(new Book("ABC", 10.5).equals(b1)); //true
  System.out.println(new Book("ABC", 10.5).hashCode());//1078168574
    System.out.println(b1.hashCode());//1078168574
    System.out.println(b1); //Book[name=ABC, price=10.5]
    b1.print();//ABC10.5
    System.out.println(Book.PI); //3.14
  
    //Java 16 - Record
    //All-arg construtor
  //No Need to use getter 
  //No Setter (immutable) cannot revised 
  //Support equal() and HashCode()
  //Support to String 
  //Support static variable/ method 
  //Support instance method 
  //Do not suppot custom attribute
  //Do not support custom contrutor
}
}
