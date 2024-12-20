import java.util.Arrays;

public class mytest {
  public static void main(String[] args) {
    int sum3 = 0;
    for (int i = 0; i <= 10; i++) {
      if (i % 2 == 1) {
        sum3 = sum3 + i;
      }
    }
    System.out.println(sum3);



    int sum4 = 0;
    for (int i = 0; i <= 10; i++) {
      if (i % 2 == 0) {
        sum4 = sum4 + i;
      }
    }
    System.out.println(sum4);


    int oddSum = 0;
    int evenSum = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 1) {
        oddSum = oddSum + i;
      } else {
        evenSum = evenSum + i;
      }
    }
    int diff = 0;
    if (oddSum > evenSum) {
      diff = oddSum - evenSum;
    } else {
      diff = evenSum - oddSum;
    }
    System.out.println(diff);// 5


    // int diff = oddSum > evenSum ? oddSum - evenSum : evenSum - oddSum;
    // System.out.println(diff): //5
    // true : false
    // another if else

    String str = "hello";
    char ch = str.charAt(4);
    System.out.println(ch);

    String str2 = "hello, world";
    String substr1 = str2.substring(7);
    System.out.println(substr1);

    int ascii = 65;
    char character = (char) ascii; // downcasting
    System.out.println("character = " +character);

    int sum = 0;
    int[] arr4 = new int[] {3, 10, 11};
    for (int i = 0; i < arr4.length; i++) {
      sum = sum + arr4[i];
    }
    System.out.println("sum:" + sum);

    String[] arr5 = new String[] {"abc", "def", "ijk"};
    String target = "ijk";
    boolean isIjk = false;
    for (int i = 0; i < arr5.length; i++) {
      if (target.equals(arr5[i])) {
        isIjk = true;
      }
    }
    System.out.println("isIjk:" + isIjk);

    int temp3 = 0;
    int[] arr7 = new int[] {9, -8, 109, 99, 98};
    for (int i = 0; i < arr7.length-1; i++){
      //i = 0-4only; arr7.length -> 1-5;
      //arr7.length - 1 -> 1-4
      if (arr7[i] > arr7[i +1]){
        temp3 = arr7[i];
        arr7[i] = arr7[i+1];
        arr7[i+1] = temp3;
      }
    }System.out.println(Arrays.toString(arr7));

  }
}


