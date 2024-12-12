public class Demoif {
  public static void main(String[] args) {


    // if -> check event -> event result
    //int
    int x = 3;
    if (x > 2) {// "x>2" is an event -> true / false 
      System.out.println("x is > 2.");
    }//x is > 2. --------Q1

    //Test 
    int hight = 171;
    if (hight >180 ){
      System.out.println("hight is > 180.");
    }// do not show, as it is false.





    //length
    String s = "hello";
    // i wanna check if lenght >3??
    if (s.length() > 3) {
      System.out.println(" s lenght > 3.");
      // if s lenght > 3 --> show "s lenght > 3. "
    }// s lenght >3. -----Q2

    //test 
    String email = "1234a@gmail.com";
    if (email.length() > 10){
      System.out.print("email length > 10");
    }//email length > 10 -------Q3





    // equals, charAt
    // Vincent
    if ("hello".equals(s)){
      System.out.println("s equals to hello");
    }

    //test
    String d = "dog";
    String c = "cat";
    if (d.equals(c)) {
      System.out.println("d is equals to c");
    } // is not equals

    String name = "Mary";
    String name2 = "May";
    if (name.equals(name2)) {
      System.out.println("Mary is May");
    }

    int meme = 28;
    int lulu = 28;
    if (meme.equals(28)){
      System.out.println("meme is lulu.");
    }










    // == , >=
    String company = "abc";
    char result = company.charAt(0);
    if (company.charAt(0) == 'a') {
      System.out.println("Yes");
    }


    // vincent
    if (s.charAt(1) == 'e') {
      System.out.println("the char at index 1 = e ");
    }



    if (x > 5) {
      System.out.println("x > 5");
    } else {// x <=5
      System.out.println("x <= 5.");
    }
    // Step1: if x > 5 (fact x = 3)
    // Step2: if >5 show "x > 5."
    // Step3: else show " c <= 5."



    int y = 10;
    // check if y is an ecen number
    if (y % 2 == 0) {
      System.out.println("it is an even number");
    }
    if (y % 2 != 0) {
      System.out.println("it is signal number.");
    }

    // Vincent
    // if (y % 2 == 1){
    // System.out.println("it is an odd number")}



    // check if y > 3 and is it even number
    if (y > 3 && y % 2 == 0) {
      System.out.println("it is good.");// it is good ------Q7
    }



    int t = 11;
    if (t % 2 == 0) {
      System.out.println("it is event number. ");
    } else {
      System.out.println("it is odd number");
    } // ------------odd number ---Q8



    char k = 'k';
    if (k == 'k') {
      System.out.println("k = k.");
    }



    int age = 17;
    boolean isAudlt = age >= 18;
    System.out.println(isAudlt);
    if (isAudlt == false) {
      System.out.println("it is not Audlt.");

    }
    if (!isAudlt) { // use this one!!
      System.out.println("it is not Audlt.");

    }


    int score = 89;
    char gender = 'M';
    // score >= 90 -> A grade
    // score between 85 -and 89 grat T

    // score between 80 -89 -> B
    // score between 70 -79 -> c
    // under 70, grade F
    char grade = ' ';

    if (score >= 90) {
      grade = 'A';
    } else if (score >= 85 && score <= 89 && gender == 'F'
        || score >= 87 && score <= 89 && gender == 'M') {
      grade = 'T';
    } else if (score >= 80 && score <= 84 && gender == 'F'
        || score <= 80 && score >= 86 && gender == 'M') {
      grade = 'B';
    } else if (score >= 70 && score <= 79) {
      grade = 'C';
    } else if (score < 70) {
      grade = 'F';
    }
    System.out.println(grade); // C
    // also consider maintance

    // Part B
    // score >= 90 -> A grade
    // score between 85 -and 89 for female, grade T
    // score between 87 and 89 for male, grade T
    // score between 80 -84 for female, grade B
    // score between 80 - 86 for male, grade B
    // under 70, and 79 grade C
    // under 70 grade F

    // Vincent
    // Test cases
    // 1. M 90 --> A
    // 2. F 90 ---> A
    // 3. M 86 --> B
    // 4. F 86 --> T
    // 5. M 85 --> B
    // 6. F 85 --> T
    // 7. M 79 --> C
    // 8. F 79 -->C
    // 9. M 69 ---> F
    // 10. F 69 ---> F
    // expected result!!! test it using the code
    // thing ho test plan sin



    // boolean & char test



  }

}
