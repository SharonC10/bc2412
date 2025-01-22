import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class DemoThread5 {
  private Map<Integer , String> map; //HashMap is not thread-safe

  public DemoThread5(){
    this.map = new Hashtable<>();
    //this.map =  Collections.synchronizedMap(new HashMap<>());  ---Solution
    //HashMap = Array + LinkedList 
    //HashMap no synchronized -> so we use (Hashtable) 
    //Hashtable support lock -> just like synchronized  ---Solution
    //ConcueenetHashMap -> also can do it (no deadLock) but it do have any lockFunction ---Solution
  }

  public String put(Integer key, String value){
    return this.map.put(key, value);
  }

  public int size(){
    return this.map.size();
  }

  public static void main(String args[]){
    //put(i, String)
DemoThread5 central = new DemoThread5();    

    Runnable putEntryTask1 = () -> {
      for (int i = 0; i < 1_000_000; i++){
        central.put(i , "abc");
      }
    };

    Runnable putEntryTask2 = () -> {
      for (int i  = 1_000_000; i < 2_000_000; i++){
        central.put(i , "abc");
      }
    };

    Thread workerB = new Thread(putEntryTask1);
    workerB.start();

    Thread workerC = new Thread(putEntryTask2);
    workerC.start();

    try{
      workerB.join();
      workerC.join();
    }catch (InterruptedException e){

    }

    System.out.println(central.size());//2000000

  }

}
