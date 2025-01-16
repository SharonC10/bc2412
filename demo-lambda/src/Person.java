/**
 * Purpose: 
 * @author Sharon.chan
 * @since
 * Date: 16-1-2024
 */

public class Person {
    private String name;
    private int age;

    public static Builder builder(){
        return new Builder();
    }

    public Person (String name, int age ){
        this.name =name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

//------------------------------------------------
    

    public static class Builder{
    private String name;
    private int age;

    //Setter-Builder
    public Builder name(String name ){
        this.name = name;
        return this;
    }
    
    //Setter-Builder
    public Builder age(int age ){
        this.age = age;
        return this;
    }
public Person build(){
    return new Person(this.name, this.age);
}
//--------------------------------------------------

}
public static void main(String[] args) {
    Person p1 = new Person("Vincent", 18);
    Person p2 = new Person.builder()
    .name("Vincent")
    .age(18)
    .build();
    
    
    //Advantage1.
    // you no longer need to pass null for those unnecessary attribute
    //2. if there are many attribute (i.e: 20+ String ) you have to manually 
    //check if the value is passed to the right parameters
    Person p4 = new Person.builder()
    .build();
   
    System.out.println(p4.getAge()); //0
    System.out.println(p4.getName()); //null
}
}
