public interface Walkable {
  //1. No instance variable 
  //2. All method abstract(interface =100% abstract ) 
  //3. Everything in Interface is Imlicitly public
  //4. Support "Static Final" Variable 
  //5. No Construtor
  //6. After Java 8, we have default & static method


  int x = 3;//Final 左 冇得改． Implicitly static final
void walk();//abstract method 

  //After Java 8, we can use default instance method
  default void walkFaster(){
System.out.println("A way to walk faster ...");//自動承傳WalkFaster嘅方法
  }

  //After Java 8, we can use static instance method
  static int calculateDistance(){ //
    return -1;
  }
  
  public static void main(String[] args) {
    
    System.out.println(Walkable.x);
    //Walkable.x =4;//Static Final
    //
    //Walkable.walkFaster();
    System.out.println(Walkable.calculateDistance());
    
  }
}
