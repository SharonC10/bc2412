public class Archer extends Hero{
  //private int speed; //can speed up! when lev.+ , arrowSpeed ++
  

  public Archer (long id, int hp, int mp){
   super(id,hp,mp);
    //this.speed = speed;
  }

  // public int getSpeed(){
  //   return this.speed;
  // }

  public int getMaxHP(){
    return Hero.getMaxHP(Role.ARCHER, super.getLevel());
  }
  public int getMaxMP(){
    return Hero.getMaxMP(Role.ARCHER , super.getLevel());
  }

  @Override
  public int levelUp(){
    int idx = 0;
    int refilHP = 0;
    int refilMP = 0;
    idx = super.getLevel() +1;
    super.setLevel(idx);
    refilHP = getMaxHP();
    super.setHp(refilHP);
    refilMP = getMaxMP();
    super.setMp(refilMP);

    return idx;
  }

  @Override
  public String toString(){
    return "Archer ["+
    "Id:" + super.getId()+
    " HP:"+ super.getHP()+
    " MP:" + super.getMP()+
    " Level:" + super.getLevel()+
    " MaxHP:" + getMaxHP() +
    " MaxMP:" + getMaxMP()+
    "]";
  }


  
}
