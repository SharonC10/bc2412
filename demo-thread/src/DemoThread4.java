import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//Solution
//1. Native Data Strucuture (AutomicXXX)
//2. Lock the action (synchronized)
public class DemoThread4 {
  private List<Integer> integers; 

  // public DemoThread4() {
  //   integers = new ArrayList<>();
  // }

  public DemoThread4(){
     this.integers = new Vector<>();//Polymorphism
  }

  // public ArrayList<Integer> getIntegers(){
  //   return this.integers;
  // }

  public boolean add(Integer integer){
    //this.integers.contains(2); //lock
    return this.integers.add(integer); //lock this line of code
  } 
  //Vector will lock every line
  //if 
  

  public void addNum(int number){
    this.integers.add(number);
  }

  public int size(){
    return this.integers.size();
  }

  public static void main(String[] args) {
   DemoThread4 central = new DemoThread4();
   central.addNum(10);
   central.addNum(20);
   central.addNum(30);

    Runnable addMillionElements = ()->{
      for (int i =0; i< 1_000_000; i++){
        central.add(i);
      }
    };
Thread workerB = new Thread(addMillionElements);
workerB.start();//Main thread -> initialize another thread(Worker B) to execute the task
//The worker B execute the task ONLY.
//worker B can be success, fail

Thread workerC = new Thread(addMillionElements);
workerC.start();//Main thread -> execute another thread(Worker C)

//Main Threaed 
try{
  workerB.join(); //main thread will wait the worker B complete the task, then going on.
  workerC.join();
}catch(InterruptedException e){

}

//System.out.println(central.add().size());

  }
}
