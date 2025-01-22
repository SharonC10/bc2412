import Furniture.Chair;
import Furniture.Furniture;
import Furniture.ModernChair;
import Furniture.VictorianChair;
import factory.FurnitureFactory;
import factory.ModernFurnitureFactory;

public class DemoFactory {
  public static void main(String[] args) {
    FurnitureFactory factory = new ModernFurnitureFactory();
    
    //create Chair
    Chair chair = factory.createChair();//decouple
    
    //Runtime Polymorphism
    Chair mc = new ModernChair();
    Chair vc = new VictorianChair();
    System.out.println(mc.sitOn());
    System.out.println(mc.hasLegs());
    System.out.println(vc.sitOn());
    System.out.println(vc.hasLegs());
    
  }
}
