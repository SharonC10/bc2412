public class Deck {
  private Card [] cards;
  //--------------------------
//Construtor
  public Deck (){
    //char [] suites = new char []{'D','C','H','S'};
    //char [] ranks = new char []{'A','2','3','4','5','6',
//'7','8','9','T','J','Q','K'};

    this.cards = new Card[Card.suites.length * Card.ranks.length ];
    int idx = 0;
    for (char rank : Card.ranks) {
      for (char suite : Card.suites){
        this.cards[idx++] = new Card(rank, suite);
      }
    }
  }

public Card [] getCards(){
  return this.cards;
}


  public static void main (String [] args){
    Deck deck1 = new Deck();//52 cards
    //Card.x = 10;//final x = 3;
    for (Card card : deck1.getCards()) {
      System.out.println(card.getRank() + " " + card.getSuite());
    }

  }
}
