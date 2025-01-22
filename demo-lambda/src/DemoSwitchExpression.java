public class DemoSwitchExpression {
  public static void main(String[] args) {
    //1. Switch + Lanmbda 
    System.out.println(getColorValue(Color.RED)); //R
    System.out.println(getColorValue2(Color.RED));//Red.

  }
  public static char getColorValue(Color color) {
    return switch (color){
      case RED -> 'R';
      case YELLOW -> 'Y';
      case BLUE -> 'B';
    };
  }

  public static String getColorValue2(Color color) {
    return switch (color){
      case RED -> {
        yield "Red."; //yield ---> same as (return), just a new keyword 
      }
      case YELLOW -> {
        yield "Yellow.";
      }
      case BLUE -> {
        yield "Blue.";
      }
    };
  } 

  //new Switch advantage:
  //Notice if you cover all the enum
  //Notice if you duliplicate

  public static enum Color{
    RED, 
    YELLOW,
    BLUE,
    ;
  }
}
