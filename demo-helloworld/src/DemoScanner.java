import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    // Jaca Project (load built-in tools, String, Primitives)
    // proactively import non-built-in tools (Scanner)

    // String
    String s = "abc";


    // Scanner
    Scanner scanner = new Scanner(System.in);
    System.out.println("Plese input a number:");
    int day = scanner.nextInt();// scanner.next
    // num = 20;
    // num = num * 2;
    // System.out.println("num = " + num); //String + int = String
    System.out.println("num" + day);

    // scanner.nextLine()
    // ----> if need to use String

    // System.out.println("Please input a String:");
    // String str = scanner.nextLint();
    // System.out.println("str =" + str);



    // if use scanner input number= 10;
    // i want to print "hello",
    // if input 3
    //hello print 3 times

    // for (int i = 0 ; i < num ; i ++){
    //  i is help you to count the no.
    // System.out.println("hello"); //
    // }



    // num -> number of days
    // for loop
    // total hours 5* 24hours for day
    // 24,48,72....

    int totalHours = 0;
    for (int i = 0; i < day; i++) {
      totalHours += 24;
    }
    System.out.println("totalHours:" + totalHours);

    // num -> number of days
    int totalMinutes = 0;
    for (int i = 0; i < day; i++) {
      for (int j = 0; j < 24; j++) {

      }

    }



  }
}
