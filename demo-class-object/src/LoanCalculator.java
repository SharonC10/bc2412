import java.math.BigDecimal;
import java.math.RoundingMode;

public class LoanCalculator {//attributes
  private double principle;
  private double annualInterestRate;
  private int numOfYear;
// OOPs 

  // ----------------------------------------------------
  //Construtor
  public LoanCalculator(double principle, double annualInterestRate,int numOfYear) {
    this.principle = principle;
    this.annualInterestRate = annualInterestRate;
    this.numOfYear = numOfYear;
  }

  // ----------------------------------------------------
  // instance method 計數
  // totalInterestAfterYears()
  // principle * (annuaInterestRate ^ numOfYear) = totalInterest
  public double totalInterestAfterYears() {
    return BigDecimal.valueOf(this.principle)
        .multiply(BigDecimal.valueOf(Math.pow(1+ this.annualInterestRate /100 , this.numOfYear)))
        .subtract(BigDecimal.valueOf(this.principle))
        .doubleValue();
  }

  // ----------------------------------------------------
  // Static method
public static double totalInterestAfterYears
(double principle, double annualInterestRate, 
int numOfYear) {
  return BigDecimal.valueOf(principle)
        .multiply(BigDecimal.valueOf(Math.pow(1+ annualInterestRate /100 , numOfYear)))
        .subtract(BigDecimal.valueOf(principle))
        .doubleValue();
}

  public static void main(String[] args) {
 // ----------------------------------------------------
    //Presentation
    LoanCalculator l1 = new LoanCalculator(10_000, 2.0, 2); //404.0
    System.out.println(l1.totalInterestAfterYears());
    
    //below
    System.out.println(LoanCalculator.totalInterestAfterYears(10_000, 2.0, 2)); //404.0
    //SysOut Formula -> using Static method 
    //the data not in the object.

  }
}
