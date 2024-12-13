public class ForLoop {
  public static void main(String[] args) {

    int y = 2;
    y *= 2;// x = x*2;
    System.out.println(y + " ");// =4

    // 2^10
    int c = 2;
    for (int b = 0; b < 11; b++) {
      System.out.println(c + " ");
      c *= 2;
    }

    // printing number form 1- 5
    for (int d = 0; d < 6; d++) {
      System.out.println(d);
    }

    // sum 1 -10
    int sum2 = 0;
    for (int e = 0; e < 11; e++) {
      sum2 = sum2 + e;
    }
    System.out.println("Sum = " + sum2);
    // ----55
    // 1+2+3+4+5+6+7+8+9+10 ==55

    // counting (-)
    for (int f = 10; f >= 1; f--) {
      System.out.println(f);
    } //10 ,9, 8 ,7 , 6 , 5 , 4, 3  2, 1



    // print event number

    int sum = 0;
    for (int i = 0; i <= 10; i++) {
      if (i % 2 == 0) {
        sum = sum + i;
        // sum = sum + 2 ; sum = 0 + 2; =2
        // sum = sum + 4; sum = 2 + 4; =6
        // sum = sum + 6; sum = 6 + 6; =12
        // sum = sum + 8; sum = 12 + 8; = 20
        // sum = sum + 10; sum = 20 + 10 = 30
      }
    }
    System.out.println(sum);

    int x = 1;
    x = x + 1; // 1 + 1 -> x
    x = x + 1; // 2 + 1 -> x

    // sum up 0 - 20
    int Sum2 = 0;
    for (int i = 0; i <= 20; i++) {
      Sum2 = Sum2 + i;
    }
    System.out.println(Sum2);/// 210

    for (int g = 0; g <=3 ; g ++){
      for (int h = 0 ; h <= 3 ; h ++){
        System.out.println("g: " + g +", h:" + h);
      } // is it h already lopp once 0-3???
      //so that loop g once ; mark h run once 0-3???
    }
    
    // g=0, go 1 time
    // g<=3 - > 0
    // after that: g+1
    //g=1 
    //g<=3 -> 1
    //g(1) +1 ->2
    // g: 0 ; h=0 ; <=3 ---=0
    // g: 1 ; h=1 
    // g: 2
    //h=0, h <=3, -> h+1








    // sum up all the odd (0-10)
    // sum up all the even (0-10)
    // diff (positive no.)

    int Sum3 = 0;
    int Sum4 = 0;
    for (int i = 0; i <= 10; i++) {
      if (i % 2 == 0) {
        Sum3 = Sum3 + i;
      }
    }
    System.out.println(Sum3);
    for (int i = 0; i <= 10; i++) {
      if (i % 2 == 1) {
        Sum4 = Sum4 + i;
      }
    }
    System.out.println(Sum4);

    int diff = 0;
    for (int i = 0; i < 11; i++) {
      if (Sum4 > Sum3) {
        diff = Sum4 - Sum3;
      } else {
        diff = Sum3 - Sum4;
      }
    }
    System.out.println(diff);



  }

}
