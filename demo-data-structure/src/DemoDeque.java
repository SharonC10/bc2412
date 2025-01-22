import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoDeque {
  public static void main(String[] args) {
    Deque <String> strings = new LinkedList<>();
    strings.add("Lucas"); // addLast , add tail
    strings.add("Vincent");
    strings.add("Oscar");
    strings.addFirst("Jenny");//[Jenny, Lucas, Vincent, Oscar]
    System.out.println(strings);
    strings.poll(); //pollFirrst
    strings.pollLast();
    System.out.println(strings);//[Lucas, Vincent]
    System.out.println(strings.peek()); // peekFirst "Lucas"
    System.out.println(strings.peekLast()); // f "Vincent "

    // support for loop
    //support remove 
    //supportconin
    
  //Pactice ArrayDeque
  
  Queue <String>ss3 = new ArrayDeque<>();
  
    // if (){
    //   ss3 = new ArrayDeque<>();
    // }else {
    //   ss3 = new LinkedList<>();
    // }

    ss3.poll();//
    //different implementations -> performance according to scenario.
    
    Deque <String>ss2 = new ArrayDeque<>();
    ss3 = new LinkedList<>();
    //Deque has wider scope (i.e add/ remove /oill/ peek first/ Last)
 
  }
  
}
