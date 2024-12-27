import java.math.BigDecimal;

public class Customer {
  private long id; // id 習慣用long, like transation
  private Order[] orders; // open new file for 'order'
  // make a Array -> customer can having more than one order
  // attributes can make a Arrays
  
  //private boolean isVIP;
//won't write it -> VIP can cal from data, will change, no need to save
  // ------------------------------------------
  // Construtor
  // public Customer (long id, Order[]orders){
  // this.id = id;
  // this.orders = orders;
  // }

  // 1. Normally Customer can be created without order
  public Customer(long id, Order[] orders, boolean isVIP) {
    this.id = id;
    this.orders = new Order[0];
  }


  // 2. Customer can place order after become creating customer acc.
  public void placeOrder(Order orders) {
    Order[] newOrders = new Order[this.orders.length + 1];//
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i];// copy old order object to newOrder
    }
    newOrders[newOrders.length - 1] = orders;// the 'order' place to 'new Order [newOrder.length - 1 ]'
    // order object maens what u buy~
    this.orders = newOrders;
  }


  // ------------------------------------------
  // Getter
  public long getId() {
    return this.id;
  }

  public int orderSize() {
    return this.orders.length;
  }

  public Order[]getOrders(){
    return this.orders;
  }


  // instance method
  // --------------------------------------------------
  // //order id -> item[]
  public Item[] getItem(long orderId) {
    for (Order order : this.orders) {
      if (order.getId() == orderId) {
        return order.getItem();
      }
    }
    return new Item[0]; // or return null
  }


  // //totalOrderAmount by order id
  public double getTotalOrderAmount(long orderId){
      for (Order order : this.orders) {
        //System.out.println(order.getId() + " " + order.getTotalOrderAmount());
        if (order.getId() == orderId) {
          return order.totalAmount();
        }
      }
      return -1.0; // or return null
    }


  // // isVip() -> 100_000 (total amount of all orders)
  public boolean isVip() {
    BigDecimal sum = BigDecimal.valueOf(0.0);
    for (Order order : this.orders) { // for each loop //Item item , item -> u can name any
      // this.item -> array
      sum = sum.add(BigDecimal.valueOf(order.totalAmount()));
    }
    return sum.doubleValue() >= 100_000.0;
  }

  // ------------------------------------------
  public static void main(String[] args) {
    
    // Order[] orders = new Order [3];
    // orders[0] = new Order();
    // orders[1] = new Order();
    // orders[2] = new Order();
    Item i1 = new Item(10000.0, 10, "Apple");
    i1.totalAmount();
    System.out
        .println(i1.getPrices() + "," + i1.getQuantity() + "," + i1.getName());
    System.out.println(i1.totalAmount());

    // Item [] newItems = new Item [3];



    Item i2 = new Item(20000.0, 10, "Orange");
    System.out.println("totalAmount:" + i2.totalAmount());


    // System.out.println(o1.getItem()[0].getName());
    // System.out.println(o1.totalAmount());



    Customer c1 = new Customer(1L, null, false);

    Order o1 = new Order(1L);
    o1.addItem(new Item(5.4, 5, "ABC"));
    o1.addItem(new Item(1.3, 3, "DEF"));
    c1.placeOrder(o1);

    Order o2 = new Order(1L);
    o2.addItem(new Item(1.0, 2, "IJK"));
    o2.addItem(new Item(1.3, 3, "LLL"));
    c1.placeOrder(o2);

    Order o3 = new Order(1L);
    o3.addItem(new Item(1.2, 2, "KKK"));
    o3.addItem(new Item(2.2, 3, "JJJ"));
    c1.placeOrder(o3);

    Order o4 = new Order(1L);
    o4.addItem(new Item(400.0, 2000, "KKK"));
    c1.placeOrder(o4);

    System.out.println(c1.orderSize());// 3
    System.out.println(c1.getTotalOrderAmount(2L));// 3
    System.out.println(c1.getTotalOrderAmount(3L));
    System.out.println(c1.getTotalOrderAmount(1L));
    System.out.println(c1.isVip());// false
    System.out.println(c1.isVip());// true

    //--------------------------------------------------
    //getOrders is array - > add []
    //getOrder array 入面第0個order  ->第一個order
    //item都係array
    //想要Order入面嘅第二個Item  ->getOrder()[0].getItem()[1]
    //得Item 先有Price 所以係 -> getOrder()[0].getItem()[1].getPrices()
    // can't getOrder()[0].getPrice()
    c1.getOrders()[0].getItem()[1].getPrices();
    System.out.println(c1.getOrders()[0].getItem()[1].getPrices());

//c1.getOrders -> Order[]
//so, getOrders[0] -> Order
//so, getOrder[0].getItem()[1] -> item
//so, getOrder[0].getItem()[1].getPrice() -> double
System.out.println(c1.getOrders()[0].getItem()[1].totalAmount()); //3.9(1.3*3)
System.out.println(c1.getOrders()[0].totalAmount());//30.9(5.4*5 + 1.3*3)
System.out.println(c1.getTotalOrderAmount(1));//30.9

  }


}
