import java.math.BigDecimal;

public class Circle extends Shape{// Parent Class : color
  //Square, Triangle
  //area() -> return double 
  private double radius;
  
public Circle (char color, double radius){
  super(color);
  this.radius = radius;
}

public double getRadius(){
  return this.radius;
}

public double calculateArea(){
  return BigDecimal.valueOf(getRadius())
  .multiply(BigDecimal.valueOf(Math.PI))
  .doubleValue();
}

public static void main(String[] args) {
  Circle c1 = new Circle('B', 6.0);
  System.out.println(c1.calculateArea());
}

}
