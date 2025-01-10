import java.math.BigDecimal;

public class Square2 implements Shape2{
  private double length;

  public Square2 (double length){
    this.length = length;
  }

  @Override 
  public double area(){
    return BigDecimal.valueOf(this.length)
    .multiply(BigDecimal.valueOf(this.length))
    .doubleValue();
  }

  public static void main(String[] args) {
    Square2 square = new Square2(6);
    square.area();
    square.calculate();
    System.out.println(square.area()); //36
    System.out.println(square.calculate()); //36 +3 = 39

  }
}
