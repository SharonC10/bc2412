public class Customer {
  private long id; //id 習慣用long, like transation
  private Order [] orders; //open new file for 'order'
  //make a Array -> customer can having more than one order
  //attributes can make a Arrays


  //------------------------------------------
  //Construtor
  //public Customer (long id, Order[]orders){
    //this.id = id;
    //this.orders = orders;
  //}

//1. Normally Customer can be created without order
public Customer (long id){
  this.id = id;
  this.orders = new Order[0];
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
  public Customer long getId(){
return this.id; 
  }


  //instance Method

  //------------------------------------------
  public static void main (String [] args){

   // Order[] orders = new Order [3];
    //orders[0] = new Order();
    //orders[1] = new Order();
    //orders[2] = new Order();

    Customer c1 = new Customer(1L);
    c1.placeOder(new Order());


    //order id -> item[]
    //totalOrderAmount by order id
    // isVip() -> 100_000 (total amount of all orders)




  }

}
