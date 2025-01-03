public class Student2 {
  private long id;
  private int score;
  private Candy2 [] candies;

  public Student2 (int score){
    this.score = score;
    this.candies = new Candy2[0];
    this.id = id;
  }

  public int getScore(){
    return this.score;
  }

  public int getCandyCount(){
    return this.candies.length;
  }
  
  public long getId(){
    return this.id;
  }

  public void receiveCandy(Candy2 candy){
    //new array
    Candy2 [] candies = new Candy2 [this.candies.length +1 ];
    //for loop to copy
    for (int i = 0 ; i < this.candies.length; i++){
      candies[i] = this.candies[i];
    }
    //place candy at the tail
    //repace the reference
candies[candies.length - 1 ]= candy
//replace the reference
this.candiies = candies;
  }






 

}
