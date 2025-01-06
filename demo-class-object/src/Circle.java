import java.math.BigDecimal;

public class Circle {
  private double radius;//attributes
  
//-------------------------------------------------
 

    //Construtor
    public Circle (double radius){
      this.radius = radius;
    }
//-------------------------------------------------
    //getter
    public double getRadius(){
      return this.radius;
    } 
//-------------------------------------------------
    //setter 
    public void setRadius(double radius){
      this.radius = radius;
    }
//-------------------------------------------------

//instance method ???
    public double calculateArea(){
      return BigDecimal.valueOf(this.radius)
      .multiply(BigDecimal.valueOf(this.radius)).
      multiply(BigDecimal.valueOf(Math.PI)).doubleValue(); //BigDecimal
    }
    //another method
    //return this.radius * this.radius * Math.PI;

//-------------------------------------------------
    //static method 
    public static double calculateArea2(double radius){
      return BigDecimal.valueOf(radius).multiply(BigDecimal.valueOf(radius)).
      multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
    }
    
    //Static method vs Instance method
    //Static method is input the 'radius' by your own 
    
    // -> Instance method is already get the 'radius' from the object <-

    public static void main (String [] args){

//-------------------------------------------------
      Circle1 c1 = new Circle1(3.0);
      //Presentation
      System.out.println(c1.calculateArea());//~28.27

      //Formula
      System.out.println(Circle1.calculateArea2(3.0));//~28.27









      //BMI
      //w / hX2



  }
  
}
