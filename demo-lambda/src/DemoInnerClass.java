public class DemoInnerClass { //Outer Class
  private int x;
 
  public void setX(int x){
    this.x = x;
  }

  public void print(){
    //Outre Class cannot read the inner class object attribute
    //System.out.println("Student.print: x=" + x + "y= " + y ); 
    System.out.println("Student.print: x=" + x ); 

    //Local Class: Method 入面寫Class
    class Cat{
      private int age ;
      public Cat (int age ){
        this.age = age;
      }
      public int  getAge(){
        return this.age;
      }


    }
    Cat cat = new Cat(10);
    System.out.println(cat.getAge());
  }
  
//----------------------------------
  public static class Library{//static nested class
    
  } 
  //----------------------------------
  public static class Bulider {//static nested class

  }
  //----------------------------------
  public class Student{//inner Class 
    private int y;

    public void print(){
      //Student Object is able to reat Outer Class object attribute directly
      System.out.println("Student.print: x=" + x + "y= " + this.y ); //can't use this. (because in Student class have )
    }


    public void setY(int y){
      this.y = y;
    }
  }
    
  public static void main(String[] args) {
    DemoInnerClass.Library library = new DemoInnerClass.Library();

    DemoInnerClass dic = new DemoInnerClass();
    DemoInnerClass.Student student = dic.new Student(); //it is Not Parent-Child relationship.
    dic.setX(10);
    student.setY(20);
    student.print();
    dic.print();

    // Anonynous Inner Class (Before Java 8)
    Swimable person = new Swimable() {
      int count =0;
      @Override
      public void swim(){
        this.count++;
        System.out.println("Anonymous object");
    }
    public int getCount(){
      return this.count;
    }
    };
    //person.getCount(); // Static Polymorphism
    //but if you ctreat person class implements Swimable 
    //,then the Person object can may contain addtional method.

    //Lambda (After Java 8 )
    Swimable person2 = () -> System.out.println("Lambda Expression Object");

  }
  @FunctionalInterface
  private static interface  Swimable {
  void swim();
    
  }
}
