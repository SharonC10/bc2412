public class Test {
  public static void main(String[] args) {
    // 20/12
    int x = 3;
    System.out.println(x);

    int[] arr = new int[3];

    String person = "vincent";
    int personAge = 18;

    String person2 = "lucas";
    int personAge2 = 17;
    // it cant loop
    String[] name = new String[] {"vincent", "lucas"};
    int[] ages = new int[] {18, 17};
    // every time having new things to add, need to state a new Array
    // if i delete lucas -> need to also delete his age....
    // but it will very 煩。
    // 排序？ younger first, many Array need to short...


    Person p1 = new Person("vincent", 18, "vincent@gmail.com");
    System.out.println(p1.getName()); //vincent
    System.out.println(p1.getAge()); //18
    System.out.println(p1.getEmailAddress());

    Person p2 = new Person("lucas", 17, "lucas@gamil.com");
    System.out.println(p2.getName());//lucas 
    System.out.println(p2.getAge());//17


    Person [] persons = new Person [] {p1,p2 , new Person ("dicky", 19, "dicky@gmail.com")};
    for ( Person p : persons ){
        System.out.println(p.getName()+ "," + p.getAge()+ "," + p.getEmailAddress());
    } 
    //vincent , 18 , vincent@gmail.com
    //name , age , email
    
    
    //String s1 = "hello";
    //String [] strings = new String []{ s1, "world"}

}

}
