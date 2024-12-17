import java.util.Scanner;

public class DemoScanner {
  public static void main (String [] args){
//Jaca Project (load built-in tools, String, Primitives)
//proactively import non-built-in tools (Scanner)

    //String 
    String s = "abc";
    
    
    //Scanner
    Scanner scanner = new Scanner(System.in);
    System.out.println("Plese input a number:");
    int day = scanner.nextInt();//scanner.next
    //num = 20;
    System.out.println("num" + day);

    // i want to print "hello", 
    // for (int i = 0 ; i < num ; i ++){ 
    //   // i is help you to count the no.
    //   //
    //   System.out.println("hello"); //
    // }




    



    //num -> number of days
    // for loop
    // total hours  5* 24hours for day
    // 24,48,72....

    int totalHours = 0;
    for (int i = 0 ; i < 5 ; i++){
      totalHours += 24;
    }
      System.out.println("totalHours:" +totalHours);
    
    //num -> number of days
    int totalMinutes = 0;
    for (int i = 0; i < day; i++){
      for(int j = 0 ; j <  ; j++){

      }
    
    }



  }
}