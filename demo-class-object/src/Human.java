import java.math.BigDecimal;
import java.math.RoundingMode;

public class Human {
  private double height;// instance variable -> object's variable
  private double weight;

  // ----------------------------------------------------
  // Construtor
  public Human(double height, double weight) {
    this.height = height;
    this.weight = weight;

  }
  // ----------------------------------------------------


  // instance method
  // can call this, able to call object attribute
  public double bmi() {
    // System.out.println(Math.pow(this.height))
    return BigDecimal.valueOf(this.weight)//
        .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2,
        //Math.pow -> (double a ,double b) b ->2.0 = 二次方(*2)
            RoundingMode.HALF_UP)
        .setScale(2, RoundingMode.HALF_DOWN)//
        .doubleValue();
  }

  //New!!
  public String bmiIndex() {
    double bmiValue = this.bmi();
    if (bmiValue > 35.0) {
      return "Extremely Obese";
    } else if (bmiValue >= 30.0 && bmiValue < 35) {
      return "Obeses";
    } else if (bmiValue >= 25.0 && bmiValue < 30) {
      return "Overweight";
    } else if (bmiValue > -18.5 && bmiValue < 25) {
      return "Normal";
    } else {
      return "Under Weight";
    }
  }

  // ----------------------------------------------------
  // Static method
  public static double bmi2(double weight, double height) {
    return BigDecimal.valueOf(weight)//
        .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2,
            RoundingMode.HALF_UP)
        .setScale(2, RoundingMode.HALF_DOWN)//
        .doubleValue();
  }

  // Under Weight (<18.5)
  // Normal (18.5 - 24.9)
  // Overweight (25.0 - 29.9)
  // Obese (30.0 - 34.9)
  // Extremely Obese (>35.0)
  // ----------------------------------------------------
  public static void main(String[] args) {

    Human h1 = new Human(1.74, 68);
    System.out.println(h1.bmi());
    // non-terminating decimal expansion;//22.46
    System.out.println(h1.bmiIndex());
    System.out.println(Human.bmi2(68, 1.74));



  }

}
