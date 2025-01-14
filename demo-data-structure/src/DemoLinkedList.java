import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
 public static void main(String[] args) {
  LinkedList <String> strings = new LinkedList<>();
  //if change to arrayList 
  // List <String> strings = new ArrayList<>(); // remove() -> can't use 
  strings.add("ABC");// add() method belong to Collection Family.
  strings.add("DEF");
  strings.add("ABC");
  System.out.println(strings.size()); //3
  strings.remove(0); 
  System.out.println(strings);
  strings.remove("ABC");
  System.out.println(strings); //淨返DEF
  strings.add("Oscar");
  strings.add("Jenny");
  strings.remove(); //remove the head -> DEF have been removed// Only LinkedList have this method 
  System.out.println(strings);
  System.out.println(strings.contains("Jenny")); //true
  System.out.println(strings.contains("Vincent")); //false 

  //contains(), add(), remove(Object obj) , etc are common method for ArrayList and LinkedList.
  strings.isEmpty();

  strings.clear();
  System.out.println(strings.clone());//0
  //LinkedList advantages: add / remove head/head/tail 
  // LinkedList  = (like first in & first out) / (first in last out )
  //Array/ Array List advantages: point the onject diretly if you know teh posotion
  //Person.class(name)
  //1. How to add? 
  //2. How many people 
  //3. will it add at the last 


  //LinkList can use for eachLoop
  for (String s : strings){
    System.out.println(s); 
  }

  //Polymorphism
  //List <Integer>ss = new ArrayList<>();
  List <Integer> ss =new LinkedList<>();
  ss.add(100);
  ss.add(1000);
  // Because of Inerface List, ss object can invoke add() at compile time.
  //During runtim, we found the object is LinkedList, so the add() will be the LinkedList one.
  ss.remove(1);

  //remove(); // NOT OK, List Interface doesn't contain remove()
  LinkedList <Integer> ss2 = (LinkedList<Integer> ) ss;
  ss2.remove();

  List<Animal1> animals = new ArrayList<>();
  animals.add(new Tiger());
  animals.add(new Panda());
  for (Animal1 animal : animals){
    System.out.println(animal.run()); //100
  }
  
 } 
}
