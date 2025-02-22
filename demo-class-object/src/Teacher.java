public class Teacher {
  private Candy2[] candies;//object reference 
  private Student2[] student2s;

  // ---------------------Construtor
  public Teacher(Candy2[] candies, Student2[] student2s) {
    this.candies = candies;
    this.student2s = student2s;
  }

  // ------------------------------------
  // public Teacher() {
  //   this.candies = new Candy2[Candy2.candyNum];
  //   int idx = 0;
  //   for (int i = 0; i < Candy2.candyNum; i++) {
  //     for (char color : Candy2.colors) {
  //       this.candies[idx++] = new Candy2(color);
  //     }
  //   }
  // }

  // ---------------------getter
  public Candy2[] getCandy2() {
    return this.candies;
  }


  // add color? ---------------------
  // public void addColor(Candy2 candies) {
  //   Candy2[] newCandy2s = new Candy2[this.candies.length + 1];
  //   for (int i = 0; i < this.candies.length; i++) {
  //     newCandy2s[i] = this.candies[i];
  //   }
  //   newCandy2s[newCandy2s.length - 1] = candies;
  //   this.candies = newCandy2s;
  // }

  // ---------------------------------

  public static boolean shouldDistribute(int score, char color) {
    return score >= 80 && color == 'R'
        || score >= 60 && score < 80 && color == 'B' 
        || score < 60 && color == 'Y';
    // for (Student2 student2 : this.student2s) {
    // if (student2s.getScore() >= 80 && candy.getColor() == 'R'
    // || student2s.getScore() >=60 && student2s.getScore()<80 &&candy.getColor()()== 'B'
    // || student2.getScore() < 60 && candy.getColor() =='Y') {
    // student2.receiveCandy(candy);

  }

  public void clearCandy(int pos) {
    this.candies[pos] = null;
  }

  // Teacher, Candy2 , Student2
  // ---------------------------------
  public void distribute() {
    int pos = 0;
    while (true) {
      for (Student2 student : this.student2s) {
        if (shouldDistribute(student.getScore(), this.candies[pos].getColor())) {
          student.receiveCandy(this.candies[pos]); // student candy bag + 1
          this.clearCandy(pos); // teacher's candy bag - 1
          if (++pos >= this.candies.length)
            return;// while return -> nothing 
        }
      }
    }
}
  // -------------------------------
  public static void main(String[] args) {
    // new Candy2('R')
    // Tecacher t1 = new Teacher();
    // t1.distribute() <-> s1.setCandies()
    Candy2[] candies = new Candy2[] {new Candy2('R'), new Candy2('R'),
        new Candy2('R'), new Candy2('Y'), new Candy2('B'), new Candy2('R'),
        new Candy2('Y'), new Candy2('R'), new Candy2('R'), new Candy2('R'),
        new Candy2('R'), new Candy2('B'), new Candy2('B'), new Candy2('R'),
        new Candy2('Y'), new Candy2('Y'), new Candy2('R'), new Candy2('R'),
        new Candy2('R'), new Candy2('B')};
    Student2 [] students =  new Student2[] {new Student2(1L, 67),
      new Student2(2L, 89),new Student2(3L, 50),new Student2(4L, 67)
      ,new Student2(5L, 60), new Student2(6L , 59)};

    Teacher t1 = new Teacher(candies, students);
      t1.distribute();
  
    // t1.addColor(new Candy2('R'));
    // t1.addColor(new Candy2('Y'));
    // t1.addColor(new Candy2('B'));


for (Student2 student : students ){
  System.out.println(
    "Student" + student.getId() + " - " + student.getCandiesInfo());

}

  }
}
