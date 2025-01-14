import java.util.Comparator;
import java.util.PriorityQueue;

public class DemoPQ {

  public static class Person{
  private String name ;
  private int age;

  public Person (String name ,int age ){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }

  public void setAge(int age ){
    this.age = age;
  }

   public boolean isElderly() {
    return this.age > 65;
  }

  @Override
    public String toString() {
      return "Person[" //
          + "Name=" + this.name
          + " "
          + "age=" + this.age //
          + "]";
    }
  
    public static class SortByElderly implements Comparator<DemoPQ.Person> {
      //Early return
      @Override
      public int compare(DemoPQ.Person p1, DemoPQ.Person p2) {
        if (p1.isElderly())
          return -1;
        if (p2.isElderly())
          return 1;
        return -1; //base return
      }
    }

  }

  public static void main(String[] args) {
    PriorityQueue <String > pq = new PriorityQueue<>();
    pq.add("Vincent");
    System.out.println(pq);//Vincent 
    pq.add("Oscar");
    System.out.println(pq); //Oscar, Vincent 
    pq.add("Lucas");
    System.out.println(pq);    //[Lucas, Vincent, Oscar]
    
    System.out.println(pq.size()); //3

    //For poll() , ordering -> String natural order
    System.out.println(pq.poll()); //Lucas 
    System.out.println(pq.poll()); // Oscar
    System.out.println(pq.poll());//Vincent 
    //poll 出尼先係順序
    //poll 時先跟 A- Z 順序, 並不是在於add 的時候
    //因為如果在add 的時候sorting, it will be fucking slow 
    
    PriorityQueue<Person> pq2 = new PriorityQueue<>(new SortByAge());
   pq2.add(new Person("Vincent", 65));
   pq2.add(new Person("Lucas", 60));
   pq2.add(new Person("Oscar", 70));
   System.out.println(pq2.poll());
   System.out.println(pq2.poll()); 
   System.out.println(pq2.poll()); 
   System.out.println(pq2.poll()); 
   System.out.println(pq2.poll());  



  }

  }

