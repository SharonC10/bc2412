public class Person2 {
  private String nickName;
  private int age;
  private String email;
  private char gender;

  public Person2(String nickName, int age, String email, char gender) {
    this.nickName = nickName;
    this.age = age;
    this.email = email;
    this.gender = gender;
  }

  public String getNickName() {
    return this.nickName;
  }

  public int getAge() {
    return this.age;
  }

  public String getEmail() {
    return this.email;
  }

  public boolean isMale() {
    return this.gender == 'M' ? true : false;
    // condition ? expression1 : expression2
  }

  public int getNickNameLength() {
    return this.nickName.length();
  }

  public char getGender(){
    return this.gender;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setEmail(String email) {
    this.email = email;
  }

public static void main (String []args){
  Person2 p1 = new Person2 ("Sharon", 18, "sharon@gamil.com",'F');
  Person2 p2 = new Person2 ("Kimmy", 20, "kimmy@gmail.com", 'F');
  
  System.out.println(p1.getNickName()+"," + p1.isMale());//Sharon, false 
  System.out.println(p1.getNickName()+"," + p1.getGender()); // Sharon, F

}
}
