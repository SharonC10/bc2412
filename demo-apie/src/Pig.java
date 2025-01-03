public class Pig extends Animal {
  //more attributes
  private int age;
  private char gender;
  private String color;

  public Pig(){
    //implicitly calling super() 點都call緊
    //super();
    //super("XYZ");
  }

  public Pig(String name){
    super (name);
  }

  public int getAge(){
    return this.age = age;
  }

  public char getGender(){
    return this.gender;
  }

  public String getColor(){
    return this.color;
  }



  public void sleep(){
    System.out.println("Pig is sleeping...");
  }
  public static void main(String[] args) {
    
    Pig p1 = new Pig();
    Pig p2 =new Pig ("IJK");
    System.out.println(p1.getName());//null
    System.out.println(p2.getName());//IJK

  }
}
