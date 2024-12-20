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

    Tesla t2 = new Tesla ("Model Y" , 430_200, "black");
  }
}
