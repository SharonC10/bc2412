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
    char character = (char)ascii; //downcasting
    System.out.println(character);

  }
}


