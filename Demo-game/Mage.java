import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Mage extends Hero {
  private int pa;

  
public Mage (long id, int hp, int mp){
    super(id, hp, mp);
    this.pa = 10;
  }

  public int getMaxHP(){
    return Hero.getMaxHP(Role.MAGE, super.getLevel());
  }
  public int getMaxMP(){
    return Hero.getMaxMP(Role.MAGE, super.getLevel());
  }
  public int getAg(){
    return Hero.getAg(Role.MAGE, getLevel()) ;
  }
  public int getPa(){
    return Hero.getPa(Role.MAGE, getLevel());
  }
  public int getPd(){
    return Hero.getPd(Role.MAGE, getLevel());
  }
  public int getMa(){
    return Hero.getMa(Role.MAGE, getLevel());
  }
  public int getMd(){
    return Hero.getMd(Role.MAGE, getLevel());
  }
  //CC--------------------------------------------
  public int cc = new Random().nextInt(5);
  @Override
  public int getCC(){
    int [] ccArr = new int[0];
    int count = 0;
    int value = 0;
    while (count < 5){
      value = new Random().nextInt(5);
      if (!isDuplicated(ccArr, value)) { //ccArr only hv one place , value = 0-8 random
        ccArr[count] = value; // when arr [0] = value (random 0- 8) 
      } System.out.println(Arrays.toString(ccArr));
    }
    return value;
  } 

  public static boolean isDuplicated(int[] arr, int newValue) { //define what is isDuplicated

    boolean isDuplicated = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == newValue)
        return true;

    }
    return false;
  }
//CD-----------------------------------------------


  // @Override
  // public int ag(){
  //   return 10;
  // }

  @Override
  public int levelUp(){
    int idx = 0;
    int refilHP = 0;
    int refilMP = 0;
      idx = getLevel()+1;
      super.setLevel(idx);
      refilHP = getMaxHP();
      super.setHp(refilHP);
      refilMP = getMaxMP();
      super.setMp(refilMP);

return idx;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj)
    return true;
    if (!(obj instanceof Mage))
    return false;
    Mage mage = (Mage) obj;
    return Objects.equals(mage.getId(), super.getId())
    && Objects.equals(mage.getHP(), super.getHP())
    && Objects.equals(mage.getMP(), super.getMP())
    && Objects.equals(mage.getLevel(), super.getLevel());
  }
  @Override
  public int hashCode(){
    return Objects.hash(mage.getId(), super.getId())
    && Objects.hash(mage.getHP(), super.getHP())
    && Objects.hash(mage.getMP(), super.getMP())
    && Objects.hash(mage.getLevel(), super.getLevel()); 
  }
  
  @Override
  public String toString(){
    return "Mage ["+
    "Id:" +super.getId() +
    " HP:" + super.getHP()+
    " MP:" + super.getMP()+
    " Level:" + super.getLevel()+
    " MaxHP:" + getMaxHP()+
    " MaxMP:" + getMaxMP() +
    " AG:" + getAg()+
    " ]";
  }
  
}
