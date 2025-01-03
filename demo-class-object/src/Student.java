public class Student {
  //public Score[] scores;
  private int score;
  private int candyCount;

  public Student(int score){
    this.score = score;
    this.candyCount = candyCount;
  }
  // expect output;
  // 20 candies -> distribute students according to score
  // Rule: Every round of ditribution, above 80 score ->2 candies ;
  // Above 60 - 79 score -> 1 candy;
  // ------contrutor--------
  // public Student() {
  //   this.scores = new Score[0];
  // }

  // // ------------Getter------
  // public Score[] getScores() {
  //   return this.scores;
  // }

  // // ----------------------------
  // // add score?

  // public void addScore(Score scores) {
  //   Score[] newSocres = new Score[this.scores.length + 1];
  //   for (int i = 0; i < this.scores.length; i++) {
  //     newSocres[i] = this.scores[i];
  //   }
  //   newSocres[newSocres.length - 1] = scores;
  //   this.scores = newSocres;
  // }

  // // ---------------------------------

  // public Score [] obtainCandies(int score) {
  //   Score[] newScores = new Score[this.scores.length];
  //   int idx = 0;
  //   Student count = null;
    
  //     for (int i = 0; i < this.scores.length; i++) {
  //       if (this.scores[i].getScore() > 80) {
  //         idx += 2;
  //       } else if (this.scores[i].getScore() >= 60 && this.scores[i].getScore() <= 79) {
  //         idx++;
  //       } else if (this.scores[i].getScore() < 60) {
  //         idx = 0;
  //       }
  //     }return count;
    
    // public Student() { // Obtain
    // this.score = new int[]{67, 89, 50, 99, 60, 59};
    // int idx = 0;

    // for (int i = 0; i < scores.length; i++){
    // if (this.scores[i] > 80) {
    // idx +=2 ;
    // } else if (this.scores[i] >= 60 && this.scores[i] <= 79) {
    // idx++;
    // } else if (this.scores[i] < 60) {
    // idx = 0;
    // }
    // }


    // }

    // public String obtainCandy() {
    // int candyNum = this.score();
    // int idx = 0;
    // if (this.score > 80) {
    // idx = candyNum - 2;
    // return "Obtain 2 candies";
    // } else if (this.score >= 60 && this.score <= 79) {
    // idx = candyNum - 1;
    // } else if (this.score < 60) {
    // idx = candyNum - 0;
    // }



  }
  // --------------getter---------
public int getScore(){
  return this.score;
}

public void addOne(){
  this.candyCount++;
}

public void addTwoCandy(){
  this.countCount += 2;
}
  public static void main(String[] args) {
    // Student student1 = new Student();

    // Assign c1 = new Assign(20);

    
    // Student d1 = new Student();
    // d1.addScore(new Score(67));

    // for (Score score : d1.obtainCandies(67)){
    //   System.out.println(null);
    // }
    // // for (null null ; student1.getScore()){
    // // System.out.println(scores.getScore() + " " + scores.getCandy());
    // // }

    // Student [] students = new Student[] {new Student(67),new Student(89),
    //   new Student(50),new Student(99),new Student(60),new Student(59)};

      //while loop
      while (Candy.count > 0) {
        //if ()
        for (Student s : students){
          if (s.addOneCandy() >= 80){
            s.addTwoCandy();
            Candy.count -=2;
          }else if (s.getScore()>=60 && s.getScore() < 80){
            s.addOneCandy();
            Candy.count--;
          }
        }
        

        
      }

  }

// Student 1 : 67score
// Student 2: 89
// Student 3; 50
// Student 4: 99
// Student 5: 60
// Student 6: 59

// 1: 1 | 1
// 2: 2 |
// 3: 0
// 4: 2
// 5: 2
// 6: 0

// expected
// 1:4
// 2: 6 |
// 3: 0
// 4: 6
// 5: 4
// 6: 0

// system out
// Student 1 has 4 candies
// Student 2 has 6 candies
// Student 3 has 0 candies
// Student 4 has 6 candies
// Student 5 has 4 candies
// Student 6 has 0 candies

// tips: static
// for loop


// Question 2
// 開一個 Student2.class to store his own candies
// Candy.class has attribute color,
// 20 candies -> distribute students according to score
// Rule: Every round of ditribution, above 80 score -> RED candies ;
// Above 60 - 79 score -> BLUE candy; the rest YELLOW;

// red, blue, yellow
// expected output :Sysout return Student [](Student should have Candy attribute)


