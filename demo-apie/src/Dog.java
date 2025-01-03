public class Dog extends Animal{
  //Attribute----------
  //private String name;

//----------Contrutor (wClass CANNOT inherit Parent Construtor)
  public Dog (String name ){
    super(name); 
    //this.name = name;
  }

  //-----getter-------------
  // public String getName(){
  //   return this.name;
  // }

  //intance method-------------
  public void walk(){
    System.out.println("Dog is walking...");
  }
  public static void main(String[] args) {
    Dog d1 = new Dog("def");
    d1.walk();
    System.out.println(d1.getName());
  }
}
//for example 如果你嘅game 有好多動物要create, 但都需要用樣嘅野． e.g: name, age,... 

