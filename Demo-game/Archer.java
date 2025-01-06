public class Archer extends Hero{
  private int speed; //can speed up! when lev.+ , arrowSpeed ++

  public Archer (int hp, int mp, int level){
   super(hp,mp, level);
    this.speed = speed;
  }

  public int getSpeed(){
    return this.speed;
  }



  
}
