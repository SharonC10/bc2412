import java.lang.reflect.Array;
import java.util.Arrays;

public  class Animal implements Eatable{
  //Common attribute of Cat and Dog
  private String name; 
  
  public Animal (String name){
    this.name =name;
  }

  public Animal (){
    
  }

  public String getName(){
    return this.name;
  }
//Contrat Content 

@Override
public void eat(){
  System.out.println("Animal is eating ...");
}//comfirm animal 一定有eat method,鎖定Animal

public void walk(){}

public static void main(String[] args) {
  

Cat cat= new Cat("Jimmy",3);
System.out.println(cat.getName());

Animal cat2 = new Cat("Mary",2);//!!! new

//Rule 1. During the complie time, 
//"Animal cat2" imply the object can be accessed ing "Animal Scope"
// Hide the object instance method walk() & sleep()
//cat2.sleep();


//Rule 2. Runtime 
cat2.eat(); //Find the object during runtime.
//Found that the object actually is a cat object.
//So cat2.eat() -> Cat.class's eat() method.

//Animal cat3 = new Animal("Vincent");
//cat3.eat(); //Animal is eating 
//cat3.sleep(); // violate Rule 1

//Never place a parent object to a child reference 
//Cat cat4 = Animal ("Lucas");

//Example 
Animal [] animals = new Animal[3];
animals [0] = new Cat("cat",2);
animals [1] = new Dog("cat");
animals [2] = new Pig("cat");
//animals [3] = new Animal("XYZ"); (abstract 左就new 唔到) 
//what if the Animal.class is abstract? 
System.out.println(Arrays.toString(animals));

Cat [] cats = new Cat[3];
cats [0] =new Cat("ABC", 3);


//Example 2. 
Shape [] shapes =new Shape[3];
shapes [0] = new Circle1(Color.BLUE, 3);
shapes [1] = new Square(Color.RED, 10);
shapes [2] = new Triangle(Color.BLUE, 10, 10);
for (Shape shape : shapes){
  System.out.println("area = " + shape.calculateArea());
  //System.out.println(shape.getRadius) -> 因為Shape冇 getRadius method
} 
//example:  Hero[]三個職業放一齊計一條共通嘅數/smthing 

//Example 3. Downcast 
for (Shape shape : shapes){
  if (shape instanceof Circle1){//check if shape is instance of Circle? (instance = object)
    Circle1 circle1 = (Circle1 ) shape;// similar to "double y = 2.0 ; int x = (int) y;" assum y is double 
  System.out.println("Radius = " + circle1.getRadius());
  //call 到 getRadius -> circle1 有getRadius method
  }else if (shape instanceof Square){
    Square square = (Square) shape;
    System.out.println(square.getLength());//comply with Rule 1. 
  }else if (shape instanceof Triangle){
    Triangle triangle = (Triangle) shape;
  }//Shape get唔到Radius，但Circle可以， 所以將Shape Downcase 換返做Circle 取得 getRadius
  }


//Example 4. for Interface 
Eatable cat4 = new Cat ("Tommy", 9 );
cat4.eat();

Sleepable[] animals2 = new Sleepable[3];
animals2[0] = new Cat("Steve",2);
animals2[0] = new Dog("Owen");

animals2[1].sleep();
//animals2[0].getName(); Sleepable don't have this method 
//only sleep;

Animal animal = new Cat("ABC", 3);
animal.eat(); //Cat is eating...
animal = new Dog("IJK");
animal.eat(); //Dog is eating 

//Polymorhism.
//Hero hreo = new Archer();
//hero.attack();
//hero = new Warrior();
//hero.attack();

}


}