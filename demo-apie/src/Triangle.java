import java.math.BigDecimal;

public class Triangle extends Shape {
  private double higth;
  private double length;

  public Triangle (char color, double higth, double length){
    super(color);
    this.higth = higth;
    this.length = length;
  }

  public double getHigth(){
    return this.higth;
  }
  public double getLength(){
    return this.length;
  }

  public double calculateAreaT(){
    return BigDecimal.valueOf(getLength())
    .multiply(BigDecimal.valueOf(getHigth()))
    .divide(BigDecimal.valueOf(2)).doubleValue();
  }

  public static void main(String[] args) {
    Triangle t1 = new Triangle('R',10, 50);
    System.out.println(t1.calculateAreaT());
  }
}
