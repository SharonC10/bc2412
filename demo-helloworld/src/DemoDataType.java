public class DemoDataType {
  public static void main(String[] args) {
    // Comment. Welcome to bootcamp! Notes here!
    // ! 1. Data Type ( 8 Primitives)
    // double, float, long, int, short, byte, booleam, char

    // 1.1 int -> Integer 整數
    int x = 3; // from right to left.由右至左睇
    int dayOfWeek = 7;
    // int y = 3.2; // ! not OK, y is a variable that can store integer only.
    

    double y2 = 3.2;
    // example .
    // double 2w = 10.0
    // ! not OK
    // caml case : dayOfWeek, y2(cannot start from number)

    // variable Java naming convension


    // Re-assignment
    // we cannot use the declared the name twice
    // Step 1. declaration
    // Step 2. value assignment
    // but only can declare the name once, not twice
    x = 101; // Re-assignment 101 to x
    x = x + 10; // right 101 + 10, left: assign 111 to x
    x = x - 40; // 111 - 40 = 71
    x = x * 3; // 71 * 3 = 213
    x = x / 213; // 213/213

    // print out (ln: small L) ---Q1
    System.out.println(x); // 1



    x = x + 8 * 2 / 4 + 1;
    // 8 * 2
    // 16 / 4 -> 4 + 1 + x (1)
    // 6
    System.out.println(x); // -------Q2 (6)

    x = (x + 2) * 2 / (3 + 1); // 4-------Q3
    System.out.println(x);

    x = ((x + 3) / (6 + 1)) * (x + 1);
    System.out.println(x);// ----------Q4
 double hi = 2.3 * 3;
 System.out.println(hi);
 double ho = 10.0 * 3;
 System.out.println(ho);

 
 
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
    System.out.println(x3); // 1.0----------Q5

    double x4 = 3.0 / 2;
    // Step 1: 3.0 -> double value, 2 -> int value
    // Step 2: double value / int value -> double value
    // Step 3: 3.0 /2 -> 1.5
    // Step 4: assign 1.5 (double value) to dounle type variable
    System.out.println(x4); // 1.5---------Q6


    // int f = 10 / 0;
    // System.out.println(f); // !error
    // System connot run! even after this have anothe form below

    // 0 /10
    System.out.println(0 / 10);// 0---------Q7
    //System.out.println( (3+3)*4/6-3);


    // Same as below: int / double = double value
    double x5 = 3 / 2.0;
    System.out.println(x5);// ----------Q8

    // divide by 0


    // int x6 = 3.0 / 2;
    // Step 1: 3.0 -> double value, 2 -> int value
    // Step 2: double value / int Value -> double value
    // Step 3: 3.0 /2.0 -> 1.5
    // Step 4: assign 1.5 (double value) to int type variable(downcasting)
    // ! Not allow assign a higher level value to lower value type of variable

    double x6 = 3.0 / 2;
    System.out.println(x6);// -----------Q9 (1.5)


    // int -> double (upcast)
    // double -> int (downcast)

    // ! Store Integer. Java: int, byte, short, long

    int value = 1000000;
    int value2 = 1_000_000;
    int maxInteger = 2_147_483_647;
    // bank balance connot use, money $
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
    // 2_147_483_648 -> int value
    // int value -> double type variable
    long l3 = 100;
    System.out.println(l3);// ---------Q10
    long l4 = 2147483647;
    System.out.println(l4); // ------------_Q11
    long l5 = 10000000000L;



    long l1 = 2_147_483_648L; // "L" -> declare it is a long value
    // int value 2_147_483_648
    // !declare a hardcode long value, you should always add "L"
    // Step 1: declare an int value (Not OK)
    long l2 = 2_147_483_648L; // "L" -> declare it is a long value



    // double vs float
    double d1 = 10.2; // 10.2 -> double value
    double d2 = 10.2d; // 10.2d -> same double value
    // double better than float, double more

    float f1 = 10.2f; // 10.2f -> float value
    // if not add "f", it will be think of double
    float f2 = 100000000000000000000000.22222222222222222222222f;

    // convention
    float f4 = 10.2f;
    double d3 = f4; // assign float value to double values -> safe
    // as "double a boss", can eat float value
    // float f5 = d3; //! not safe

    double d4 = 10.2f; // upcastin (float -> double )
    // normolly not doing this,

    double d5 = f4 + 10.2d;
    // float + double = double
    System.out.println(d5);// 0.399999809265136

    double d6 = 0.2 + 0.1;
    System.out.println(d6);// 0.30000000000000004 (error?????)

    float d8 = 0.2f + 0.1f;
    System.out.println(d8);// 0.3!!

    double d7 = 0.2 + 0.2;
    System.out.println(d7);// 0.4

    // - * / on double


    // char
    char c = 'x';
    char c2 = '1';
    char c3 = '!';
    char c4 = ' '; // space
    // char c5 = ''; NOT OK!!!

    // booleam
    // use to set the rules!! defination!! layer to explaing more. useful
    boolean b = true;
    boolean b10 = false;
    // only can be ture or false
    // but how to use?
    boolean isSmoker = false;
    int age = 66;
    boolean isElderly = age > 65; // "age > 65" -> asking if age > 65 (Yes / No question)
    System.out.println(isElderly); // ture

    int age2 = 18;
    boolean isAdult = age2 >= 18;
    System.out.println(isAdult); // ture


// 13/12/24
    // char
    char q = 'a';
    int u = q;
    System.out.println(u); // 97
    // why cha value can be assigned to int?
    // cause char -> int
    // char bigger then int (char is the boss) safe

    char q2 = 97;
    System.out.println(q2); // a
    // char q3 = 70000;


    // ASCII code (0 - 127)
    // a -> 97
    // b-> 98
    // c -> 99
    // print 48 -> 0, 65 -> A , 97 -- >a
    char yy = '0';
    int xx = yy;
    System.out.println(xx);

    char tt = 48;
    System.out.println(tt);

    char q3 = 48;
    System.out.println(q3);
    int u3 = q3;
    System.out.println(u3);

    char q4 = 65;
    System.out.println(q4);
    int u4 = q4;


    // char q3 = 70000; -> out of the range of char value
    // int -> char not safe
    // but only the code with limited number can be. ~ 60000

    char q5 = 10000;
    System.out.println(q5);
    char q6 = '你';
    int u6 = q6;
    System.out.println(u6);// 20320
    // byte -> short-> int -> long-> float -> double
    float f11 = 97;
    double d11 = 97;
    // char -> int
    // char -> int -> long -> float -> long

    long l10 = 'a';
    float f10 = 'a';
    double d10 = 'a';
    System.out.println(l10);



  }
}
