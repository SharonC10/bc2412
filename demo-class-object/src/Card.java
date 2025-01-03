public class Card {
  //String (more than one char) vs char (single character)
  private char rank; //1-13 (10 ->'T') //int ?? (1,2,3,....11,12,13)
  private char suite;//'D','C','H','S'
  public static final char [] suites = new char []{'D','C','H','S'};
  public static final char [] ranks = new char []{'A','2','3','4','5','6',
'7','8','9','T','J','Q','K'};
//static : share values
//final: cannot be modified after initialization
//static and final can be together
//static first, final second 
//static final -> constant (mins 60s, pi 3.14159,)
//Constant naming convention 
//e.g: public static final char [] RANKS 

public static final int x = 3;
//----------------------------------
  public Card (char suite, char rank){
    this.suite = suite;
    this.rank = rank;
  }

//--------------------------------
  public char getSuite(){
   return this.suite;
  }
  public char getRank(){
    return this.rank;
  }
//----------------------------------
  
}
