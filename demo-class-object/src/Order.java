import java.math.BigDecimal;

public class Order {
  private long id;
  private Item[] items;// address/reference -> item[] array

  // Construtor
  public Order(long id) {
    this.id = id;
    this.items = new Item[0];
  }

  // --------------------------------------------------
  public void addItem(Item item) {
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      newItems[i] = this.items[i];
    }
    newItems[newItems.length - 1] = item;
    this.items = newItems;
  }

  // remove
  public void removeItem(Item item) { // resize array -1
    Item[] newItems = new Item[this.items.length - 1];
    int idx = 0;
    int countTarget = 0;

    for (int i = 0; i < this.items.length; i++) {
      // this.items -> Item array object
      // this.item[i] -> Item Object
      if (this.items[i].equals(item) && countTarget == 0) { //TBC...
        countTarget++;
        continue;
        // copy
      }
      newItems[idx++] = this.items[i];
    }
    this.items = newItems;
  }

  // --------------------------------------------------
  // Getter
  public long getId() {
    return this.id;
  }

  public Item[] getItem() {
    return this.items;
  }

  // --------------------------------------------------
  // instance method


  //Order order = new Order(items);
  //order.totalAmount();
  // order.totalAmount
  public double totalAmount() { //this totalAmount is order totalAmount
    //0.0 + 10.3 (new BigDecimal object) ->10.3 (new BigDecimal Object)
    //next rount 10.3 + 7.7 (new BigDecimal Object) -> 18.0 (new BigDeciaml)
    BigDecimal sum = BigDecimal.valueOf(0.0);
    for (Item item : this.items) { // for each loop //Item item , item -> u can name any
      // this.item -> array
      sum = sum.add(BigDecimal.valueOf(item.totalAmount()));
    }
    return sum.doubleValue();
  }
  
  // --------------------------------------------------


}
