//package questions;

public class JavaQuest4 {
  /**
   * Exercise: Print 10 numbers: they must be even and > 0, and divisible by 3
   * and divisible by 2 (Search it from 1)
   * 
   * Expected Output: 6 12 18 24 30 36 42 48 54 60
   */
  public static void main(String[] args) {
    // Print first ten numbers, which fulfill the followings criteria:
    // 1. Even numbers
    // 2. Divisible by 3
    // 3. > 0
    int count = 0;
    for (int i = 1; i < 100; i++) {
      // code here ...
      if ( i %3 == 0 && i % 2 ==0 ){
        count++ ;

        System.out.println( i);}
       //點樣
    } ;
    

    
    
    

    

  }
}