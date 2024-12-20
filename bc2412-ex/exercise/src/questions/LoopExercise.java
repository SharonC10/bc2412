import java.lang.runtime.SwitchBootstraps;
import java.math.BigDecimal;
import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    for (int i = 0; i < 6; i++) {
      System.out.println("hello");
    }

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if

    for (int i = 1; i < 21; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // 4. Print the numbers, which can be divided by 3 or 5
    // Use: for loop + if
    for (int i = 1; i < 21; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        System.out.println(i);
      }
    }

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int count = 0;
    for (int i = 0; i < 16; i++) {
      count += i;
    }
    System.out.println("sum up:" + count);

    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    int sum = 0;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 1) {
        sum = sum + i;
      }
    }
    System.out.println("sum:" + sum);

    int sum2 = 0;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        sum2 = sum2 + i;
      }
    }
    System.out.println("sum2:" + sum2);


    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    char target = 'd';
    boolean result = false;
    for (int i = 0; i < str7.length(); i++) {
      if (target == str7.charAt(i)) {
        result = true;
        break;
      }
    }
    if (result == true) {
      System.out.println("d is found.");
    } else {
      System.out.println("d is NOT found.");
    }



    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";
    boolean sub = false;
    for (int i = 0; i < s8a.length() - 1; i++) {
      if (s8a.substring(i, i + 2) == s8b) {
        sub = true;
        break;
      }
    }

    if (sub = true) {
      System.out.println("s8b is a substring.");
    } else {
      System.out.println("s8b is NOT a substring.");
    }



    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    int countP = 0;
    for (int i = 0; i < s9.length(); i++) {
      if (s9.charAt(i) == c9) {
        countP++;
      }
    }
    System.out.println("count = " + countP);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    for (int i = 0; i < arr10.length; i++) {
      arr10[i] = arr10[i].replace("x", "k");
    }
    System.out.println(Arrays.toString(arr10));


    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
    int count10 = 0;
    for (int i = 0; i < s11.length(); i++) {
      if (s11.charAt(i) == s11.toUpperCase().charAt(i)) {
        count10++;
      }
    }
    System.out.println("count uppercase = " + count10);

    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print("*");
      }
      System.out.println("*");
    }

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";
    int score = 0;

    for (int i=0; i < s13.length(); i++){
      
      switch (s13.charAt(i)) {
      case 'l': {
        score += 1;
      }
      break;

      case 'r': {
        score = score + 3;
      }
      break;

      case 'd': {
        score = score + 2;
      }
      break;

      case 'u': {
        score = score + 4;
      }
      break;

      default: {
        score = score - 1;
      }
    }       
    } 

    System.out.println("score: " + score);



    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];
    arr14[0] = 1L;
    arr14[1] = 4L;
    arr14[2] = 9L;
    arr14[3] = -4L;

    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    long min = Integer.MAX_VALUE;
    long max = Integer.MIN_VALUE;
    for (int i = 0; i < arr14.length; i++) {
      if (arr14[i] < min) {
        min = arr14[i];
      } else if (arr14[i] > max) {
        max = arr14[i];
      }
    }
    System.out.println("max:" + max);
    System.out.println("min:" + min);

    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6
    float[] arr16 = new float[] {0.2f, 0.3f, 0.6f};


    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    // bigDemo
    
    BigDecimal q17 = BigDecimal.valueOf(0.1d);
    float q17r = BigDecimal.valueOf(0.6d).add(BigDecimal.valueOf(0.1d)).floatValue(); // 0.7


    for (int i = 0 ; i < arr16.length; i++){
      double value = (double) 0.6f;
      System.out.println(value);
      arr16[i] = BigDecimal.valueOf(value).add(BigDecimal.valueOf(0.1d)).floatValue();
    }
    System.out.println(Arrays.toString(arr16));


    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    // String target = "Tommy";
    // Print "count name=2"
    int count18 = 0;
    String target2 = "Tommy";

    for (int i = 0; i < arr18.length; i++) {
      if (arr18[i] == target2) {
        count18++;
      }
    }
    System.out.println("count name = " + count18);

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";
    // char [] arr19 = new char [s19.length()];
    // int minIndex = -1;
    // int maxIndex = -1;
    int max2 = Integer.MIN_VALUE;
    int min2 = Integer.MAX_VALUE;


    char[] arr19 = new char[s19.length()];
    for (int i = 0; i < s19.length(); i++) {
      // arr19[i] = s19.charAt(i);
      if (s19.charAt(i) > max2) {// arr19[i] > max{
        max2 = s19.charAt(i);// max = arr19[i]
      } // maxIndex = i;
        // }
        // if (arr19[i] < min){
        // min = arr19[i];
        // minIndex = i;}

      // swap
      // char temp19 = ' ';
      // temp19 = arr19[maxIndex];
      // arr19[maxIndex] = arr19 [minIndex];
      // arr19[minIndex] = temp19;
      // System.out.println(String.valueOf(arr19));

    } // System.out.println(s19.);
    System.out.println(String.valueOf(max2));

    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 =
        new String[] {"python", "array", "programming", "java", "bootcamp"};
    String longest = "";

    for (int i = 0; i < arr20.length - 1; i++) {
      if (arr20[i].length() > arr20[i + 1].length()) {
        longest = arr20[i];
      }

    } System.out.println("longest = " +longest);

    // 17,19
    // ---------------------------------------
    // 17:未解決



    // 19:
  }
}
