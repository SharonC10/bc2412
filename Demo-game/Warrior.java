public class Warrior extends Hero{
  private boolean superPunch;// hv pet('T' tiger, 'W' wolf, 'D' Dargon)
  private int maxHp;
  private int maxMp;
  private char pet;

  public Warrior(int hp, int mp, int level, boolean superPunch, int maxHp, int maxMp){
    super(hp,mp, level);
    this.superPunch = superPunch;
    this.maxHp = maxHp;
    this.maxMp = maxMp;
    this.pet = pet;
  }

  public boolean getSuperPunch() {
    return this.superPunch;
  }

  public int getMaxHp(){
    if ( super.getLevel() <= 10 ){
    this.maxHp += 100;
    }
     return this.maxHp;
  }

  public int getMaxMp(){
    if ( super.getLevel() <= 10 ){
    this.maxMp += 50;
    }
     return this.maxMp;
  }

  public char getPet(){
    char x = ' ';
    if (super.getLevel() == 2){
    x = 'T';
    this.pet = x;
    }return this.pet;
  }
  
public static void main(String[] args) {
  Warrior w1 = new Warrior(100, 100, 1, true,100 ,100);
  System.out.println("Warrior maxHP is " + w1.getMaxHp());//100
  w1.getLevel();
  System.out.println(w1.getLevel());//100
  w1.getPet();
  System.out.println(w1.getPet());


  //Warrior have superPunch.

  //when level 1 => maxHP +100, maxMP +50
}
}
