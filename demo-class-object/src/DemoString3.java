public class DemoString3 {
  public static void main(String[] args) {
    //1)Literal Pool
    String s = "hello";//Literal Pool
    String s2 = "hello";//Literal Pool
    String s3 = s; // s3 and s pointing same object;
    String s4 = "hello!";
    //Vincent: now s & s2 are meaning the same object

    String s5 = new String("hello"); //new means new object! even the hello 
    String s6 = String.valueOf("hello");//Leverage Literal Pool 睇下Literal Pool 有冇再執出尼
    
    //String s10 = String.valueOf(arr);

    System.out.println(System.identityHashCode(s));
    //1933863327

    //identityHasCode -> Object reference (adress)
    System.out.println(System.identityHashCode(s3));
    System.out.println(System.identityHashCode(s2));//1933863327
    System.out.println(System.identityHashCode(s4));//112810359
    System.out.println(System.identityHashCode(s5));//2124308362
    System.out.println(System.identityHashCode(s6));//1933863327
//  6個指針，兩個Object
String s7 = new String ("hello");
System.out.println(System.identityHashCode(s7));//146589023

//2) equals(), == -------------------------------------
//if you use "==" for non-primitive, you are checking the objec reference 
//Beside, s.equals() is checking the String value itselt
System.out.println(s== s2);//true 
System.out.println(s.equals(s2));//true

System.out.println(s == s5);//false , it is checking the object reference 
//people usally not check the object reference 

System.out.println(s.equals(s5));//true

System.out.println(s5 == s7);//false 


//String is immutable  不可刪改 (purpose: reduce risk)
//e.g
s = s + "?";
//Question: after appending "?", is s still the same object?

//Ans: No
System.out.println(System.identityHashCode(s));//349885916

//2) equals(), ==
//== -> check the object address 







  }
}
