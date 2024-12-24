import java.math.BigDecimal;

public class Order {
  private long id;
  private Item[] items;

  //Construtor
  public Order (long id){
    this.id = id;
    this.items = new Item[0];
  }
//--------------------------------------------------
  public void addItem (Item item){
    Item [] newItems = new Item [this.items.length + 1];
    for (int i= 0; i< this.items.length ; i++){
      newItems [i] = this.items[i];
    }
    newItems[newItems.length - 1] = item;
    this.items = newItems;
  }

  //remove
  public void removeItem (Item item){
    Item [] newItems = new Item [this.items.length -1];
    for (int i=0; i< this.items.length ; i++){
      newItems[i] = this.items[i];
    }
    //newItems[newItems.length] = item;
    this.items = newItems;
  }
//--------------------------------------------------
  //Getter
  public long getId(){
    return this.id;
  }
  public Item[] getItem(){
    return this.items;
  }
  
  //--------------------------------------------------
  // instance method

  // order.totalAmount
  public double totalAmount(){
    double sum = 0;
    for(Item item : this.items){
      sum += item.totalAmount();
    }
    return sum;
  }
    //--------------------------------------------------
  
  
}
