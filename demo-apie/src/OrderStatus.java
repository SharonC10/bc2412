public enum OrderStatus {
  PAID(1),
  READ_FOR_SHIP(2),
  DELIVERING(3),
  DELIVERED(4),
  ;

  private int value;

  private OrderStatus (int value){
    this.value = value;
  }
  public int getValue(){
    return this.value;
  }

  //DELIVERED.next() -> null
  public OrderStatus next(){
    for (OrderStatus n : OrderStatus.values()){ // values!! -> 
      if (n.value == this.value +1)
    return n;
  }return null;
  }

public static void main(String[] args) {
  OrderStatus paid = OrderStatus.PAID;
  System.out.println(DELIVERED.next()); //toString
  System.out.println(paid.next());

  System.out.println(PAID.next().name());
  // .name() - > call the name , the origanal name.

  System.out.println(OrderStatus.valueOf("PAID"));
  //PAID 

  System.out.println(OrderStatus.valueOf("PAID") == OrderStatus.PAID);
  //true
  System.out.println(OrderStatus.valueOf("paid") == OrderStatus.PAID);
  //run time error -> paid not a enum.



}




}
