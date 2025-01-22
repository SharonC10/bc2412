import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread2 {
  // private int x;//Primitice( Not Thread safe) ----> problem
  private AtomicInteger x = new AtomicInteger(0);//Primitive (Thread-safe)

  public int getX(){
    //return this.x;
    return this.x.get() ;
  }

  public void addOne(){
    //this.x++;
    this.x.getAndIncrement();//locked 
  }
  public static void main(String[] args) {
    DemoThread2 place = new DemoThread2();
    place.addOne();
    System.out.println(place.getX()); //1 

    DemoThread2 central = new DemoThread2();

    Runnable placeAddMillionTask = () -> {
      System.out.println("Thread Id:" + Thread.currentThread().getId());
    for(int i = 0; i < 1_000_000; i++){
      central.addOne();
      //System.out.println(i);
    }
   }; //define task

    Thread workerB = new Thread(placeAddMillionTask); //new Thread 入面放Task。
    workerB.start();

    Thread workerC = new Thread(placeAddMillionTask);
    workerC.start();
    
   try{
    workerB.join();///main Thread wait until workerC complete the task
    workerC.join();//main Thread wait until workerC complete the task
   }catch(InterruptedException e){

   }

    System.out.println(central.getX()); //1 (likely / not certain) 不穩定數 
    //after using AutomicInteger, x become 2000000
  }
}
