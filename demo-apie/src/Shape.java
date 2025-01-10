public abstract class Shape {
  //abstract class vs class
  //1. CANNOT create object for abstract class
  //愈精準愈好 E.g.沒有Shape 所以要abstract 避免有人call左 
  //封左自己成為Object嘅可能性
  //2. they are both wirh common attribute for child class
  //3. abstract class 's constructor is for child class to "super"

  private Color color;
 

  public Shape (Color color){
    this.color = color;
  }


  public Color getColor(){
    return this.color;
  }

  //implicitly public -> 一定係public
  //Implication: if the child class cannot provide area implemantation, then it is not a shape.
abstract double calculateArea();


public static Shape create(char ref, Color color){ //S -> square , C -> Circle 
switch (ref) {
  case 'S':
    return new Square(color, 3.0);
  case 'C':   
  return new Circle1(color, 4.0);
default:
return null;
}
}

public static Circle1 createCircle (Color color, double radius){
  return new Circle1(color, radius);
} 

  public static void main(String[] args) {
    //new Shape 'R' ;//compile error, abstract class
    Shape.create('C', Color.RED);
    Circle1 c2 = Shape.createCircle(Color.BLUE, 3.0);//createCircle 用緊Static Method
    //所以 Shape.createCircle return 緊Circle1
    
    //Hero.createArcher();

    Circle1 c1 = new Circle1(Color.YELLOW , 3.0);

  }
}
