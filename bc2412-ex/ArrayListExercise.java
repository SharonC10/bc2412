import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class ArrayListExercise {
  
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.
    ArrayList <Integer> arr = new ArrayList<>();
    arr.add(10);
    arr.add(20);
    arr.add(30);
    arr.add(40);
    arr.add(50);
    System.out.println(arr);//1c
    
   for (int i = 0 ; i < arr.size() ; i++){
    if (arr.get(i) == 30){
      arr.remove(i);
    }
   } 
    System.out.println(arr.size());//--------1e.
    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.
    ArrayList<String> strings = new ArrayList<>();
    strings.add("Apple");
    strings.add("Banana");
    strings.add("Mango");
    strings.add("Orange");
    
    strings.contains("Grapes");
    System.out.println(strings.contains("Grapes"));//----2b
    strings.add("Grapes");
    
    for (int i =0; i < strings.size(); i++){
      if (strings.get(i) == "Mengo"){
        strings.set(i, "Peach");
        break;
      }
    }
    System.out.println(strings);

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.
    ArrayList <Integer> newArr = new ArrayList<>();
    newArr.add(10);
    newArr.add(20);
    newArr.add(10);
    newArr.add(30);
    newArr.add(40);
    newArr.add(20);
    newArr.add(50);
    
    HashSet <Integer>newArr2 = new HashSet<>();
    newArr2.add(10);
    newArr2.add(20);
    newArr2.add(10);
    newArr2.add(30);
    newArr2.add(40);
    newArr2.add(20);
    newArr2.add(50);
    System.out.println(newArr2);

    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.
    HashSet <String>country = new HashSet<>();
    country.add("USA");
    country.add("India");
    country.add("China");
    country.add("Japan");
    
    country.add("Canada");
    System.out.println(country);
    country.add("India");
    System.out.println(country);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.
    HashSet <Double>num = new HashSet<>();
    num.add(1.1);
    num.add(2.2);
    num.add(3.3);
    num.add(4.4);
    num.add(5.5);
    
    num.contains(3.3);
    System.out.println(num.contains(3.3));
    num.remove(2.2);
    System.out.println(num);
    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.
    HashSet <Integer>one =new HashSet<>();
    one.add(10);
    one.add(20);
    one.add(30);
    one.add(40);
    HashSet <Integer>two = new HashSet<>();
    two.add(30);
    two.add(40);
    two.add(50);
    two.add(60);

    // for (int i = 0; i < one.size(); i++){ //30 & 40
    //   for (int j = 0; j< two.size(); j++){
    //     int count = 0;
    //      int idx = 0;
    //      two.
    //     if(one[i] = (two[j]) ){
    //       count = 
    //   }
    //   }
    // }
    HashSet <Integer> ans = new HashSet<>();

    for(Integer a : one){
      for(Integer b: two){
        if(a == b){
          ans.add(a);
        }
      }
    }
    System.err.println(ans);

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.
    HashSet <String>name = new HashSet<>();
    name.add("Cherry");
    name.add("Steve");
    name.add("Chole");
    name.add("Jenny");
    name.add("Vicky");

    ArrayList <String> result = new ArrayList<>();
    for (String convert : name){
      result.add(convert);
    }System.out.println("Convert:" + result);


    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'
    //8a------------------
    ArrayList <Student>stu = new ArrayList<>();
    stu.add(new Student(1,"Alice"));
    stu.add(new Student(2,"Bob"));
    stu.add(new Student(3,"Charlie"));
    System.out.println(stu.toString());

    for (int i = 0; i<stu.size(); i++){
      if (stu.get(i).equals("Bob")){
        stu.remove(i);
      }
    }
    System.out.println("Remove:" + stu.remove(new Student(2, "Bob")));
    System.out.println(stu.toString());
    
    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
    HashSet <String> stu2 = new HashSet<>();
    stu2.add("Alice");
    stu2.add("Bob");
    stu2.add("Charlie");
    HashSet <Integer>stu3 = new HashSet<>();

  }

  public static class Student {
    private int id;
    private String name;

    
    // Constructor
    public Student (int id, String name){
      this.id = id;
      this.name = name;
    }
    // getter, setter, etc.
    public int getId(){
      return this.id;
    }
    public String getName(){
      return this.name;
    }
    public int setId(){
      return this.id = id;
    }
    public String setName(){
      return this.name = name;
    }

  

    // public static boolean search( ArrayList <Student>stu){
    //   boolean found = false;
    //   String resule = "";
    //   for (int i = 0; i < stu.size() ; i++){
    //     if (stu.get(i) == ){
    //       found = true;
    //       result = getName();
    //       return result;
    //     } 
    //     return false;
    //     System.out.println("Student not found");
    //   }
      
    // }
    @Override
    public boolean equals(Object obj){
      if (this == obj)
      return true;
      if (!(obj instanceof Student))
      return false;
      Student student = (Student) obj;
      return Objects.equals(this.id, student.getId())
      && Objects.equals(this.name , student.getName());
    }
    @Override
    public int hashCode(){
      return Objects.hash(this.id, this.name);
    }

    @Override
    public String toString(){
      return "Student["+
      " ID: " + getId() +
      " Name: " + getName() +
      "]";
    }
  }
}