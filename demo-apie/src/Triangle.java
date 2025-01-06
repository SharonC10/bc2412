import java.math.BigDecimal;
import java.util.Objects;
import javax.naming.event.ObjectChangeListener;

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

  @Override
  public boolean equals(Object obj){
    if (this == obj)
    return true;
    if (!(obj instanceof Triangle))
    return false;
    Triangle triangle = (Triangle) obj;
    return Objects.equals(triangle.getHigth(), this.higth) 
    && Objects.equals(triangle.getLength(), this.length)
    && Objects.equals(triangle.getColor(), super.getColor()); 
  }

  @Override
  public int hashCode(){
    return Objects.hash(super.getColor(), this.higth, this.length);
  }

  @Override
  public String toString(){
    return "Triangle [" +
    "Color = " + super.getColor() +
    " Higth = " + this.higth +
    " Length = " + this.length +
    " ]";
  }

  public static void main(String[] args) {
    Triangle t1 = new Triangle('R',10, 50);
    System.out.println(t1.calculateAreaT());
    System.out.println(t1);

    Triangle t2 = new Triangle('R', 10, 50);
    System.out.println(t1.equals(t2));//true
    System.out.println(t1.hashCode()); //78030897
    System.out.println(t2.hashCode()); //78030897
  }
}
