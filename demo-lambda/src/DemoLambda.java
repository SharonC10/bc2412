import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambda {
  public static void main(String[] args) {
    // Java Lambda Expression -> Stream, Optional
    // What is this?
    // 2014 Java 8

    // Java Bulit-in Lambda Function
    // y = f(x), input -> output

    // -------------------------1. Function------------------------------------------one input one output
    // stringLength -> functionName
    // define function
    // s (input)
    // s.length() (output)
    Function<String, Integer> stringLength = s -> s.length(); // skip "return" keyword
    // runtime program
    // inpput and output can be the same
    //
    stringLength.apply("hello");
    System.out.println(stringLength.apply("hello")); // 5 (output: 5 -> s'length)

    stringLength = s -> s.length() + 10;

    System.out.println(stringLength.apply("hello")); // s.length() +10; 15 (output: 15 -> s'length)


    // -------------------------2. BiFunction------------------------------------------
    // Input (String , String ) s1 & s2
    // Output (Integer)
    BiFunction<String, String, Integer> totalLength =
        (s1, s2) -> s1.length() + s2.length();
    totalLength.apply("sharon", "Vincent");
    System.out.println(totalLength.apply("sharon", "Vincent"));
    // output is Integer -> sharon(6) , Vincent(7) = 6+7 =13



    // -------------------------3. Consumer------------------------------------------有野入 冇野出
    Consumer<String> printString =
        s -> System.out.println("The String is " + s);
    printString.accept("hello"); // The String is hello
    // (s) is input
    // one input , but no output


    // -------------------------4. Supplier------------------------------------------冇野入 有野出
    // 可考慮之前有D有用 void都可以用
    Supplier<Integer> randomMarkSixNumber = () -> new Random().nextInt(49) + 1;
    randomMarkSixNumber.get();
    System.out.println(randomMarkSixNumber.get());
    // No input , have output

    // -------------------------5. Custom Function------------------------------------------
    // Custom FuntionInterface Swimable
    // Java before 8: Interface -> Class -> Object
    // Java after 8 : Interface -> Objcet
    Swimable lucas = () -> System.out.println("Lucas is swimming.");
    lucas.swim();// Lucas is swimming.

    // Lambda Assumption: Functional Interface -> one method only -> lambda expression
    // if your Interface have a lot of method -> then you may not suit to use Lambda
    // big Interface -> not suitable
    // small Interface -> setparate those method (two to one by one)


    // MathOperation
    MathOperation addition = (x, y) -> x + y;
    MathOperation subtract = (x, y) -> x - y;
    MathOperation muptiplie = (x, y) -> x * y;
    MathOperation divide = (x, y) -> x / y;
    System.out.println(addition.operate(10, 10)); // 20
    System.out.println(subtract.operate(10, 10)); // 0
    System.out.println(muptiplie.operate(10, 10)); // 100
    System.out.println(divide.operate(20, 10)); // 1
    try {
      int input = divide.operate(10, 0);

    } catch (ArithmeticException e) {
      // TODO: handle exception
      System.out.println("Cannot dicided by Zero");
    }

    // SuperFunction (Interface) 3input 1Ooutput
    CustomFunction book1 = (year, bookName, author) -> year + bookName + author;
    book1.get(1997, "The Book", "Sharon");
    System.out.println(book1.get(1997, ",The Book ", ",Sharon"));
    // System.out.println: -> 1997, The Book, From Sharon.

    // SuperFunction
    SuperFunction result = (x, y, z) -> x + y + z;
    System.out.println(result.apply(10, 10, 10));


    // --------------------ArrayList & each Loop-----------------------------------------------
    List<Book> books = new ArrayList<>();
    books.add(new Book(1));
    books.add(new Book(3));
    books.add(new Book(10));
    books.add(new Book(12));
    for (Book book : books) {
      System.out.println(book.getId());// 1,3,10,12
    }

    books.forEach(b -> System.out.println(b.getId()));
    // more than one line
    // ForEach Loop 啲 books show Id and show hello.
    // 我地打好左Book嘅 class
    // 整getId 去比function call
    books.forEach(b -> {
      String message = "hello";
      System.out.println(b.getId() + " " + message);
    });

    Map<String, String> fruitMap = new HashMap<>();
    fruitMap.put("orange", "abc");
    fruitMap.put("apple", "def");

    fruitMap.forEach((key, value) -> { // For Each Loop 去Loop HashMap入面all Value.
      System.out.println("Key = " + key + ", value = " + value);
    });
    // -----------------------------Predicate----------------------------------------------

    // Predicate
    // x > 8 -> boolean
    int x1 = -1;
    boolean isLargeThanEight = x1 > 8; // false

    // x -> x> 8 (predicate) it is Formula
    Predicate<Integer> isLargeThan8 = x -> x > 8;
    isLargeThan8.test(9); // true
    System.out.println(isLargeThan8.test(9));
    System.out.println(isLargeThan8.test(8)); // false

    Predicate<String> isSurnmaeChan = c -> c.contains("Chan");
    System.out.println("**************" + isSurnmaeChan.test("Chan Tai Man")); // true
    System.out.println(isSurnmaeChan.test("Chan Tai Man"));


    // check if the Integer is even number
    Predicate<Integer> isEvenNumber = x -> x % 2 == 0;
    System.out.println(isEvenNumber.test(3));
    isLargeThan8.and(isEvenNumber).test(10); // true
    isLargeThan8.or(isEvenNumber).test(9);// true
    // Predicate can support and ,or
    System.out.println(isLargeThan8.and(isEvenNumber).test(10)); // true
    System.out.println(isLargeThan8.or(isEvenNumber).test(9)); // true

    // -----------------------------------------------------
    System.out.println(books.size()); // 4
    books.removeIf(book -> book.getId() % 2 == 1);
    System.out.println(books.size()); // 2

    // ------------------ merge --------------------------------
    BiFunction<String, String, String> appendHello = // BiFunction -> 2input , 1 output.
        (oldV, newV) -> oldV + newV + "hi"; // 收 oldValue,加個newValue and "hi", if found oldValue -> add new value
    fruitMap.merge("lemon", "xyz", appendHello);// "lemon" can't found in the oldValue -> 直接sysOut.
    fruitMap.merge("apple", "mno", appendHello);
    fruitMap.merge("orange", "yyy", appendHello); // old Value + yyy if found orange ->orange's "abc" ->
    System.out.println(fruitMap);// {orange=abcyyy, apple=defmno, lemon=xyz}



    // SuperFunction<String, String, String, Integer> formula = (s1, s2, s3) -> {
    // int result = s1.length() + s2.length() + s3.length();
    // return result;
    // };
    // System.out.println(formula.apply("abc", "", "ppp")); // 6


    // Predicate <String>
    // books.removeIf(book -> book.getId() % 2 ==0);

    // ---------------------UnaryOperator--------------------------------
    // 淨係做自己本身Object
    UnaryOperator<String> toUpperCase = s -> s.toUpperCase();
    System.out.println(toUpperCase.apply("Hello")); // HELLO

    UnaryOperator<String> transform = s -> {
      if (s.length() > 5) {
        return s.substring(0, 5); // 如果StringLength大過5 -> cap0-5（endIndex -1）
      } else {
        if (s.startsWith("a")) {
          return "Wrong String.";
        }
        return s; // the length not > 5, not startWith "a", then show "s"
      }
    };

    System.out.println(transform.apply("abcdef")); // abcde
    System.out.println(transform.apply("abcde")); // Worng String
    System.out.println(transform.apply("edcba")); // edcba
    System.out.println(transform.apply("edc")); // //edc

//-------------UnaryOperator vs Function-----------------------------------------
// I found Function also can do UnaryOperator
// The different is Function -> can having two Pri
//But UnaryOperator only can use one Pri

    Function<String, String> toUpper = s -> s.toUpperCase();
    Function<String, String> change = s -> {
      if (s.length() > 5) {
        return s.substring(0, 5); // 如果StringLength大過5 -> cap0-5（endIndex -1）
      } else {
        if (s.startsWith("a")) {
          return "Wrong String.";
        }
        return s; // the length not > 5, not startWith "a", then show "s"
      }
    };

    System.out.println(change.apply("abcdef")); // abcde
    System.out.println(change.apply("abcde")); // Worng String
    System.out.println(change.apply("edcba")); // edcba
    System.out.println(change.apply("edc")); //edc

    UnaryOperator<Integer> add = a -> a + 2;
    


  }

  // Consumer, Function, Predicate--------------Class
  public static class Book {
    private int id;

    public Book(int id) {
      this.id = id;
    }

    public int getId() {
      return this.id;
    }
  }

  // Similar to Consumer.class-------------------------------
  public static void printString(String s) {
    System.out.println("The String is " + s);
  }

  // Similar to Supplier.class-------------------------------
  public static int randomMarkSixNumber() {
    return new Random().nextInt(49) + 1; // 49
  }

  // Similar to Function.class-------------------------------
  public static Integer stringLength(String s) { // s -> input
    return s.length(); // s.length() -> output
  }

  //my test -------------------------------------------------
  public static class Member{
    private String name;
    private int age;

    public Member (String name , int age ){
      this.name = name;
      this.age = age;
    }
    public String getName(){
      return this.name;
    }
    public int getAge(){
      return this.age;
    }

    public void setAge(int age){
      this.age = age;
    }

  }
}
