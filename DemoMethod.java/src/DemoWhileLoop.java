import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.println(i);
    }

    // ! while Loop va For Loop
    // While
    int j = 2; // declar the counter outside the loop
    while (j < 3) {// continue criteria
      j++;// !2 : flecible to control the j
      j++;// u can control this,
      j++;
      System.out.println("j" + j);
      // j++
    }

    // String
    String s = "hello";
    char target = 'e';
    int count = 0;
    // boolean found = false
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == target) {
        count++;// found = true ;
      } // break; -> 搵到就停
    }
    System.out.println(count);
    // ---------------------------------------------------
    // while loop
    int k = 0;
    int result = 0;
    boolean found = false;
    while (k < s.length()) {
      if (s.charAt(k) == target) {
        found = true;
        break;
      }
      k++;
    }
    System.out.println(found);
    // Vincent
    // k usually will name smth bus meaning
    // ---------------------------------------------------

    // Random
    int number = new Random().nextInt(3);// 0-2
    System.out.println(number);
    // 1- 49 random number ->

    int markSix = new Random().nextInt(49) + 1;// 0-49
    System.out.println(markSix);

    int[] markSixArr = new int[6];
    int count2 = 0;//6 digi
    int value = 0;
    while (count2 < 6) {
      value = new Random().nextInt(49) + 1; // 49
      if (!isDuplicated(markSixArr, value)) {
        markSixArr[count2] = value;
        count2++;
      }
      // }
      // if (markSixArr[count2] == markSix){
      // count2++;
    }
    System.out.println(Arrays.toString(markSixArr));
  } // random no.

  public static boolean isDuplicated(int[] arr, int newValue) {

    boolean isDuplicated = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == newValue)
        return true;

    }
    return false;
    // ---------------------------------------------------
    //1-100

    //Game Starts:
    // bomb: 47
    //user: pick no.4
    // please pick a number 5 -100
    //user: 67
    //please pick a number 5 -66
    //user: 47
    //Bomb!
    // while loop

    

    //int userNumber = scanner.nextInt();
    
    int min = 1;
    int max = 100;
    int bomb = new Random().nextInt(100)+1;// 1-100// 10
    int input = -1; //47
    Scanner scanner = new Scanner(System.in);

    while (bomb != input){
      System.out.println("Plese pick a number between" + min + "-" + max );
      input = scanner.nextInt();
      if (input >max || input < min)
      continue;
        System.out.println("Not Found");
        
        // min , max
      if (bomb > input){
        min = input +1;
      }else {
            max = input - 1;
          }
        }
      System.out.println("Bomb!");
      Scanner close;
    
     



}
}
