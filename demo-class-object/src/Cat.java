import java.math.BigDecimal;

public class Cat {
  // static method can be placed to any class.
  private int age;
  public static int availableStock = 0;

  public static double calculateArea2(double radius) {
    // System.out.println(this.age);
    return BigDecimal.valueOf(radius) //
        .multiply(BigDecimal.valueOf(radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }
  
  // Cat.totalInterestAfterYears(x,x,x);
  // new Cat().totalInterestAfterYears(x,x,x);
  public static double totalInterestAfterYears(double principle,
      double annualInterestRate, int numOfYears) {
    return BigDecimal.valueOf(principle) //
        .multiply(BigDecimal
            .valueOf(Math.pow(1 + annualInterestRate / 100.0, numOfYears)))
        .subtract(BigDecimal.valueOf(principle)) //
        .doubleValue();
  }

  public static void move(Supermarket from, Supermarket to, Worker worker, int quantity, boolean isMoveIn) {
    
  }

  public static void main(String[] args) {
    // System.out.println(Cat.calculateArea2(3.0));
    Cat c1 = new Cat();
    new Cat(); // obsoleted object after created
    Cat c2 = c1; // 2 object reference point to same object

  }
}