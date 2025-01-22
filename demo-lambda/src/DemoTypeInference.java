import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoTypeInference {
  public static void main(String[] args) {
   // private var x; //3. Cannot be define as attribute type 
   //if you want to do it -> use <T>
    //Java 10
    //Once you assign the value to var variable, the variable thpe will be defined as usual.

    var x = 3; //x is an int variable
   // x = 3.3;

   var y =3.3; // y is a double type 
   y = 3; //upcast
   System.out.println(y); //3.0

   List<List <String>> stringLists = new ArrayList<>();
   stringLists.add(Arrays.asList("abc", "def"));
   stringLists.add(Arrays.asList("vincent", "lucas"));

   //List <List <String>>
   // [[abc , def], [vincent , lucas]]
   for (List<String> list : stringLists){
    for (String str : list){
      System.out.println(str);
    }
   };


//same as above 
//var can be defined as reference type for a certain DS
   for (var list : stringLists){
    for (var str : list){
      System.out.println(str);
    }
   };

   //you has to be initialization at declaration
   //第一句 declare
  //  var u = null; 
  //  u =3;

  //Array---------------------------------------
  var arr = new int []{1,2,3}; //normally, var supports array
  //var arr2 = {3,2,1}; NOT OK!!! {3,2,1} can be a double array
  double [] arr10 = {3,2,1};

//-------------------{ Stream() }------------------------
   //Stream FlatMap-------------------------------------------
   //List<List <String>> -> List<String>
   List <String > result = stringLists.stream()
   .flatMap(e -> e.stream())
   .collect(Collectors.toList());

   System.out.println(result); //[abc, def, vincent, lucas]

// List<Customer> customers = Arrays.asList(new Customer("vincent", "vlau", vincentList),
//  new Customer("lucas", "lll", lucaList));

// //map()
// List <String > usernames = customers.stream()
// .map(e -> e.getUserName())
// .collect(Collectors.toList());
// System.out.println(usernames);





//find all nicknames of my customers
List<Customer> customers2 = Arrays.asList(new Customer("vincent", "vlau", Arrays.asList("abc", "def"))
, new Customer("steven", "swong", Arrays.asList("ab", "ijkm"))
, new Customer("lucas", "lll", Arrays.asList("jik", "xyz")));

List <String> nickNames =  customers2.stream()//
.filter(e -> e.getName().length() > 5) // e -> Customer 
.flatMap(e -> e.getNickNames().stream()) // e -> NickName
.filter(e -> e.length() > 3) //e -> String
.collect(Collectors.toList());
System.out.println(nickNames);
//if you can't use Stream()
// for Loop

//---------------------------(Var)----------------------------------
//1. Java doesn't allow defining var as varibale type 
//because Java is String type (type has to be determied during compile time)

// public static int sum (var x , var y){ // No way to doing this -> you don't know the var type
// //what if x -> People ? / Book (What is Book + Book ?)
//   return x + y;
// }

//2. return type cannot be define as var type
//becasue the caller doesn't know the return of sum2() method during compile time
public static var sum2(int x ,int y){
  String a = "a";
  if (a.equals("a")){
    return (long)
  }
  result x+ y;
}



  }
  public static class Customer {
    private String name;
    private String userName;
    private List<String > nickNames;

    public Customer (String name , String userName, List<String> nickNames){
      this.name = name;
      this.userName = userName;
      this.nickNames = nickNames;
    }

    public List<String > getNickNames(){
      return this.nickNames;
    }

    public String getName(){
      return this.name;
    }
    public String getUserName(){
      return this.userName;
    }
    
  }
}
