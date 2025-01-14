import java.util.ArrayList;

public class DemoArrayList {
 public static void main(String[] args) {
  //ArrayList -> many String

  //Array: fixed length
  String[] ss = new String[3000]; 
  //why array so fast to get the ss2[1]? 
  //因為fix length
  String [] ss2 =new String[]{"abc", "ijk", "xyz"};
  //ss2 is an address of the array, ss2[0]
  System.out.println(ss2[1]); //ijk, ewad the "ijk" jump position directly

//Variable Length -> 你不用理array 嘅空間
//Underline data strucutre -> array
//
    ArrayList<String >strings = new ArrayList<>();
    strings.add("ABC");
    strings.add("IJK");
    System.out.println(strings.size());//2
    System.out.println(strings.get(1));//IJK, jump to the elements with index 1 directly
    //System.out.println(strings.get(2));//NOT OK //java.lang.IndexOutOfBoundException
    

    //Book[]
    ArrayList<Book> books = new ArrayList<>();
    books.add(new Book ("ABC"));
    books.add(new Book("IJK"));

    books.remove(0); // remove by index;
    System.out.println(books.size());//1
    books.add(new Book("XYZ"));
    books.remove(new Book("IJK")); //after @Override equals() in Book.class
    //ArrayList.remove (Object obj)-> book.equals()
    //Generics Design ensure the Type must contains equals()
    System.out.println(books.size());//2  |1

books.contains(new Book ("XYZ"));
//requires @Override equals
System.out.println(books.contains(new Book ("XYZ")));//true
books.indexOf(new Book ("XYZ"));//0
books.clear(); //Create a new array with size 0

books.add(new Book ("ABCD"));
System.out.println(books.add(new Book ("ABCD"))); //true

books.isEmpty(); //false

//search part of the title for book->"ABCD" for loop
//for each-loop support ArrayList
String bookName = "Not found ";
for(Book book: books){
  //boolean found = false;
  if (book.getName().contains("BC")){
    //found = true;
    break;
  } //if (found){
  }System.out.println("Book " + bookName + " is avilable.");



ArrayList<Integer> index = new ArrayList<>();
index.add(123);
index.add(123);
System.out.println(index.size());
index.remove(123);
System.out.println(index.size());



 } 
}
