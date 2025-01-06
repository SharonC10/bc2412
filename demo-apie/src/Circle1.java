import java.math.BigDecimal;
import java.util.Objects;
// Why do need Shape? 
public class Circle1 extends Shape{// Parent Class : color
  //Square, Triangle
  //area() -> return double 
  private double radius;

  //If you don't specify the construtor implicitly you have an empty construtor 
  
public Circle1 (char color, double radius){
  //if you don't specify "super" here.... by default implicitly you are calling super()
  super(color);// because you have "extends", you have to "super"
  this.radius = radius;
}

public double getRadius(){
  return this.radius;
}


//Override the parent given method 
// compiler will help to check if the parent class has an area() mwthod
//implicityly public for abstract method 
@Override 
public double calculateArea(){
  return BigDecimal.valueOf(getRadius())
  .multiply(BigDecimal.valueOf(Math.PI))
  .doubleValue();
}

@Override
public boolean equals(Object obj){
  if (this == obj)
  return true;
  if (!(obj instanceof Circle1))
  return false;
  Circle1 circle = (Circle1)obj;
  return Objects.equals(circle.getColor(), super.getColor())
  && Objects.equals(circle.getRadius(), this.radius);
}

@Override
public int hashCode(){
  return Objects.hash(super.getColor(), this.radius);
}

@Override
public String toString(){
  return "Circle = [" +
  "Color = " + super.getColor() + 
  " Radius = " + this.radius
  + "]";
}

public static void main(String[] args) {
  //new Circle(); after you specify a construcot , then the default 
  //construtor will be no longer exists
  Circle1 c1 = new Circle1('B', 6.0);
  System.out.println(c1.calculateArea());

  Circle1 c2 = new Circle1('B', 6.0);
  Circle1 c3 =new Circle1('R', 10);
  System.out.println(c1.equals(c2));//true
  System.out.println(c1.equals(c3));//false 
  System.out.println(c1.hashCode());//1075317695
  
  
  System.out.println(c2.hashCode());//1075317695
  System.out.println(c3.hashCode());//1076104623
  System.out.println(c1.toString());//Circle = [Color = B Radius = 6.0]
  System.out.println(c2.toString());//Circle = [Color = B Radius = 6.0]
  System.out.println(c3.toString());//Circle = [Color = R Radius = 10.0]

}

}
