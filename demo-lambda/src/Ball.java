public class Ball {
  private int value;

  public Ball addValue(int value){
    this.value += value;
    return this;
  }

  public int getValue(){
    return this.value;
  }

  public static void main(String[] args) {
    Ball ball = new Ball();
    ball = ball.addValue(0);
  }
}
