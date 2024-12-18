public class DemoMethod {
   // !sum (int x, int y) -> input parameters
   // !int -> return type
   public static int sum(int x, int y) {
      int result = x + y;
      return result; // the return value should align the return type
   }

   // Java doesn't allow "different type" for the same method signature
   // public static long sum(double a, int b){
   // return 1;
   // }



   //
   // ! Not Allowed: Same Method Signature
   // "sum(int a, int b)" = sum(int x, int y)
   // Same method name + Same Parameter List
   // not allowed two "sum"
   // public static int sum1(int a, int b){
   // return 1;
   // }

   public static double sum1(int a, double b) {
      return 1;
   }

   public static double sum1(double a, int b) {
      return 1;
   }

   public static double sum1(double a, double b) {
      return a + b;
   }

   // 18/12
   public static int sum(int a, String b) {
      return a + Integer.valueOf(b);
   }
   // customer can give u String
   // u need to convert String to int value
   // String value of -> int turn to String
   // Integer value of -> turn to int / double.
   // int + int = int, int -> double
   //-----------------------------------------------
   public static int totalMinutes(int day){
      int minutes = 0;
      for (int i = 0; i <day ; i++){
         for (int j = 0; j < 24; j++){
            minutes += 60;
         }
      } 
      return minutes;
   }

   //*** 
   public static int countEven (int []arr){
      int count = 0;
      for (int i=0; i <arr.length; i++){
         if (arr[i] % 2 == 0){
            count++;
         }
      }
      return count;
   }
// long and int is different type

   public static int countEven (long []arr){//long
      int count = 0;
      for (int i=0; i <arr.length; i++){
         if (arr[i] % 2 == 0){
            count++;
         }
      }
      return count;
   }



   public static double sum2(double x2, double y2) {
      double result = x2 * y2;
      return result;
   }

   public static double subtract(double vincent, double lucas) {
      return vincent - lucas;
   }

   public static int sum3(int one, int tow) { // 收依兩個index
      int result = one / tow;
      return result;
   }

   // source - "hello"
   // target 'l'
   // reture ->2
   public static int countCharacter(String source, char target) {
      // toCharArray ->
      // 依個係seareching
      // return type -> int
      // 收左D野返尼，String嘅source, char嘅target
      int chr = 0;
      for (int i = 0; i < source.length(); i++) {
         if (source.charAt(i) == target)
            chr++;// 記低數左幾多次
      }
      return chr;//
   }


   public static void main(String[] args) {
      System.out.println("Hello, World!");
      int x = 3;
      int a = 10;
      int b = 11;
      int y = a + b;

      System.out.println(y);// 21

      a = 19;
      b = 21;
      y = a + b;
      System.out.println(y); // 40

      // call sum () method
      y = sum(10, 11);
      System.out.println(y);// 21
      y = sum(19, 21);
      System.out.println(y);// 40

      double y2 = a + b;
      y2 = sum2(3.0, 2.0);
      System.out.println(y2); // 6.0

      // 直接call
      System.out.println(subtract(100, 98));// 100.0 -98.0 = 2.0
      System.out.println(countCharacter("hello", 'l')); // 2
      System.out.println(countCharacter("abc", 'a')); // 1

      sum1(1, 2.0); // -> sum (int x , double y)
      sum(1, 2); // sum (int, int y)
      sum(1, 2); // sum (double , int y)
      sum(2, "123");
      System.out.println(sum(2, "123"));

      System.out.println(countEven(new long[]{ 1L, 3L, 2L, 6L})); //2
      System.out.println((new int [] {1,3,2,6})); //2
      

   }
}
