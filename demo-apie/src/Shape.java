public abstract class Shape {
  //abstract class vs class
  //1. CANNOT create object for abstract class
  //愈精準愈好 E.g.沒有Shape 所以要abstract 避免有人call左 
  //封左自己成為Object嘅可能性
  //2. they are both wirh common attribute for child class
  //3. abstract class 's constructor is for child class to "super"

  private char color;
 

  public Shape (char color){
    this.color = color;
  }


  public char getColor(){
    return this.color;
  }

  //implicitly public -> 一定係public
  //Implication: if the child class cannot provide area implemantation, then it is not a shape.
abstract double calculateArea();

  
}
