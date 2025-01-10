public class Ability <T extends Hero>{

  private T hero;

  public void setHero( T hero){
    this.hero = hero;
  }

  public double totalAg(){
    return this.hero.ag();
  }

  
}
