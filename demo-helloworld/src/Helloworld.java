public class Helloworld {
  public static void main (String[]args){
    // Comment. Welcome to bootcamp! Notes here!
    // ! 1. Data Type (Primitive)
    // int -> Integer
    int x = 3; // from right to left.
    int dayOfWeek = 7;
    // int y = 3.2; // ! nok OK, y is a variable that can store integer only.

    double y2 = 3.2;
    // double 2w = 10.0 // ! not OK

    // variable Java naming convension
    // caml case : dayOfWeek, y2(cannot start from number)

    // Re-assignment 
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







  }
}