import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DemoQueue {

  public static void main(String[] args) {
    // FIFO , MUST!!
    //左邊可閱性提高， 右邊真實性能。
    Queue<String> strings = new LinkedList<>(); //LinkedList have a lot of method 
    //But when adding Quenue - it is parent class 
    //Queue only have addLast, pollFirst
    //so, Queue limit the LinkedList method.
    // LinkedList -> add / remove , head / tail

    strings.add("Oscar");// addLast 
    strings.add("Vincent"); //addLast
    strings.add("Lucas"); //addLast
    System.out.println(strings);//[Oscar, Vincent, Lucas]

    strings.poll(); // //removeFirst
    //poll() 如果冇野return null
    System.out.println(strings); //[Vincent, Lucas]
    String head = strings.poll();
    System.out.println(strings);//[Lucas]



    //Queue Interface hidden lots of functions of LinkedList 
    //****strings.remove(); **** //similar to poll() 
    System.out.println(strings.contains("Lucas")); //true

    //lookUp the head element, not pick up
    System.out.println(strings.peek());
    System.out.println(strings.size());

    strings.offer("Jenny");
    System.out.println(strings);// [Lucas, Jenny]
    //System.out.println(strings.offer("Jenny")); // true

    Queue <String> qq =new ArrayBlockingQueue<>(3);
    System.out.println(qq.offer("ABC"));
    System.out.println(qq.offer("DEF"));
    System.out.println(qq.offer("IJK"));
    qq.poll(); //poll first
    System.out.println(qq.offer("XYZ"));//true
    System.out.println(qq); //[DEF, IJK, XYZ]

    //for each  support Queue
    for (String s : strings){
      System.out.println(s); 
      //Lucas
      //Jenny
    }

    List <String> newStrings = new ArrayList<>();
    newStrings.add("AAA");
    newStrings.add("BBB");
    strings.addAll(qq);
    System.out.println(strings);//[Lucas, Jenny, DEF, IJK, XYZ]

    //Deque 

    // why Queue？
    //可閱高，準確範圍，
  }

}

