public class Worker {
  private static int workerCount = 0;
  private Supermarket supermarket;

  public Worker (Supermarket supermarket){
    this.supermarket = supermarket;
    Worker.workerCount++;
  }

  //if read private static varible, we should use a static method 
public static int getWorkerCount(){
  return Worker.workerCount;
}

  public void moveIn(int quantity){
supermarket.setAvailableStok(supermarket.getAvailableStock()+ quantity);
  }
  
  public void moveIn(int quantity){
    supermarket.setAvailableStok(supermarket.getAvailableStock() - quantity);
  }

}
