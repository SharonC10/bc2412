public class Cat extends Animal implements Walkable, Sleepable{ // extends Animal 傳承
    // Animal.class is a Parent Class ->
    // Cat is a Child class ->
    // Inherit all attribute from class

    // private String name;
    private int age;

    // ------------------Contrutor
    public Cat(String name, int age) {
        super(name);// super一定要係第一句；
        // calling Parent Contrutor 想call Parent 個Construtor
        // this.name = name;
        this.age = age;
    }
    // ----------getter--------------
    // Inherit Parent all instance methods -> 因為個method 已經係Animal有
    // Cat身上已有 getName的method
    // public String getName(){

    // return this.name;
    // }
    public int getAge() {
        return this.age;
    }

    // --------------------------
    // walk()
    @Override
    public void walk() {
        System.out.println("Cat is walking...");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating ...");
    }

    @Override
    public void sleep(){
        System.out.println("cat is sleeping");
    }
    
    
    
    // public static void main(String[] args) {
    //     Cat c1 = new Cat("abc", 8);
    //     System.out.println(c1.getName());// abc
    //     c1.walk(); // Cat itself method 
    //     c1.eat(); // Animal is eating ...-> Cat is eating 
    //     //Override Parent method implemetation 
    //     c1.walkFaster();
    // }

}
