public class Calculator {
  private int x; 
  private int y;

  public Calculator(int x , int y){
    this.x = x;
    this.y = y;
  }

  //
  public int sum (int thirdNumber){
    System.out.println("sum (int thirdNumber)");
    return this.x + this.y + thirdNumber;
  }

  public int sum (double thirdNumber){
    System.out.println("sum (double thirdNumber)");
    return this.x + this.y + (int) thirdNumber;
  }
  
  public static void main(String[] args) {
    Calculator c1 = new Calculator(3, 4);
    System.out.println(c1.sum(0));//7
    System.out.println(c1.sum(8)); //15
    System.out.println(c1.sum(8.0));
    //Static Polymorphism 
    //During complie time, Java check the method call by method signature.

  }
}
