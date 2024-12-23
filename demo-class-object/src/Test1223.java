public class Test1223 {
  public static void main (String [] args){
    //Compile time
    Person p1 = null;// 
    // p1.getK(); //Compile Error -> p1 come from Person. class and this has NO getK() method

    p1.getAge();
    // Compile OK -> p1 come from Person.class and this class has getAge() method
    // BUT!!
    //Runtime Error ->  bec
  }
}
