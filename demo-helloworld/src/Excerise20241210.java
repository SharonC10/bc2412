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
    System.out.println(averageScore); //64.66666

    //byte ,short, int, long
    // byte < short < int < long
    byte maxByte = 127;

    
    // can we assign int value to byte value? Not safe 
    // int value is the second boss, byte value little guy only
    // int value having 2B, byte max 127

    // byte value + int value -> int value
    // maxByte = maxByte -1; !! Not OK !!
    // 
    maxByte = (byte) (maxByte - 1);// Java: not Safe
    System.out.println(maxByte); // overflow


    //int value -> byte;
    int x7 = maxByte;
    //Java: is it Safe? it is safe. Int can cover byte's number

    // ! Java: (1) Compile time + (2) Run time 
    // Step 1: java file (.java) -> class file (.class):java code -> byte code (~machine)
    // 1.1 compile fail. for example (missing ; -> syntax error)
    // 1.2 compile sussess -> class file 

    // Step 2: Java Virtual Machine (JVM) -> convert class file to machine code -> execute machine code 
    //JVM using to run Java -> machine code


    

  }
  
}
