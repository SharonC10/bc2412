//Class cannot extend more than Parent Class

import java.util.Objects;

public class Pig extends Animal {
  //more attributes
  //private int id;
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

  public Pig(int age ){
    this.age = age;
  }

  public Pig(String name, int age ){
    super (name);
    this.age = age;
  }


//03/01/24 背左佢
// equals()
  //implicitly extend Object.calss (Object.equals() -> check if they are same memory objct)
  @Override
  public boolean equals(Object obj){
    //same object -> theey must be same 
    if (this == obj)
    return true;
    if (!(obj instanceof Pig))
    return false;
    Pig pig = (Pig) obj; //from parent to child class(int x = (int) 10L )
    return Objects.equals(pig.getAge(),this.age)
    && Objects.equals(pig.getName(), super.getName());//如只要這句，只要同名就係同一隻豬
    //return pig.getAge() == this.age && pig.getName().equals(super.getName())
  }
  //如果define object 的attribute,所有都一樣, 即 == 同一Object
  //if you have 20 attributes, it means it could define those object can be the only one.


  //hashCode()
  //implicitly extend Object.calss (Object.hashCode() -> check if they are same memory objct)
@Override
public int hashCode(){
  return Objects.hash(this.age , super.getName());//只要this.age 
  // hash -> generage a new int number 
  //representing the object
}
//寫左equals() 通常要寫埋hashCode()


@Override
public String toString(){ //concat all 合併D字
  return "Pig["
  + "age = " + this.age //
  + "name = " + super.getName()
  + "]";
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
    Pig p2 =new Pig ("IJK", 3);
    System.out.println(p1.getName());//null
    System.out.println(p2.getName());//IJK
//equals()----------------------------------------------------------
    Pig myPig = new Pig("ABC" , 3);
    Pig checkPig = new Pig("ABC",3);



    if (myPig.getAge() == checkPig.getAge() && myPig.getName() == checkPig.getName()){

    }
    if (myPig.equals(checkPig)){
      System.out.println("same");
      // after override, if they are having same value of attrubutes, they should be same.
    }else {
      System.out.println("Not same");//before override , because equals() implementation from Object.class
    }
    

    String s =new String("hello");
    String s2 = new String ("hello");
    System.out.println(s.equals(s2));//true
    System.out.println(s.equals("hello"));// true
    //in memory , here have three object ("hello" , s, s2)

//hashCode()---------------------------------------------------------
    System.out.println(myPig.hashCode());//65632
    System.out.println(checkPig.hashCode());//65632



    //toString 
    System.out.println("hello".toString()); //
    System.out.println(myPig);
  }
}