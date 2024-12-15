//package questions;

public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence
    int result = 0;
    for (int i = 0 ; i <16 ; i++){
      result = i + (first - second);
      System.out.println(result);
    }

  }
}