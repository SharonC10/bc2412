public class Item {
  private double prices ;
  private int quantity;
  private String name;

  //Construtor
  public Item (double prices, int quantity, String name){
    this.prices = prices;
    this.quantity = quantity;
    this.name = name;
  }

  //getter
  public double getPrices(){
    return this.prices;
  }
  public int getQuantity(){
    return this.quantity;
  }
  public String getName(){
    return this.name;
  }

  public static void main (String []args){

    Item i1 = new Item(10000.0,10,"Apple");
    System.out.println(i1.getPrices() + ","+  i1.getQuantity()+","+ i1.getName());
  }
}
