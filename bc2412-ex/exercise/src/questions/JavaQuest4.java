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
    int result = 0;
   
    for (int j = 1; j < 100; j++) {
      // code here ...
      if ( j %3 == 0 && j % 2 ==0 ){
      //result = result + i;?????????
        System.out.println(j);
      } //點樣淨係output 10 個？
    } 
  
    
    

    

  }
}
