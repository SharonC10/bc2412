public class Customer {
  private long id; //id 習慣用long, like transation
  private Order [] orders; //open new file for 'order'
  //make a Array -> customer can having more than one order
  //attributes can make a Arrays
  private boolean isVIP;

  //------------------------------------------
  //Construtor
  //public Customer (long id, Order[]orders){
    //this.id = id;
    //this.orders = orders;
  //}

//1. Normally Customer can be created without order
public Customer (long id, Order[]orders, boolean isVIP){
  this.id = id;
  this.orders = new Order[0];
  this.isVIP = isVIP;
}


//2. Customer can place order after become creating customer acc.
public void placeOrder(Order orders){
  Order [] newOrders = new Order [this.orders.length+1];//
  for (int i= 0; i< this.orders.length; i++){
    newOrders [i] = this.orders[i];//copy old order object to newOrder 
  }
  newOrders[newOrders.length - 1] = orders;// the 'order' place to 'new Order [newOrder.length - 1 ]'
  //order object maens what u buy~ 
  this.orders = newOrders;
}


//------------------------------------------
  //Getter
  public long getId(){
return this.id; 
  }
  public boolean getIsVIP(){
    return this.isVIP;
  }

  //instance Method

  //------------------------------------------
  public static void main (String [] args){

   // Order[] orders = new Order [3];
    //orders[0] = new Order();
    //orders[1] = new Order();
    //orders[2] = new Order();
    Item i1 = new Item(10000.0,10,"Apple");
    i1.totalAmount();
    System.out.println(i1.getPrices() + ","+  i1.getQuantity()+","+ i1.getName());
    System.out.println(i1.totalAmount());

    // Item [] newItems = new Item [3];

    Order o1 = new Order(123);
    o1.addItem(i1);

    Item i2 = new Item(20000.0, 10,"Orange");
    System.out.println(i2.totalAmount());


    System.out.println(o1.getItem()[0].getName());
    System.out.println(o1.totalAmount());


    
  

    //Customer c1 = new Customer(1L);
    //c1.placeOder(new Order());


    // //order id -> item[]
    // public Item[] getItem(long orderId){

    // }
    // //totalOrderAmount by order id
    // public double getTotalOrderAmount(long orderId){

    // }
    // // isVip() -> 100_000 (total amount of all orders)
    // public boolean isVip(){

    // }




  }

}
