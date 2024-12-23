import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    
    double result = 0.2 + 0.1;
    System.out.println(result);// 0.300000000000004
    if (result == 0.3) {
      System.out.println("Result is 0.3.");
    } else {
      System.out.println("Result is NOT 0.3.");// Result not!!
    }


    // Solution: BigDeciaml
    BigDecimal bd1 = BigDecimal.valueOf(0.2);
    BigDecimal bd2 = BigDecimal.valueOf(0.1);

    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3.doubleValue());// 0.3
//--------------------------------------------
    System.out.println(0.3 - 0.1);// ---------0.19999999999999998
    // substract
    BigDecimal bb1 = BigDecimal.valueOf(0.3);
    BigDecimal bb2 = BigDecimal.valueOf(0.1);
    BigDecimal bb3 = bb1.subtract(bb2);
    System.out.println(bb3.doubleValue());// ------------0.2
    // System.out.println(bb3.intValue()); -> 0
    //--------------------------------------------

    System.out.println(0.1 * 0.2);// 0.020000000000004
    // multiply
    BigDecimal bd7 = BigDecimal.valueOf(0.1);
    BigDecimal bd8 = BigDecimal.valueOf(0.2);
    BigDecimal bd9 = bd7.multiply(bd8);
    System.out.println(bd9.doubleValue());// 0.02

    System.out.println(0.3 / 0.1);// 2.99999999999996
    // divide
    BigDecimal bd10 = BigDecimal.valueOf(0.3);
    BigDecimal bd11 = BigDecimal.valueOf(0.1);
    BigDecimal bd12 = bd10.divide(bd11);
    System.out.println(bd12.doubleValue());// ------3.0

    // 10/3
    BigDecimal bd13 = BigDecimal.valueOf(10);
    BigDecimal bd14 = BigDecimal.valueOf(3);
    // BigDecimal bd15 = bd13.divide(bd14);//Non-terminating decimal expansion
    // Java 唔容許無盡數目
    BigDecimal bd15 = bd13.divide(bd14, BigDecimal.ROUND_DOWN);// round-down 4捨五入
    System.out.println(bd15.doubleValue());

    BigDecimal bd16 =
        BigDecimal.valueOf(4.565).setScale(2, RoundingMode.HALF_DOWN);
    // BigDecimal bd16 = BigDecimal.valueOf(4.565).setScale(2, RoundingMode.HALF_UP);
    // System.out.println(bd16.doubleValue());//4.56 五捨六入, 第二個小數點後 五捨六入
    System.out.println(bd16.setScale(2, RoundingMode.HALF_DOWN));

    BigDecimal bd17 =
        BigDecimal.valueOf(4.566).setScale(2, RoundingMode.HALF_DOWN);
    // BigDecimal bd17 = BigDecimal.valueOf(4.566).setScale(2, RoundingMode.HALF_UP);
    System.out.println(bd17.setScale(2, RoundingMode.HALF_DOWN));// 4.57 五捨六入, 第二個小數點後 五捨六入
    System.out.println(bd17.setScale(2, RoundingMode.HALF_UP));


    BigDecimal bd18 =
        BigDecimal.valueOf(4.56).setScale(1, RoundingMode.HALF_UP);
    System.out.println(bd18.doubleValue());// 4.57 五捨六入, 第二個小數點後 五捨六入
    BigDecimal bd19 =
        BigDecimal.valueOf(4.56).setScale(1, RoundingMode.HALF_DOWN);
    System.out.println(bd18.doubleValue());// 4.57 五捨六入, 第二個小數點後 五捨六入

    double length = 4.2;
    double squarArea = BigDecimal.valueOf(length)
        .multiply(BigDecimal.valueOf(length))
        .doubleValue();
    System.out.println(squarArea);

    // Math
    double pi = 3.14159;
    double radius = 4.5;
    double circleArea = BigDecimal.valueOf(radius)
    .multiply(BigDecimal.valueOf(radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
    System.out.println(circleArea);//63.61725123519331

    circleArea = BigDecimal.valueOf(Math.pow(radius, 2.0))//二次方
    .multiply(BigDecimal.valueOf(Math.PI))//
    .doubleValue();
    System.out.println(circleArea);//63.61725123519331

    int x =8;
    int y =9;
    int max = Integer.MIN_VALUE;
    max = Math.max(x, max);
    max = Math.max(y, max);

    int []arr = new int []{10, 9 , 3};
    max = Integer.MIN_VALUE;
    for ( int i = 0; i <arr.length; i++){
      max =Math.max(arr[i], max);
    }
      // Math min()
      //System.out.println(sqrt.(9));
      System.out.println(10);
      System.out.println("circleArea" + circleArea); 

      //round() -> nearest to integer
      double u = 3.456;
      System.out.println(Math.round(u));//3

      double u2 = 3.556;
      System.out.println(Math.round(u2));
      
      ////Nearest 2 d.p. -> 3.46
      System.out.println(Math.round(u *100.0 ) / 100); //3.46


    
    System.out.println(Math.round(-9L)); //9








  }
}
