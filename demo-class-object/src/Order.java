public class Order {
  private long id;
  private Item[] item;

  //Construtor
  public Order (long id, Item[]item){
    this.id = id;
    this.item = new Item[0];
  }

  public void placeItem (Item item){
    
  }

  //Getter
  public long getId(){
    return this.id;
  }
  
}
