public class DemoForLoop {
  public static void main (String [] args ){

    // 2^100
    int x = 2;
    x = x * 2;
    x *= 2;
    System.out.println(x); //8 ------Q1
    //problem: can type 100 times.


    
    //For Loop
    //e.g 
    // for(int X = 0 ; X < or > ? ; X ++){
    // System.out.println(XXX); 
    //}

    //! i < 3 (continue criteria)
    // i++ (modifier)
    // ! you have to let the modifier work with "continue criteria", so that 
    // ! the continue crtieria at the end become false 
    //! for (initilization; condition ; modifier)


    for (int i = 0; i < 3; i++) { // 0,1,2 or 3 - 0
      //<= , don't use it 
      System.out.println("hello");
    //Step1. int i = 0;  go 1 times
    
    //Step2. i <3 (question) -> true
    //checking if i < 3

    //Step3. if true, print hello-------------0
    //enter into code block

    //Step4. i++, i become 1
    // i++ -> i + 1 --> 0 + 1 for next


    //Step5: i (1)now < 3 (queston ) ->true
    // checking with i < 3?? 

    //Step6. if true , print hello ---------------1

    //Step7. i++ , i become 2
    // i++ -> (1) + (1) -> 2

    //Step8. i (2)now < 3 (question ) -> true 

    //Step9. if true , print hello-----------------2

    //Step10. i++ , i become 3

    //Step11. i <3 (question ) -> false 

    // !!! Step12. exit for loop !!!
    }

    //Test
    for (int f = 0 ; f < 5; f++){ //0,1,2,3,4 ; 5-0 -> 5times
    System.out.println("Sharon");
    }


    for (int yy = 0 ; yy < 10 ; yy ++){
      System.out.println(yy);
    }
    // yy = 0 like identify ; yy < 10 -> like how many time to repeat; 
    //yy ++ -> the calculate ( yy + 1)








    //print even numbers
    for (int i = 0 ; i < 10; i++){
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }// 0,2,4,6,8

      //print 0 -100 , divided by 3 and 4
    for (int a = 0 ; a < 101; a++){
      if (a % 3 == 0 && a % 4 == 0 ){
        System.out.println(a);// 12, 24,36, 48, 60 ,72,84, 96
      }
    }

    // odd number
    for ( z = 0 ; z < 10 ; z++){
      if (z % 2 == 1){
        System.out.println(z);
      }
    }








    //sum up 0 -20, 0+ 1 +2 ....+20
    
    //for (int sum = 0; sum < + 21 ; sum  ) { // 0 - 19
      //System.out.println(sum);
    //}

    int sum = 0;
    for ( int c = 0; c <= 20 ; c++){
      sum = sum + c;
    }
    System.out.println(sum);//210

    //System.out.println(i); // ! is declared withing the for loop
    // c-- why? what it is?

    //sum up all odd between 0 -10
    sum = 0;
    for (int h = 0 ; h  < 11; h++){
      if (h % 2 == 1){
        sum += h;

      }
    }
    System.out.println(sum); //25------------







    int sum2 = 0;
    for (int p = 0; p <= 10 ; p++){
      sum2 = sum2 + p; {if ( (sum2 + p) % 2 == 1);
      }
      System.out.println(sum2);

    }
    
      //1. check if 'd' exists in the string.
      // for loop + charAt

      String str = "abcdefijk";
     
      for ( int r = 0 ; r <= 10  ; r++ ){ // loop what? 
        // loop str -> having 'd'?
        str = str + r; { char isCharExist = str.charAt(r);
      }
      
      System.out.println(isCharExist);


      }


  }
}