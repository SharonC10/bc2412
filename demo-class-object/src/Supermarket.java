public class Supermarket {
  private int availableStock;

  public Supermarket (int availableStock){
    this.availableStock = availableStock;
  }
  public int getSupermarket(){
    return this.availableStock;
  }

  public void setAvailableStock(int availableStock){
    this.availableStock = availableStock;
  }
 // public void moveIn(int numOfStok){
  //  this.availableStok += numOfStok;
  //}
  //public void moveOut(int numOfStok){
    //this.availableStok -= numOfStok;
  //}

  //static mothod 
  public static void move(Supermarket from, Supermarket to, Worker worker, int quantity, boolean isMoveIn){

  }
  public static void main(String[] args) {
    //Multiple supermarket
    Supermarket s1 = new Supermarket(0);
    Worker worker1 = new Worker(s1);
    Worker worker2 = new Worker(s1);
    worker1.moveIn(0);
    System.out.println(Worker.getWorkerCount());//2

    //single supermarker scienario
    
  }
}
