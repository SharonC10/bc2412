import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.event.ListDataEvent;

public class Ball implements Comparable<Ball> {
  public Color color;
  public int value;

  public Ball(Color color, int value) {
    this.color = color;
    this.value = value;
  }

  public Color getColor() {
    return this.color;
  }

  public int getValue() {
    return this.value;
  }


  public void setColor(Color color) {
    this.color = color;
  }

  @Override
  public int compareTo(Ball ball) {
    // compare two balls
    // this.ball (-1) , ball (1)
    // our task, lower value , return first
    // if (this.value < ball.getValue())
    // return -1;
    // return 1;
    // order by color : Red, Yellow, Blue
    // for same each color, descending order of value

    if (this.color == ball.getColor()) {
      if (this.value > ball.getValue())
        return -1;
      else
        return 1;
    } // color same
    if (this.color == Color.RED)
      return -1;
    if (ball.getColor() == Color.RED)
      return 1;
    if (this.color == Color.YELLOW)
      return -1;
    return 1;

    // if (this.color == Color.RED && this.value < ball.getValue())
    // return -1;
    // if (ball.getColor() == Color.RED )
    // return 1;
    // if(this.color == Color.BLUE && this.value < ball.getValue())
    // return -1;
    // if (ball.getColor() == Color.BLUE)
    // return 1;
    // if (this.color == Color.YELLOW && this.value < ball.getValue())
    // return -1;
    // return 1;
  }

  public static enum Color {
    RED, YELLOW, BLUE,;
  }

  @Override
  public String toString() {
    return "Ball[" + "color = " + this.color + ", value = " + this.value + "]";
  }


public static void main(String[] args) {
  // Ball list
  // red 1
  // yellow 9
  // blue 7
  // yellow 3
  // red 3

  List<Ball> balls = new LinkedList<>();
  balls.add(new Ball(Ball.Color.RED, 1));
  balls.add(new Ball(Ball.Color.YELLOW, 9));
  balls.add(new Ball(Ball.Color.BLUE, 7));
  balls.add(new Ball(Ball.Color.YELLOW, 3));
  balls.add(new Ball(Ball.Color.RED, 3));
  // Sort by Value
  //Approach 1: Comparable <Ball>  (Disadvantage: One rule for sort)

 //Ball Class comply with the contract of Collections.sort()
  //Colloections.sort 細過0 就sort
  // [Ball[color = Red, value 1]]
  System.out.println(balls);

//Approach 2: Comparator 
Comparator <Ball> sortFormula;
int x = 3;
if ( x >2 ){
  sortFormula = new SortByColor();
}
else {
  sortFormula = new SortByValue();
}

// Collections.sort(balls);
Collections.sort(balls, sortFormula);
System.out.println(balls);
//[Ball[color = YELLOW, value = 9], 
//Ball[color = BLUE, value = 7], Ball[color = YELLOW, value = 3], 
//Ball[color = RED, value = 3], Ball[color = RED, value = 1]]


}
}


