public class Cat extends Animal { //extends Animal 傳承
    //Animal.class is a Parent Class -> 
    // Cat is a Child class -> 
    //Inherit all attribute from class 
    
    //private String name;
    private int age;
//------------------Contrutor
    public Cat (String name, int age){
        super(name);//  super一定要係第一句；
         //calling Parent Contrutor 想call Parent 個Construtor
        //this.name = name;
        this.age = age;
    }
    //----------getter--------------
    //Inherit Parent all instance methods -> 因為個method 已經係Animal有
    //Cat身上已有 getName的method 
    // public String getName(){
        
    //     return this.name;
    // } 
    public int getAge(){
        return this.age;
    }
//--------------------------
    //walk()
    public void walk(){
        System.out.println("Cat is walking...");
    }
    public static void main(String[] args) {
        Cat c1 = new Cat("abc",8);
        System.out.println(c1.getName());//abc
        c1.walk();

    }

}