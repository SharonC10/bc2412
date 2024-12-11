public class DemoString {
  public static void main (String[] args ){
    char x = 'a';
    x = 1; //!???
    // x = 1.1
    // x = ture
    x = 'x'; // <- re-assignment 
    // char x = 'o';

    // ! define a String calue by double quote"
    // ! define a char calue by single quote"
    // char x = 'abcd1234' No!!
    String password = "abcd1234";
    String emailAdress = "abc@gmail.com";
    
    // 1. charAt 
    // String only can push
    // + operarion
    password = password + "!";
    System.out.println("helloworld");
    System.out.println(password); // abcd1234!

    //Java Method (Instance method)
    // action /tools ( the 8 pr ) String is tools
    //password.charAt(0); //all the intex start from '0' 

    // 1. charAt 
    // charAt -> put int calue inside () 
    char result = password.charAt(0);// 0 represents the first position of the String value
    System.out.println(result);//a

    // ! index start from '0' to length -1 
    // (abcd1234! -> length is 123456789 means 9-1 =8 -> charAt length should be 012345678)
    System.out.println(password.charAt(8));//!
    // System.out.println(password.charAt(-1)); //error! cannot over password range
    // System.out.println(password.charAt(9)); //error! cannot over password range




    // 2. equals
    // very importment, 
    String s1 = "abc" ;
    String s2 = "abc" ; 
    boolean result2 = s1.equals(s2);
    System.out.println(result2);//true

    String h1 = "girl";
    String h2 = "boy";
    boolean result3 = h1.equals(h2);
    System.out.println(result3);//false

    //Vincent 
    // String s3 = "abc";
    // String s4 = "def";
    // boolean result3 = s3.eqals(s4);
    // System.out.println(result3);





    // 3. length()
    int result4 = password.length();
    System.out.println(result4);// should be 9, the length 
    
    //String password2 = "0000000000";
    //int result4 = password2.length();
    //System.out.println(result4);

    

    



  }
}