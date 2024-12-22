public class Tesla {
  private String model;
  private int prices;
  private String color;

  public Tesla(String model, int prices, String color) {
    this.model = model;
    this.prices = prices;
    this.color = color;
  }

  public String getModel() {
    return this.model;
  }

  public int getPrices() {
    return this.prices;
  }

  public String getColor() {
    return this.color;
  }

  public static void main(String[] args) {

    Tesla t1 = new Tesla("Model 3", 275_168, "red");
    System.out.println(t1.getModel());
    System.out.println(t1.getPrices());
    System.out.println(t1.getColor());
    System.out.println("Model:" + t1.getModel() +" Price:"+ t1.getPrices()
    + " Color:" + t1.getColor());

    Tesla t2 = new Tesla ("Model 3", 275_168,"blue");
    System.out.println("Model:" + t2.getModel() + " Prices:" + t2.getPrices() + " Color:" + t2.getColor());
    
    Tesla t3 = new Tesla ("Modewl 3", 275_168, "Black");
    System.out.println("Model:" + t3.getModel() + " Prices:" + t3.getPrices() + " Color:" + t3.getColor());

    Tesla t4 = new Tesla ("Model 3", 275_168, "White");
    System.out.println("Model:" + t4.getModel() + " Prices:"+ t4.getPrices() + " Color:"+ t4.getColor());

    Tesla t5 = new Tesla ("Model Y" , 430_200, "black");
    System.out.println("Model:" + t5.getModel() + " Prices:" + t5.getPrices() + " Color:" + t5.getColor());
    
  }
}
