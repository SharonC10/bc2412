import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoLambda {
  public static void main(String[] args) {
    //Java Lambda Expression -> Stream, Optional 
    //What is this? 
    //2014 Java 8 

    //Java Bulit-in Lambda Function 
    // y = f(x), input -> output

    //-------------------------1. Function------------------------------------------
    //stringLength -> functionName 
    //define function
    //s (input)
    //s.length() (output)
    Function <String , Integer> stringLength = s -> s.length(); //skip "return" keyword
    //runtime program

    //inpput and output can be the same 
    //
    stringLength.apply("hello");
    System.out.println(stringLength.apply("hello")); //5 (output: 5 -> s'length)

    stringLength = s -> s.length() +10;
    
    System.out.println(stringLength.apply("hello")); //5 (output: 5 -> s'length)


    //-------------------------2. BiFunction------------------------------------------
    //Input (String , String ) s1 & s2
    //Output (Integer) 
    BiFunction<String , String , Integer> totalLength = (s1, s2) -> s1.length() + s2.length();
    totalLength.apply("sharon","Vincent");
    System.out.println(totalLength.apply("sharon","Vincent"));

    


    //-------------------------3. Consumer------------------------------------------
    Consumer<String> printString = s -> System.out.println("The String is " + s);
    printString.accept("hello"); //The String is hello
    //(s) is input


    //-------------------------4. Supplier------------------------------------------
    Supplier<Integer> randomMarkSixNumber = () -> new Random().nextInt(49) +1;
    randomMarkSixNumber.get();
    System.out.println(randomMarkSixNumber.get());

    //-------------------------5. Custom Function------------------------------------------
    //Custom FuntionInterface Swimable
    //Java before 8: Interface -> Class -> Object
    //Java after 8 : Interface -> Objcet
    Swimable lucas = () -> System.out.println("Lucas is swimming.");
    lucas.swim();//Lucas is swimming.

    //Lambda Assumption: Functional Interface -> one method only -> lambda expression
    //if your Interface have a lot of method -> then you may not suit to use Lambda
    // big Interface -> not suitable 
    //small Interface -> setparate those method (two to one by one)


    //MathOperation
    MathOperation addition = (x,y ) -> x +y;
    MathOperation subtract = (x,y ) -> x - y;
    MathOperation muptiplie = (x,y ) -> x * y;
    MathOperation divide = (x,y ) -> x / y;
    System.out.println(addition.operate(10, 10)); //20
    System.out.println(subtract.operate(10, 10)); //0
    System.out.println(muptiplie.operate(10, 10)); //100
    System.out.println(divide.operate(10, 10)); //1
    try {
     // int input = x / y;
      
    } catch (ArithmeticException e) {
      // TODO: handle exception
      System.out.println("Cannot dicided by Zero");
    }
    //SuperFunction (Interface) 3input 1Ooutput
    CustomFunction book = (year, bookName, author) -> year + bookName + author;
    book.get(1997, "The Book", "Sharon");
    System.out.println(book.get(1997, ",The Book ", ",Sharon"));
    //System.out.println: -> 1997, The Book, From Sharon.



    //SuperFunction 
    SuperFunction result = (x , y, z) -> x + y + z ;
    System.out.println(result.apply(10, 10, 10)    );




  }
  //Similar to Consumer.class
  public static void printString(String s ){
System.out.println("The String is " + s);
  }

  //Similar to Supplier.class
  public static int randomMarkSixNumber(){
    return new Random().nextInt(49) + 1; //49
  }

  //Similar to Function.class 
  public static Integer stringLength(String s ){ //s -> input
    return s.length(); // s.length() -> output
  }
}
