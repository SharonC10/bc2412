import java.math.BigDecimal;

public class Square extends Shape {
  private double length;
  
  public Square (char color,double length ){
    super(color);
    this.length = length;
  }

  public double getLength(){
    return this.length;
  }

  public double calculateArea(){
    return BigDecimal.valueOf(getLength())
    .multiply(BigDecimal.valueOf(getLength()))
    .doubleValue();  
  }

  public static void main(String[] args) {
    Square s1 = new Square('Y' ,10.0);
    s1.calculateArea();
    System.out.println(s1.calculateArea());
  }
}
