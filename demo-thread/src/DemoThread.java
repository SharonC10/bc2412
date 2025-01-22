public class DemoThread {
    //main thread (worker A)
    //imaging main thread as a worker A 
    //another Thread : (Worker B)
    public static void main(String[] args)  {
      int x = 3;
        x++; //4
        ++x; //5
        x+=1; //6
        System.out.println(x);

        //Create another Thread.
        //1.Task, 2.Thread
        Runnable sayHelloTask = () -> System.out.println("Hello!!!"); 

        StringBuilder sb = new StringBuilder("");
        Runnable concatStringMillionTask = () ->{
        for(int i = 0; i< 1_000_000; i++){
            sb.append("!");
        }
        //System.out.println(sb.length()); // 1000000, exceuted by Worker B 
    }; 
    System.out.println("Program end.");
        //sayHelloTask.run(); //Hello!!! ---> Worker A 
        Thread workerB = new Thread(concatStringMillionTask); //1
        workerB.start(); //worker B only doing sayHelloTask.
        //main thread (worker A) exceute a new Thread  (worker B )
        //main thread proceed its own task
        
        //System.out.println("Program end."); //main Worker A 
        System.out.println(sb.length());//0, executed by Worker A (main thread
        //why doing this? )
    }
}
