import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;

public abstract class Hero {
  // Level up -> increase Max HP , Max MP
  private long id;
  private int hp;
  private int mp;
  private int level;
  private double cc;

  // private Role role;

  public Hero(long id,int hp, int mp) {
    this.id = id;
    this.hp = 100;
    this.mp = 100;
    this.level = 1;
    this.cc = 0.1;

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

  public long getId(){
    return this.id;
  }

  public double getCC(){
    return this.cc;
  }
//----------Setter-------------------
  public void setLevel(int level){
    this.level = level;
  }
  public void setHp (int hp){
    this.hp = hp;
  }
  public void setMp (int mp){
    this.mp = mp;
  }

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

  //-------------------------MaxHP
  public static final int [] ARC_MAX_HP_TAB ;
  public static final int [] WAR_MAX_HP_TAB;
  public static final int [] MAG_MAX_HP_TAB;

  static {
    WAR_MAX_HP_TAB = new int [] {300,400,500,600,700,800,900,1_000,1_100,1_200};
    MAG_MAX_HP_TAB = new int [] {200,300,400,500,600,700,800,900,1_000,1_100};
    ARC_MAX_HP_TAB = new int [] {100,200,300,400,500,600,700,800,900,1_000};
  }

  public static int getMaxHP(Role role , int level){
    switch (role){
      case ARCHER:
      return ARC_MAX_HP_TAB[level -1];
      case WARRIOR:
      return WAR_MAX_HP_TAB[level -1]; 
      case MAGE:
      return MAG_MAX_HP_TAB[level -1];
      default:
      break;
    }return -1;
  }
  //-------------------------MaxMP
  public static final int [] ARC_MAX_MP_TAB ;
  public static final int [] WAR_MAX_MP_TAB;
  public static final int [] MAG_MAX_MP_TAB;

  static {
    WAR_MAX_MP_TAB = new int [] {100,150,250,350,500,650,800,950,1_200,1_500};
    MAG_MAX_MP_TAB = new int [] {300,400,500,600,650,750,900,1_200,1_500,2_000};
    ARC_MAX_MP_TAB = new int [] {200,300,400,500,600,700,850,1_000,1_300,1_600};
  }

  public static int getMaxMP(Role role , int level){
    switch (role){
      case ARCHER:
      return ARC_MAX_MP_TAB[level -1];
      case WARRIOR:
      return WAR_MAX_MP_TAB[level -1]; 
      case MAGE:
      return MAG_MAX_MP_TAB[level -1];
      default:
      break;
    }return -1;
  }
  // Method
  // presentation: isAlive -> boolean?(OK)
  // Action : Level up --> +MaxHP, +MaxMP, +attackPower 

  // Child class: Archer, Mage , Worrior
  // attackPower, (int ) -HP
  // Weapon

  // public static Warrior createWarrior (long id, int hp, int mp, int level,boolean superPunch, int maxHp, int maxMp){
  //   return new Warrior (id, hp,mp, level, superPunch, maxHp, maxMp);
  // }

  //LevelUP-------------------------
  public int levelUp(){
    int idx = 0;
    idx = this.level+ 1;
    return idx;
     }
  //AG-------------------------------
  public static final int [] ARC_AG_TAB ;
  public static final int [] WAR_AG_TAB;
  public static final int [] MAG_AG_TAB;

  static {
    WAR_AG_TAB = new int [] {20,30,40,50,60,70,80,90,100,110};
    MAG_AG_TAB = new int [] {10,20,30,40,50,60,70,80,90,100};
    ARC_AG_TAB = new int [] {40,50,60,70,80,90,100,110,120,130};
  }

  public static int getAg(Role role , int level){
    switch (role){
      case ARCHER:
      return ARC_AG_TAB[level -1];
      case WARRIOR:
      return WAR_AG_TAB[level -1]; 
      case MAGE:
      return MAG_AG_TAB[level -1];
      default:
      break;
    }return -1;
  }
  
  //PA-------------------------------
    public static final int [] ARC_PAPD_TAB ;
    public static final int [] WAR_PAPD_TAB;
    public static final int [] MAG_PAPD_TAB;
  
    static {
      WAR_PAPD_TAB = new int [] {40,50,60,70,80,90,100,110,120,130};
      MAG_PAPD_TAB = new int [] {10,20,30,40,50,60,70,80,90,100};
      ARC_PAPD_TAB = new int [] {20,30,40,50,60,70,80,90,100,110};
    }
  
    public static int getPa(Role role , int level){
      switch (role){
        case ARCHER:
        return ARC_PAPD_TAB[level -1];
        case WARRIOR:
        return WAR_PAPD_TAB[level -1]; 
        case MAGE:
        return MAG_PAPD_TAB[level -1];
        default:
        break;
      }return -1;
    }

//PD
    public static int getPd(Role role , int level){
      switch (role){
        case ARCHER:
        return ARC_PAPD_TAB[level -1];
        case WARRIOR:
        return WAR_PAPD_TAB[level -1]; 
        case MAGE:
        return MAG_PAPD_TAB[level -1];
        default:
        break;
      }return -1;
    }

    //MA-------------------------------
    
    public static final int [] ARC_MAMD_TAB ;
    public static final int [] WAR_MAMD_TAB;
    public static final int [] MAG_MAMD_TAB;
  
    static {
      WAR_MAMD_TAB = new int [] {10,20,30,40,50,60,70,80,90,100};
      MAG_MAMD_TAB = new int [] {40,50,60,70,80,90,100,110,120,130};
      ARC_MAMD_TAB = new int [] {20,30,40,50,60,70,80,90,100,110};
    }
  
    public static int getMa(Role role , int level){
      switch (role){
        case ARCHER:
        return ARC_MAMD_TAB[level -1];
        case WARRIOR:
        return WAR_MAMD_TAB[level -1]; 
        case MAGE:
        return MAG_MAMD_TAB[level -1];
        default:
        break;
      }return -1;
    }
    
//MD
    public static int getMd(Role role , int level){
      switch (role){
        case ARCHER:
        return ARC_MAMD_TAB[level -1];
        case WARRIOR:
        return WAR_MAMD_TAB[level -1]; 
        case MAGE:
        return MAG_MAMD_TAB[level -1];
        default:
        break;
      }return -1;
    }
    
    //CD------------------------------------- CD = CC * ROLE. PA
    
    public static int getCD(Role role , int level){
      int cd = 0;

      return cd;
    }

  public static void main(String[] args) {
    
    Warrior w1 = new Warrior(1, 100,100);
    Mage m1 = new Mage(1, 100, 100);
    Archer a1 = new Archer(1, 100, 100);
    
    w1.levelUp();
    m1.levelUp();
    a1.levelUp();
    System.out.println(w1.toString());
    System.out.println(m1.toString());
    System.out.println(a1.toString());
    
    System.out.println(getCC());
    // Ability<Mage> h1 = new Ability<>();
    // h1.setHero(new Mage(1, 100, 100));
    // System.out.println(h1.totalAg());
    // System.out.println(m1.toString());
    }
  }

