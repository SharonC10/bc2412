import java.math.BigDecimal;

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

  public double totalAmount(){
   return BigDecimal.valueOf(this.prices)
   .multiply(BigDecimal.valueOf(this.quantity))
   .doubleValue();

  }
}
