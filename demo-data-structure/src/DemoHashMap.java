import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.swing.text.html.StyleSheet;

public class DemoHashMap {


  public static class Book{
    private String name;
    private long id;

    public Book (long id,String name){
      this.name = name;
      this.id = id;
    }
    public String getName(){
      return this.name;
    }
    public long getId(){
      return this.id;
    }

@Override
public boolean equals (Object obj){
  if (this == obj)
  return true;
  if (!(obj instanceof Book))
  return false;
  Book book = (Book) obj;
  return Objects.equals(this.id, book.getId()) &&
  Objects.equals(this.name, book.getName());
}
@Override
public int hashCode(){
  return Objects.hash(this.id, this.name);
}

@Override
public String toString(){
  return "Book[ "+
  " ID: " + getId() + 
  " Name: " + getName() +
  "]";
}
  }
  public static void main(String[] args) {
    //Key and Value
    //left: Key, right: Value
    //get, contain, put, for loop

    HashMap<String , Integer> fruitMap =new HashMap<>();
    //put an entry to Map;
    fruitMap.put("Apple", 1);
    fruitMap.put("Apple", 3);
    //Key 一樣，最新的會replace
    System.out.println(fruitMap);
    // if the key is same, the entry will be replaced.
    System.out.println(fruitMap.size()); // 1, entry count
    fruitMap.put("APPLE", 3);//大階就不一樣的 key，所以不被replace and 加多一條新array
    System.out.println(fruitMap.size());//2 

    //According to String.class equals(), "Apple" and "APPLE" are not equals
    
    //for each Loop
    for ( Map.Entry<String , Integer> entry: fruitMap.entrySet()){ 
      //Left = one thing, Right side = a lot of entry 
      System.out.println(entry.getKey()+ " " + entry.getValue());
    }

    for ( String key: fruitMap.keySet()){ 
      System.out.println(key);
    }

    for ( Integer value : fruitMap.values()){ 
      System.out.println(value);
    }

    
    //get Value by Key
    System.out.println(fruitMap.get("Apple"));//3
    System.out.println(fruitMap.get("APPLE"));//3

    //contains() 
    //is this map have this entry? 
    System.out.println(fruitMap.containsKey("APPLE"));// true

    //Find the entry of "Apple" and then +1 to the integer
    //get
    //contain
    //put -replace
   
    // for (Map.Entry<String, Integer> entry : fruitMap.entrySet()){
    //   if (fruitMap.containsKey("Apple")){
    //     fruitMap.get(3+1);
    //   }System.out.println(fruitMap);
    // }
    if (fruitMap.containsKey("Apple")){
      fruitMap.put("Apple", fruitMap.get("Apple")+1);
    }

    Integer value = fruitMap.get("Apple");
      if (value != null){
        fruitMap.put("Apple", value+1);
      
    }System.out.println(fruitMap.get("Apple"));//5


    //Can we put null value to the entry?
    fruitMap.put("ABC", null);
    System.out.println(fruitMap.size()); //3

    //Can we pu null key to the entry?
    fruitMap.put(null, 999);
    fruitMap.put(null, 1000);
    //null 可以做到 key
    System.out.println(fruitMap); //{null=1000, Apple=5, ABC=null, APPLE=3}
    System.out.println(fruitMap.size());
    System.out.println(fruitMap.size());
    
    System.out.println(fruitMap.containsValue(1000));//true

    System.out.println(fruitMap.isEmpty());//false
    
    fruitMap.getOrDefault("Orange", 0);
    System.out.println(fruitMap.getOrDefault("Orange", 0));
    System.out.println(fruitMap.getOrDefault("Apple", 0)); //5
    Integer removedEntryValue = fruitMap.remove("APPLE");
    System.out.println("removedEntryValue: " +removedEntryValue);//3
    fruitMap.put(null, 1000);


    fruitMap.put("Cherry", fruitMap.getOrDefault("Cherry", 0)+1);



    fruitMap.clear();
    System.out.println("The size after clear:" +fruitMap.size()); //0
    //map 存在的，just entry gone
    System.out.println(fruitMap.isEmpty());//true


//
HashMap <Long, Book > bookMap = new HashMap<>();
//create book and put books in map.
// 1 ABC
//2. IJK
//3. DEF
Book b1 = new Book (1,"ABC");
Book b2 = new Book (2,"IJK");
Book b3 = new Book (3,"DEF");
bookMap.put(b1.getId(),b1);
bookMap.put(b2.getId(),b2);
bookMap.put(b3.getId(),b3);
System.out.println(bookMap.size());//3
System.out.println(bookMap.toString());


HashMap <Book , Long> bookMap2 = new HashMap<>();
//Store the book count 
//1 ABC
//2 IJK
//3 DEF
//3 DEF
Book b4 = new Book(1, "ABC");
Book b5 = new Book(2, "IJK");
Book b6 = new Book(3, "DEF");
Book b7 = new Book(3, "DEF");
bookMap2.put(b4,bookMap2.getOrDefault(b4, 0L)+1L);
bookMap2.put(b5 ,bookMap2.getOrDefault(b5, 0L)+1L);
bookMap2.put(b6, bookMap2.getOrDefault(b6, 0L)+1L);
bookMap2.put(b7, bookMap2.getOrDefault(b7, 0L)+1L);
//if key same , will be replace
//Book "DEF" will be replace  

System.out.println(bookMap2.size());//4
  }
  
}
