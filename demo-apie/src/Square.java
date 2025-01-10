import java.math.BigDecimal;
import java.util.Objects;

public class Square extends Shape {
  private double length;
  
  public Square (Color color,double length ){
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

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
      if (!(obj instanceof Square))
      return false;
      Square square = (Square) obj;
      return Objects.equals(square.getColor(), super.getColor())
      && Objects.equals(square.getLength(), this.length);
  }

  @Override
    public int hashCode(){
      return Objects.hash(super.getColor(), this.length);
    }

    @Override
    public String toString(){
      return "Square [" + 
      "Color = " + super.getColor() +
      " Length = " + this.length + 
      "]";
    }

  public static void main(String[] args) {
    Square s1 = new Square(Color.YELLOW ,10.0);
    s1.calculateArea();
    System.out.println(s1.calculateArea());

    Square s2 = new Square (Color.YELLOW, 10);
    Square s3 = new Square (Color.RED, 10.0);
    System.out.println(s1.equals(s2));// true 
    System.out.println(s1.equals(s3));// false 
    System.out.println(s1.hashCode());//1076104840
    
    System.out.println(s2.hashCode());//1076104840
    
    System.out.println(s3.hashCode());//1076104623
    System.out.println(s1.toString());
    System.out.println(s2.toString());
    System.out.println(s3.toString());
  }
}
