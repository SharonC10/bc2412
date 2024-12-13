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
    int num = scanner.nextInt();//scanner.next
    //num = 20;
    System.out.println("num" + num);

    // i want to print "hello", 
    for (int i = 0 ; i < num ; i ++){ 
      // i is help you to count the no.
      //
      System.out.println("hello"); //
    }




    



    //num -> number of days
    // for loop
    // total hours  5* 24hours for day
    // 24,48,72....

    int totalHours = 0;
    for (int i = 0 ; i <= 5 ; i++){
      totalHours += i;
    }
      System.out.println(totalHours);
    

    //int totalMinutes = 0;
    //for (int d = 0; d < day; d++){
      //for(int j = 0 ; j < hours ; j++){

      //}
    
    //}



  }
}