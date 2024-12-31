public class Worker2 {
  public Worker2(){

  }
  public void moveIn(int quantity){
    Supermarket2.availableStok += quantity;
  }
  public void moveOut(int quantity){
    Supermarket2.availableStok -= quantity;
  }
  
  public int checkStockQuantity(){
    return Supermarket2.availableStok;
  }

  public static void main(String[] args) {
    Worker2 w1 = new Worker2();
    w1.moveIn(100);
    w1.moveOut(23);
    System.out.println(w1.checkStockQuantity()); //77
    
}
}
