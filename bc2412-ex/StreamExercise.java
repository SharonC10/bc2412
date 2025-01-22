import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise {
  public static void main(String[] args) {
    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [100, 64, 36, 16, 4]
    List<Integer> newNumbers = numbers.stream().filter(e -> e % 2 == 0)//
        .map(e -> e * e).sorted((e1, e2) -> e1 > e2 ? -1 : 1)// .sorted(Comparator.reversrOrder())
        .collect(Collectors.toList());
    System.out.println(newNumbers);

    // -----------------------------------------------------------------------


    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names =
        Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    // // Output: [Alice, Annie, Alex]
    List<String> newNames = names.stream().filter(e -> e.startsWith("A"))//
        .collect(Collectors.toList());
    System.out.println(newNames);


    // -----------------------------------------------------------------------
    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);
    // Output: Max: 30
    // Output: Min: 5

    // List<Integer> max = numbers2.stream().sorted((e1, e2) -> e1 > e2 ? -1 : 1)//
    // .filter(e -> e >= 30)//
    // .collect(Collectors.toList());
    Optional<Integer> box = numbers2.stream().max((e1, e2) -> e1 > e2 ? -1 : 1);
    // int maxNum = Integer.MIN_VALUE;
    // if (box.isPresent()){
    // maxNum = box.get();
    // }

    // System.out.println("The Max is " + maxNum);

    // // List<Integer> min = numbers2.stream().sorted()//
    // // .filter(e -> e <= 5).collect(Collectors.toList());
    // int minNum = numbers2.stream().min(null).orElse(-1); //orElse() to open the box
    // System.out.println("The Max is " + minNum);



    // -----------------------------------------------------------------------
    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a
    // List<Integer>
    List<String> words = Arrays.asList("apple", "banana", "pear");
    // Output: [5, 6, 4] (List)
    List<Integer> newWords =
        words.stream().map(e -> e.length()).collect(Collectors.toList());
    System.out.println(newWords);


    // -----------------------------------------------------------------------
    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
    List<String> words2 =
        Arrays.asList("hi", "hello", "world", "java", "stream");
    // Output: 4
    // count()
    Long resultLength = words2.stream().filter(e -> e.length() > 3).count();// collect(), max(), min()
    // count() -> Terminal Operation (完結寫法)
    System.out.println(resultLength);


    // -----------------------------------------------------------------------
    // Here are more advanced exercises focused on using filter, map, and collect to transform data into
    // different data structures:
    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
    // Set.
    List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
    // // Output: [15, 20]

    Set<Integer> result = numbers3.stream().filter(e -> e > 10)//
        .collect(Collectors.toSet());
    System.out.println(result);


    // -----------------------------------------------------------------------
    // 7. Mapping to a Map (Key-Value Pairs)
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
    // where the key is the student's name and the value is their score.

    // Create Student Class
    // new Student("Alice", 85)
    // new Student("Bob", 75)

    // Stream <Student> students =
    // Stream.of(new Student("Alice", 85), new Student("Bob", 75));
    // Map <String , Integer> ans = //
    // students.collect(Collectors.toMap(e -> e.getName(), e -> e.getScore()));//

    // // List <Student> newStudents = students.stream().map(e -> new Student(e.getName(), e.getScore()))
    // // .collect(Collectors.toList());


    // Java 9 -> List.of() , You can read the objects, but you cannot add/ remve, modify
    // List.of -> can't change the array value
    // It is an immutable List Object
    // But why people use it?
    // easy to read , its like telling "i am not going change Student"
    List<Student> students =
        List.of(new Student("Alice", 85), new Student("Bob", 75));
    // students.set(0, new Student("Vincent", 90));//java.lang.UnsupportedOperationException.
    // students.get(0).setScore(80); //OK!

    // Output: {Alice=85, Bob=75}
    // System.out.println(ans);
    Map<String, Integer> studentMap = students.stream()
        .collect(Collectors.toMap(stu -> stu.getName(), stu -> stu.getScore()));
    System.out.println("studentMap: " + studentMap); //studentMap: {Bob=75, Alice=85}

    // -----------------------------------------------------------------------
    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
    // map them to a list of their names.

    // Create Employee Class
    // new Employee("John", 65000)
    // new Employee("Jane", 55000)
    // new Employee("Doe", 40000)

    // Output: [John, Jane]
    List<Employee> employees = Arrays.asList(new Employee("John", 65_000),
        new Employee("Jane", 55_000), new Employee("Doe", 40_000));

    List<Employee> newEmployees = employees.stream()//
        .filter(e -> e.getSalary() > 50_000)//
        .map(e -> new Employee(e.getName(), e.getSalary()))
        .collect(Collectors.toList());//

    System.out.println(newEmployees);// Employee{ Name: John}, Employee{ Name: Jane}]

    // -----------------------------------------------------------------------
    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result
    // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.

    // Create Person Class
    // new Person("Alice", 30),
    // new Person("Bob", 25),
    // new Person("Charlie", 30)

    // // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)

    List<Person> persons = Arrays.asList(new Person("Alice", 30),
        new Person("Bob", 25), new Person("Charlie", 30));//


    Map<Integer, List<Person>> personMap = persons.stream()//
        .collect(Collectors.groupingBy(e -> e.getAge()));// {25=[Bob], 30=[Alice, Charlie]} Done!
    System.out.println(personMap);
//{25=[Person(Name= Bob,Age= 25)], 30=[Person(Name= Alice,Age= 30), Person(Name= Charlie,Age= 30)]}

    // -----------------------------------------------------------------------
    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of Staff with their names and genders, partition them into two groups: male
    // and female, and collect the result into a Map<Boolean, List<Person>>.

    // Create Staff Class
    // new Staff("Alice", Gender.Female)
    // new Staff("Bob", Gender.Male)
    // new Staff("Charlie", Gender.Male)

    // // Output: {false=[Alice], true=[Bob, Charlie]} (Map)
    List <Staff> staffs = Arrays.asList(new Staff("Alice", Gender.Female), new Staff("Bob", Gender.Male),
    new Staff("Charlie", Gender.Male));

    Map <Boolean , List<Staff>> staffMap = staffs.stream()//
    .collect(Collectors.partitioningBy(e -> e.getGender() == Gender.Male));

    System.out.println("staffMap:" +staffMap); //staffMap:{false=[Alice], true=[Bob, Charlie]}


    // -----------------------------------------------------------------------
    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
    // by 2, and collect the result into a List.

    List<Integer> numbers4 = Arrays.asList(5, 15, 20, 7, 30);
    // Output: [30, 40, 60]
    List<Integer> ans11 = numbers4.stream().filter(e -> e > 10).map(e -> e * 2)
        .collect(Collectors.toList());

    System.out.println("ans11:" + ans11); //Done
    // -----------------------------------------------------------------------
    // 12. Mapping to a Custom Object and Collecting to a List
    // Task: Given a list of names and a constant default value, map each name to a Person object (name
    // and default value for age) and collect the result into a list.

     List<String> names12 = Arrays.asList("Alice", "Bob", "Charlie");
     int defaultAge = 30;
    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]
    List <Person > result12 = names12.stream()//
    .map(e -> new Person(e, defaultAge))//
    .collect(Collectors.toList());
   
    System.out.println("result12: " + result12);
    //[Person(Name= AliceAge= 30), Person(Name= BobAge= 30), Person(Name= CharlieAge= 30)]
    // -----------------------------------------------------------------------
    // 13. Mapping and Collecting to a Deque
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a
    // Deque.

   List<String> words3 = Arrays.asList("hello", "world", "java");
    // // Output: [HELLO, WORLD, JAVA] (Deque)
   List <String > result13 = words3.stream()//
   .map(e -> e.toUpperCase())//
   .collect(Collectors.toList());//
   System.out.println("result13: " + result13);//[HELLO, WORLD, JAVA]
  
   //  Deque <String > dequeArray = result13.stream()
  //  .collect(Collectors.);

   //result13 = new ArrayDeque<>();
    // -----------------------------------------------------------------------
    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.

     List<Integer> numbers14 = Arrays.asList(1, 2, 3, 4);
    // Output: [1, 4, 9, 16]
    List <Integer> result14 = numbers14.stream()//
    .map(e -> e * e)
    .collect(Collectors.toList());

    System.out.println("result14: " + result14);
    // -----------------------------------------------------------------------
    // 15. Map and Reduce
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
    // total price of all products.

    // Create Product Class
    // new Product("Book", 10)
    // new Product("Pen", 5)
    // new Product("Notebook", 7)

    // Output: 22
    List <Product> products = Arrays.asList(new Product("Book", 10), new Product("Pen", 5),
    new Product("Notebook", 7));
    double totalPrice = products.stream()
                            .map(e -> e.getPrice()) 
                            .reduce(0, (a, b) -> a + b);
  System.out.println("reduced: " + totalPrice); //22.0


  //another method
    // List <Product> result15 = products.stream()//
    // .map(e -> new Product(e.getName(), e.getPrice()))//
    // //.reduce(0, (a,b) -> a+b);
    // .collect(Collectors.toList());
    // System.out.println("result15: " + result15);//result15: [Price:10, Price:5, Price:7]


    // List<Integer> pricelist = result15.stream().map(e -> e.getPrice()).collect(Collectors.toList());
    // Integer reduced = pricelist.stream()//
    // .reduce(0, (a, b) -> a + b);
   


    // -----------------------------------------------------------------------
    // 16. Grouping
    // Task: Given a list of employees with their department names, use groupingBy method to group the
    // employees by department.

    // Create Worker Class
    // new Worker("Alice", "HR")
    // new Worker("Bob", "IT")
    // new Worker("Charlie", "HR")
    // new Worker("David", "IT")

    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}
    List <Worker> workers = Arrays.asList(new Worker("Alice", "HR"),
    new Worker("Bob", "IT") , new Worker("Charlie", "HR"), new Worker("David", "IT"));

    Map <String , List<Worker>> result16 = workers.stream()//
    .collect(Collectors.groupingBy(e -> e.getDptName()));//
    System.out.println("result16:" + result16);
    //result16:{HR=[Alice, Charlie], IT=[Bob, David]} Done


    // -----------------------------------------------------------------------
    // 17. Parallel Streams
    // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Output: 55
     Integer reduced = numbers5.stream()// how and why
     .reduce(0,(a,b) -> a+b);//
    
     System.out.println(reduced); //55

    // -----------------------------------------------------------------------
    // 18. FlatMap
    // Task: Given a list of lists of numbers, flatten them into a single list and filter only the
    // numbers greater than 5.

    List<List<Integer>> listOfIntegers = Arrays.asList( //
        Arrays.asList(1, 2, 3), //
        Arrays.asList(4, 5, 6), //
        Arrays.asList(7, 8, 9) //
    );
    // Output: [6, 7, 8, 9]

    List <Integer> newListOfIntegers = listOfIntegers.stream()//
    .flatMap(e -> e.stream())//
    .filter(e -> e > 5)//
    .collect(Collectors.toList());//
    System.out.println(newListOfIntegers); //Done!
    // -----------------------------------------------------------------------
    // 19. Distinct and Sorting
    // Task: Given a list of strings with some duplicates, remove the duplicates and return the result
    // in alphabetical order.

    List<String> fruits =
        Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
    // Output: [apple, banana, grape, orange]

    //Set <String> newFruits = fruits.stream()//
    //sort Acce code? a-z?

    // -----------------------------------------------------------------------
    // 20. Partitioning By
    // Task: Given a list of Childrens with their scores, partition the Childrens into passing and failing
    // groups (pass if score >= 50).
    // Create Student first.

    // Create Children Class
    // new Children("Alice", 45)
    // new Children("Bob", 55)
    // new Children("Charlie", 40)
    // new Children("David", 70)

    // Output: {false=[Alice, Charlie], true=[Bob, David]}
    List <Children> childrens = Arrays.asList(new Children("Alice", 45), new Children("Bob", 55)
    , new Children("Charlie", 40), new Children("David", 70));
    Map <Boolean , List<Children>> result20 = childrens.stream()//
    .collect(Collectors.partitioningBy(e -> e.getScore() >= 50));
    System.out.println("result20: " + result20); //Done
    //result20: {false=[Alice, Charlie], true=[Bob, David]}

    // -----------------------------------------------------------------------
    // 21. Joining Strings
    // Task: Given a list of words, join them into a single string separated by commas.

    List<String> languages = Arrays.asList("Java", "Python", "Rust", "R", "Go");
    // Output: "Java, Python, Rust, R, Go"
  //   List <String> newLanguages = languages.stream()//
  //   .map(e -> System.out.println(e))
  //   .collect(Collectors.toList());//
  // System.out.println("newLanguages" + newLanguages);
 
    // -----------------------------------------------------------------------
    // 22. Find First and Any
    // Task: Given a list of integers, find the first number that is divisible by 3.
    List<Integer> ages = Arrays.asList(4, 7, 9, 12, 16, 21);

    // Output: 9
    // findFirst() , findAny(), ->
    Optional <Integer> result22 = ages.stream()//
    .filter( e -> e%3 ==0)//
    .findFirst();
    //.collect(Collectors.toList());//[9, 12, 21]
    System.out.println(result22); // Optional[9]

    // -----------------------------------------------------------------------
    // 23. Limit and Skip
    // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.

    List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [4, 5, 6, 7, 8]
    // limit(x)
    List <Integer> result23 = elements.stream()//
    
    .limit(3)
    .collect(Collectors.toList());
    System.out.println(result23);

    // -----------------------------------------------------------------------
    // 24. Peek
    // Task: Given a list of integers, double each element and use the peek method to log the
    // intermediate results to the console.

    List<Integer> amounts = Arrays.asList(1, 2, 3, 4);
    // Intermediate output: 2, 4, 6, 8
    // Final Output: [2, 4, 6, 8]

    // -----------------------------------------------------------------------
    // 25. Optional and Streams
    // Task: Given a list of strings, use Streams to find the first string longer than 4 characters.
    // Handle the case where no such string exists using Optional.

    List<String> animals = Arrays.asList("cat", "tiger", "panda", "dog");
    // Output: Optional[tiger]

    List<String> animals2 = Arrays.asList("cat", "dog", "bird");
    // Output: Optional[null]
    // -----------------------------------------------------------------------
    // 26. Custom Collector
    // Task: Create a custom collector that collects the elements of a stream and remove all duplicates

    List<Integer> duplicates = Arrays.asList(2, 1, 2, 3, 4, 3, 5, 5, 6);
    // Output: [1, 2, 3, 4, 5, 6] (Set)

    // -----------------------------------------------------------------------
    // 27. String Length Calculation
    // Task: Given a list of strings, calculate the total number of characters in all the strings
    // combined.

    List<String> keywords =
        Arrays.asList("stream", "filter", "map", "sorted", "collect");
    // Output: 28
    // aggregate function: max() , count(), min(), average(), sum()

  }

  // -----------------------------------------------------------------------
  public static class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
      this.name = name;
      this.score = score;
    }

    public String getName() {
      return this.name;
    }

    public int getScore() {
      return this.score;
    }

    public void setScore(int score) {
      this.score = score;
    }

    @Override
    public String toString() {
      return "Student(" + getName() + "=" + getScore() + ")";
    }
  }
  // ----------------------------------
  public static class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
      this.name = name;
      this.salary = salary;
    }

    public String getName() {
      return this.name;
    }

    public int getSalary() {
      return this.salary;
    }

    public void setSalary(int salary) {
      this.salary = salary;
    }

    @Override
    public String toString() {
      return "Employee{ " + "Name: " + getName() +

          "}";
    }
  }
  // ----------------------------------
  public static class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return this.name;
    }

    public int getAge() {
      return this.age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    @Override
    public String toString() {
      return "Person" + "(" + "Name= " + this.name + "," + "Age= " + this.age
          + ")";
    }
  }
  // ----------------------------------
  public enum Gender {
    Male, Female;
  }

  public static class Staff {
    private String name;
    private Gender gender;

    public Staff(String name, Gender gender) {
      this.name = name;
      this.gender = gender;
    }

    public String getName() {
      return this.name;
    }

    public Gender getGender() {
      return this.gender;
    }

    @Override
    public String toString() {
      return getName();
    }
  }
  // ----------------------------------
  public static class Product {
    private int price;
    private String name;

    public Product(String name, int price) {
      this.name = name;
      this.price = price;
    }

    public String getName() {
      return this.name;
    }

    public int getPrice() {
      return this.price;
    }

    @Override
    public String toString() {
      return "Price:" + getPrice();
    }
  }
  // ----------------------------------
  public static class Worker {
    private String name;
    private String dptName;

    public Worker(String name, String dptName) {
      this.name = name;
      this.dptName = dptName;
    }

    public String getName() {
      return this.name;
    }

    public String getDptName() {
      return this.dptName;
    }

    @Override
    public String toString() {
      return getName();
    }
  }
// ----------------------------------
  public static class Children{
    private String name;
    private int score;

    public Children (String name, int score){
      this.name = name;
      this.score = score;
    }
    public String getName(){
      return this.name;
    }
    public int getScore(){
      return this.score;
    }

    public void setScore(int score){
      this.score = score;
    }

    @Override
    public String toString(){
      return this.name ;
    }

  }
}
