public class Warrior extends Hero {
  private boolean superPunch;// hv pet('T' tiger, 'W' wolf, 'D' Dargon)
  
  public Warrior(long id,int hp, int mp){
    super(id,hp,mp);
  }

//----------------------------------
public int getMaxHP(){
  return Hero.getMaxHP(Role.WARRIOR, super.getLevel());
} 
public int getMaxMP(){
  return Hero.getMaxMP(Role.WARRIOR, super.getLevel());
}

@Override
public int levelUp(){
  int idx = 0;
  int refilHP = 0;
  int refilMP = 0;
    idx = super.getLevel()+1;
    super.setLevel(idx);
    refilHP = getMaxHP();
    super.setHp(refilHP);
    refilMP = getMaxMP();
    super.setMp(refilMP);
    return idx;
  }

 
   
  // public int getMaxMp(){
  //   if ( super.getLevel() <= 10 ){
  //   this.maxMp += 50;
  //   }
  //    return this.maxMp;
  // }
  // @Override
  // public int maxMp(){
  //   if (super.getLevel() <= 10){
  //     this.maxMp +=50;
  //   }return this.maxMp;
  // }
//----------------------------------
  public int physicaAttack(){
    int idx = 0;
    
  }

  //-------------------------------
 

@Override
public String toString(){
  return "Warrior ["+
  "Id:"+ super.getId() +
  " HP:"+ super.getHP() +
  " MP:"+ super.getMP() +
  " Level:" + super.getLevel()+
  " MaxHP:" + getMaxHP() +
  " MaxMP:" + getMaxMP() +
  " ]";
}
public static void main(String[] args) {
  
}
  //Warrior have superPunch.
}

