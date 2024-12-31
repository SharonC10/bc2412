public class DemoComparesion {
  public static void main (String[]args){

    // >, < , >=, <=, != not equral, == 
    // '==' checking with yes or no
    //'=' -->assignment 

    int age = 70;
    boolean isAudlt = age >= 18; // defination 
    System.out.println(isAudlt);

    double pi = 3.14159;
    boolean isCorrect = (pi == 3.14159) ;
    System.out.println(isCorrect);

    char gender = 'F';
    boolean isMale = (gender == 'M') ;
    System.out.println(isMale);//false   3

    float price = 10.2f;
    System.out.println(price != 10.2f);//false  4
    //System.out.println(price != 10.2); //true

    // ! operator
    // not 
    boolean result = !(isAudlt);
    System.out.println(result); // false 5

    
    if (age >= 18); // do smth

    if (!(age >= 18)); // means age <18

    if(!isAudlt);//means if not isAudlt



    // && And 
    int age2 = 30;
    char gender2 = 'F';
    boolean result2 = age2 >= 30 && gender2 == 'M';
    //event: age2 >= 330 --> true
    //event2 : gender2 == 'M' ---> false 

    System.out.println(result2);//false  6

    


    // || Or (true || false) -> true
    boolean result3 = age2 >= 30 || gender2 == 'M';
    // event 1: age2 >= 30 -> true
    // event 2: gender2 == 'M' --> false 
    // || means 'or' ---> result3 is true.

    System.out.println(result3); // true 7


    // || or (false || false ) -> false 
    int price2 = 100;
    char apple = 'a';
    boolean result5 = price2 <=99 || apple == 'b';
    System.out.println(result5); // false 8




    // and or (true and (false or true)) -> true
    //age2 = 30;
    boolean result10 = age2 >= 30 && (gender2 == 'M' || age2 > 18);
    System.out.println("result10:" + result10);

    // true && (true || false )
    int age3 = 31;
    char isSmoker = 'N';
    boolean result6 = age3 >=31 && (age3 < 31 || isSmoker == 'N');
    //9
    System.out.println("result6:" + result6);// true 9
    // is >=31 and !isSmoker
    //Step1: age >= 31 -> true ; 
    //Step2: isSmoker 'no' --> true;
    // age >=31 and not smoker -> true





    //Me test
    String pet = "dog";
    int age4 = 10;
    char gender3 = 'F';
    boolean result7 = (pet == "cat" || age4 <= 10);
    //10
    System.out.println(result7);//ture
    // not a cat but age is 10 
    //Step1: Pet is 'dog' --> false 
    //Step2: age = 10 = <=10 ---> true

    boolean result8 = (gender3 == 'F' && (pet == "dog" || age4 > 11));
    //11
    System.out.println(result8);//true
    // Step1: pet == dog?? ---> true ||or age4 > 11? ---> false 
    // -----> true
    // Step2: gender is 'F' ---> true && and pet is dog ---> true
    //-----> true

//Vincent 
boolean result9 = age3 >= 30 && (gender2 == 'M'|| age2 > 18);
//12
System.out.println(result9);
//Step1: (gender2 == 'M' || age2> 18 ) -> false || true ----->true
// Step2: 

    
    


 //CBCBDBDACA
//CBDADBDACA
 


  }
  
}
