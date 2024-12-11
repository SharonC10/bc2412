public class DemoDataType {
  public static void main (String[]args){
    // Comment. Welcome to bootcamp! Notes here!
    // ! 1. Data Type ( 8 Primitives)


    // int -> Integer
    int x = 3; // from right to left.
    int dayOfWeek = 7;
    // int y = 3.2; // ! not OK, y is a variable that can store integer only.

    double y2 = 3.2;
    // example .
    // double 2w = 10.0 
    // ! not OK
    // caml case : dayOfWeek, y2(cannot start from number)

    // variable Java naming convension
    

    // Re-assignment 
    //we cannot use the declared the name twice
    //Step 1. declaration
    // Step 2. value assignment 
    // but only can declare the name once, not twice
    x = 101; // Re-assignment 101 to x
    x = x + 10; // right 101 + 10, left: assign 111 to x
    x = x - 40; //111 - 40 = 71
    x = x * 3; // 71 * 3 = 213
    x = x / 213; // 213/213

    // print out  (ln: small L)
    System.out.println(x); // 1
    x = x + 8 * 2 / 4 + 1; 
    // 8 * 2 
    // 16 / 4 -> 4 + 1 + x (1)
    //6
    System.out.println(x);

    x = (x + 2) * 2 / (3 + 1); //4
    System.out.println(x);

    x = ((x + 3)/ ( 6 + 1)) * (x + 1);
    System.out.println(x);

    // divide
    int x2 = 3 / 2;
    // Step 1: 3 -> int value, 2 -> int value 
    // Step 2: int value / int calue -> int value
    // Step 3: 3 /2 -> 1
    // Step 4: assign 1 (int value ) to int type variable (OK!)

    double x3 = 3 / 2;
    // Step 1: 3 -> int value, 2 -> int value 
    // Step 2: int value / int calue -> int value
    // Step 3: 3 /2 -> 1
    // Step 4: assign 1 (int value) to double type variable (convert 1 to 1.0)
    System.out.println(x3); // 1.0

    double x4 = 3.0 / 2;
    // Step 1: 3.0 -> double value, 2 -> int value 
    // Step 2: double value / int calue -> double value
    // Step 3: 3.0 /2 -> 1.5
    // Step 4: assign 1.5 (double value) to dounle type variable 
    System.out.println(x4); // 1.5


    //int f = 10 / 0;
    //System.out.println(f); // !error
    // System connot run! even after this have anothe form below

    // 0 /10
    System.out.println(0 / 10);//0


    //Same as below: int / double = double value
    double x5 = 3 / 2.0;
    System.out.println(x5);

    // divide by 0
    

    //int x6 = 3.0 / 2;
    // Step 1: 3.0 -> double value, 2 -> int value 
    // Step 2: double value / int Value -> double value
    // Step 3: 3.0 /2.0 -> 1.5
    // Step 4: assign 1.5 (double value) to int type variable(downcasting)
    // ! Not allow assign a higher level value to lower value type of variable 
    
    // int -> doyble (upcast)
    // double -> int (downcast)

    // ! Store Integer. Java: int, byte, short, long

    int value = 1000000;
    int value2 = 1_000_000;
    int maxInteger = 2_147_483_647;
    //bank balance connot use, money $
    // e.g 2_147_483_648 ; -2_147_483_689

    // byte
    // -128 -> int value
    // -128 to +127
    // assign an int value to byte type variable 
    byte b1 = -128;
    byte b2 = 127;

    // short
    // short -32768 to 32767
    // int value
    short s1 = -32768;
    short s2 = 32767;

    // long
    // most of the situation can use 
    // how about 2_147_483_648?
    // long l1 = 2_147_483_648;

    // ! long 
    //2_147_483_648 -> int value
    // int value -> double type variable 




    long l1 = 2_147_483_648L; // "L" -> declare it is a long value
    // int value 2_147_483_648
    // !declare a hardcode long value, you should always add "L"
    // Step 1: declare an int value (Not OK)
    long l2 = 2_147_483_648L; // "L" -> declare it is a long value 


    // double vs float 
    double d1 = 10.2; // 10.2 -> double value
    double d2 = 10.2d; // 10.2d -> same double value
    //double better than float, double more 

    float f1 = 10.2f; // 10.2f -> float value 
    // if not add "f", it will be think of double 
    float f2 = 100000000000000000000000.22222222222222222222222f;

    //convention
    float f4 = 10.2f;
    double d3 = f4; //assign float value to double values -> safe
    // as "double a boss", can eat float value
    // float f5 = d3; //! not safe 
    
    double d4 = 10.2f; // upcastin (float -> double )
    // normolly not doing this, 

    double d5 = f4 + 10.2d;
    // float + double = double 
    System.out.println(d5);//0.399999809265136

    double d6 = 0.2 + 0.1;
    System.out.println(d6);//0.30000000000000004 (error?????)
    
    float d8 = 0.2f + 0.1f;
    System.out.println(d8);//0.3!!

    double d7 = 0.2 + 0.2;
    System.out.println(d7);//0.4 

    //  - * / on double 


  // char
    char c = 'x';
    char c2 = '1';
    char c3 = '!';
    char c4 = ' '; //space 
    //char c5 = ''; NOT OK!!!

  // booleam
  //use to set the rules!! defination!! layer to explaing more. useful
    boolean b = true;
    boolean b10 = false;
    //only can be ture or false
    // but how to use? 
    boolean isSmoker = false;
    int age = 66;
    boolean isElderly = age > 65 ; //"age > 65" -> asking if age > 65 (Yes / No question)
    System.out.println(isElderly); //ture

    int age2 = 18;
    boolean isAdult = age2 >= 18;
    System.out.println(isAdult); // ture


  }
}