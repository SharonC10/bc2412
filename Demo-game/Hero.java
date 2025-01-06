import java.math.BigDecimal;

public abstract class Hero {
  // HP -health pt.
  // MP -magic pt.
  // Level up -> increase Max HP , Max MP
  private int hp;
  private int mp;
  private int level;
  // private Role role;

  // static final
  // private int maxHP;
  // private int maxMP;
  // private int exp;

  public Hero(int hp, int mp,int level) {
    this.hp = hp;
    this.mp = mp;
    this.level = level;
    // this.exp = exp;
    // this.maxHP = maxHP;
    // this.maxMP = maxMP;
  }


  public int getHP() {
    return this.hp;
  }

  public int getMP() {
    return this.mp;
  }

  public int getLevel() {
    return this.level;
  }



  // public int levelUp() { // if level up -> HP +100, MP +100, level+1
  // int idx = 0;
  // if (getExp() == 100) {
  // this.maxHP = BigDecimal.valueOf(getMaxHP()).add(BigDecimal.valueOf(100))
  // .intValue();
  // this.maxMP = BigDecimal.valueOf(getMaxMP()).add(BigDecimal.valueOf(100))
  // .intValue();
  // idx++;
  // }
  // return idx;
  // }



  public boolean isAlive() {
    int hpValue = this.hp;
    boolean isAlive = false;
    if (hpValue > 0) {
      System.out.println("Hero alive");
      return true;
    } else if (hpValue == 0) {
      System.out.println("Hero dead");
    }
    return false;
  }

  // Method
  // presentation: isAlive -> boolean?(OK)
  // Action : Level up --> +MaxHP, +MaxMP, +attackPower ,



  // public static void main(String[] args) {
  // Hero h1 = new Hero(10, 50, 100, 200, 200);
  // System.out.println(h1.isAlive());
  // System.out.println("Hero is level " + h1.levelUp());
  // System.out.println(h1.getHP() + " " + h1.getMP() + " " + h1.getExp() + " "
  // + h1.getMaxHP() + " " + h1.getMaxMP());

  // Child class: Archer, Mage , Worrior
  // attackPower, (int ) -HP
  // Weapon
  //

}
