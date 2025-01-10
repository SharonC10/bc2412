import java.util.Objects;

public class Mage extends Hero {
  
public Mage (long id, int hp, int mp){
    super(id, hp, mp);
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
