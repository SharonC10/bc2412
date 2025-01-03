import java.math.BigDecimal;

public class Hero {
  //HP -health pt.
  //MP -magic pt.
  //Level up -> increase Max HP , Max MP
  private int hp;
  private int mp;
  private int maxHP;
  private int maxMP;
  private int exp;

  public Hero (int hp, int mp, int exp, int maxHP, int maxMP){
    this.hp = hp;
    this.mp =mp;
    this.exp = exp;
    this.maxHP = maxHP;
    this.maxMP = maxMP;
  }

  public  int getHP(){
    return this.hp;
  }
  public int getMP(){
    return this.mp;
  }
  public int getExp(){
    return this.exp;
  }
  public int getMaxHP(){
    return this.maxHP;
  }
  public int getMaxMP(){
    return this.maxMP;
  }


  public int levelUp(){ //if level up -> HP +100, MP +100,  level+1
    int idx = 0;
    if (getExp() ==100){
      this.maxHP = BigDecimal.valueOf(getMaxHP())
      .add(BigDecimal.valueOf(100))
      .intValue();
      this.maxMP = BigDecimal.valueOf(getMaxMP())
      .add(BigDecimal.valueOf(100))
      .intValue();
      idx++;
    }
    return idx;
  }



  public boolean isAlive(){
    int hpValue = this.hp;
    boolean isAlive = false;
    if (hpValue > 0){
      System.out.println("Hero alive");
      return true;
    }else if (hpValue ==0){
      System.out.println("Hero dead");
    }return false;
  }
  //Method
  //presentation: isAlive -> boolean? 
  //Action : Level up -->How? 
  public static void main(String[] args) {
    Hero h1 = new Hero(10, 50,100, 200, 200);
   System.out.println(h1.isAlive());
   System.out.println("Hero is level " + h1.levelUp()) ;
    System.out.println(h1.getHP() + " " + h1.getMP() +" "+ h1.getExp()+ " " + h1.getMaxHP() + " "+ h1.getMaxMP());
    

  }
}
