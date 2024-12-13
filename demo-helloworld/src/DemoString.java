public class DemoString {
  public static void main (String[] args ){
    char x = 'a';
    x = 1; //!???
    // x = 1.1
    // x = ture
    x = 'x'; // <- re-assignment 
    // char x = 'o';

    // 1. String
    // ! define a String value by double quote ""
    // ! define a char value by single quote ''
    // !!char x = 'abcd1234' No!! only single word in char.
    String password = "abcd1234";
    String emailAdress = "abc@gmail.com";

    
    // String only can +
    // + operarion
    password = password + "!";
    System.out.println("helloworld");//show "helloworld"---------1
    System.out.println(password); // abcd1234!---------2

    //test 
    System.out.println("Hi i'm Sharon.");//----------3
    // Hi i'm Sharon.
    password = password + "!!";
    System.out.println(password);
    // abcd1234!!!-------Q4




    //Java Method (Instance method)
    // action /tools ( the 8 pr ) String is tools
    //password.charAt(0); //all the intex start from '0' 

    // 2. charAt 
    // charAt -> put int calue inside () 
    char result = password.charAt(0);
    // 0 represents the first position of the String value
    System.out.println(result);//a----------Q5
    //String password = "abcd1234";

    //test 
    //String result2 = password.charAt(3);
    // !! charAt only can use char to present
    char result10 = password.charAt(5);
    System.out.println(password);//--------Q6 it only show password
    System.out.println(result10);//--------Q7 //2


    // ! index start from '0' to length -1 
    // (abcd1234! -> length is 123456789 means 9-1 =8 -> charAt length should be 012345678)
    System.out.println(password.charAt(8));//!------Q8
    // System.out.println(password.charAt(-1)); //error! cannot over password range
    // System.out.println(password.charAt(9)); //error! cannot over password range

    // Problem: print the last character of string.
    String password2 = "helloworld";
    char lastChar = password2.charAt(password2.length() - 1);
    System.out.println(lastChar); // d-----------Q9


    // 2. equals
    // very importment, true/ false
    String s1 = "abc" ;
    String s2 = "abc" ; 
    boolean result2 = s1.equals(s2);
    System.out.println(result2);//true--------Q10


    //test
    String h1 = "girl";
    String h2 = "boy";
    boolean result3 = h1.equals(h2);
    System.out.println(result3);//false-----------Q11

    //Vincent 
     String s3 = "abc";
     String s4 = "def";
     boolean result5 = s3.equals(s4);
     System.out.println(result5);//false --------Q12





    // 3. length()
    int result4 = password.length();// check password length
    System.out.println(result4);// should be 11, the length 
    
    //test
    String password3 = "0000000000";
    int result6 = password3.length();
    System.out.println(result6);//10 ---------Q14

    char result7 = password3.charAt(5);
    System.out.println(result7);//0------Q15


    

    


    // Empty String
    String emptyString = "";
    System.out.println(emptyString.length());//0-------Q16
    boolean isStringEmpty = "".equals(emptyString);
    // asking if emptyString equals to ""
    // right to the left!
    System.out.println(isStringEmpty);//true---------17


String s = "hello";
System.out.println("hello".equals(s));
// true, asking if s equals to "hello-----------18

System.out.println("hello".charAt(2)) ;//l

//test 
String cat = "Neco";
System.out.println("Neco".equals(cat));
// it will show true or false

System.out.println("Neco".charAt(3));



// 'c'.charAt() // primituce has no method (tool)

    //isEmpty
    String s5 = "abc";
    // check if s5 is empty?
    boolean isEmpty = s5.length() == 0;
    System.out.println(isEmpty); // false 
    System.out.println(s5.isEmpty());// false  22?

    String ua = " ";
    boolean isEmpty2 = ua.length() == 0;
    System.out.println(isEmpty2) ; // or 
    System.out.println(s5.isEmpty());


    //!! substring
    // s5 = abc
    //s5.substring(x, x);
    String substr = s5.substring(0, 2);
    //! s5's value doesn't change 
    //! substr is storing a new String value returned by "substring"
    System.out.println(substr); // ab
    System.out.println(s5.substring(0,3)); //abc
    System.out.println(s5.substring(0,s5.length())); // abc
    System.out.println(s5.substring(1,s5.length())); //bc
    System.out.println(s5.substring(1)); //bc 
    // using substring -> want to cut out smth.
    



    String l10 = "hello";

  }
}