public class Mage extends Hero {
  private boolean invisible;// can invisible 

  public Mage (int hp, int mp,int level){
    super(hp,mp, level);
    this.invisible = invisible;
  }
  
  public boolean getInvisible(){
    if (super.getLevel() >=2 && super.getLevel() <=10){
      this.invisible = true;
    }
    return this.invisible;
  }

  public static void main(String[] args) {
    Mage m1 = new Mage(200, 100, 2);
    m1.getInvisible();
    System.out.println(m1.getInvisible());
  }
  
}
