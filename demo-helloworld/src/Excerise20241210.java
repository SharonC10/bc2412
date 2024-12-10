public class Excerise20241210 {
  public static void main (String[]args) {
    double priceForApple = 7.3;
    double priceForOrange = 6.5;
    int quantityOfApple = 3;
    int quantityOfOrange = 4;

    double x = priceForApple * quantityOfApple;
    double y = priceForOrange * quantityOfOrange;
    double totalAmount = x + y;
    System.out.println(totalAmount);
    // identify the priceOfApple as 7.3 * 3 -> 21.9
    // identify the priceOfOrange as 6.5 * 4 -> 26
    // finally 21.9 + 26 = totalAmount -> 47.9

    int mathScore = 73;
    int englishScore = 60;
    int historyScore = 61;
    double averageScore = (mathScore + englishScore + historyScore) / 3.0 ;
    System.out.println(averageScore);

  }
  
}
