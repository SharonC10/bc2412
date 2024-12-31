public class Student {
  private int score;
  private static int candyCount = 20;
  public static final int [] scores = 
  new int []{67,89,50,99,60,59};

  //expect output;
  //20 candies -> distribute students according to score
  //Rule: Every round of ditribution, above 80 score ->2 candies ; 
  //Above 60 - 79  score -> 1 candy; 
  
  public Student (int score){
this.score = score;
  }

  private int getScore(){
    return this.score;
  }
  private static int getCandyCount(){
    return candyCount;
  }

  public void getCandy(int score){
    int idx = 0;
    for (int scores: Student.scores){
      if(this.score > 80 ){
        idx = candyCount - 2;
      }else if 
      (this.score >= 60 && this.score <=79){
        idx = candyCount - 1;
      }else if 
      (this.score < 60){
        idx = candyCount - 0;
      }

    }
  }
  public static void main (String []arg){
 Student s1 = new Student(99);
 System.out.println("Student's score" + s1.getScore()
  + "has" + null + "candies");
  }
  }
  //Student 1 : 67score
  //Student 2: 89
  //Student 3; 50
  //Student 4: 99
  //Student 5: 60
  //Student 6: 59

  //1: 1 | 1
  //2: 2 | 
  //3: 0
  //4: 2
  //5: 2
  //6: 0

  //expected
  //1:4
  //2: 6 | 
  //3: 0
  //4: 6
  //5: 4
  //6: 0

  //Student 1 has 4 candies
  //Student 2 has 6 candies
  //Student 3 has 0 candies
  //Student 4 has 6 candies
  //Student 5 has 4 candies
  //Student 6 has 0 candies

  //tips: static
  //for loop

