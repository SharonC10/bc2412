import java.lang.reflect.Array;
import java.nio.file.OpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.management.RuntimeErrorException;
import javax.swing.text.html.StyleSheet;

public class DemoStream {
    public static void main(String[] args) {
        // Traditional
        int[] arr = new int[] {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int integer : arr) {
            System.out.println(integer);
        }

        // apply in int[] , Integer[], ArrayList<Integer>

        // Java 8 (2014): Stream (not method , is Class! ) Stream style: List -> Stream -> List
        // Before Java 8 : for Loop (list) + if

        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Integer> newIntegers = integers.stream()// Stream <Integer>
                .filter(e -> e % 2 == 0) // "e -> e % 2 ==0 " -> predicate (formula)
                // now it change to Stream , not List.
                .collect(Collectors.toList()); // always return new ArrayList

        System.out.println(integers);// [1, 2, 3, 4]
        System.out.println(newIntegers); // [2, 4]


        // ---------------------------------filer() ----------------------------------------------------------
        // declare String array with some elements
        // filter string length > 5 and comtain 'a'
        List<String> strings = Arrays.asList("abc", "defdef", "ijk");
        // ForLoop + if

        List<String> newStrings = strings.stream() //
                .filter(e -> e.length() > 5 && e.indexOf('a') != -1) //// contains or indexOf
                // Why this "e" can be String type? because -> String type, the "e" is List<String>
                .collect(Collectors.toList());

        System.out.println(strings);// [abc, defdef, ijk]
        System.out.println(newStrings);// [defdef]


        // ---------------------------------asList()--------------------------
        // Define book list
        // filter book name contain "Herry" case incensitive
        List<Book> books = Arrays.asList(new Book("ABC Herry"),
                new Book("IJK HERRY"), new Book("IJK"));
        List<Book> newBooks = books.stream()//
                // .filter(e -> "Herry".equalsIgnoreCase(e.getName())) //
                .filter(e -> e.getName().toUpperCase().contains("HERRY")) //
                .collect(Collectors.toList()); // return new ArrayList<>()
        System.out.println(newBooks);

        // ---------------------------------map() -----------------------------
        // map(): change the Object type, but the quantity of element won't change
        List<String> bookNames = books.stream()//
                .map(e -> e.getName())//
                .collect(Collectors.toList());
        System.out.println(bookNames);

        // ---------------------------------map() + filter() -----------------------------
        // filter + map
        // forLoop , if + re-structure
        List<String> newBookNames = books.stream()//
                .filter(e -> e.getName().toUpperCase().contains("HERRY"))//
                .map(e -> e.getName())//
                .collect(Collectors.toList());//

        System.out.println("newBookNames: " + newBookNames);

        /// ---------------------------------map() + filter()+ forEach -----------------------------
        // for Loop + if + procedures
        books.stream().filter(e -> e.getName().startsWith("A")).forEach(e -> { // for Each put in the last.
            System.out.println(e.getName());
        });

        // Convert ---------------------------------
        // convert 3 book names to 3 books
        List<String> bookNames2 = List.of("abc", "herry", "def");
        // List<Book>
        List<Book> newBooks2 = bookNames2.stream()// 將String -> <Book>
                .map(e -> new Book(e))//
                .collect(Collectors.toList());
        System.out.println(newBooks2);

        // Stream sorted() + Comparator
        // Collections.sort() + Comparator
        // Arrays.sort() + Comparator

        // ---------Sorting ----------------------------------------------
        // Stream sorted() + Compartor
        // Colloctions.sot() + Compartor
        // Arrays.sort() + Compartor
        // Integer[] vs int[] -> cannot convert ; int vs Integer can convert the same.
        Integer[] arr2 = new Integer[] {2, 4, -1, 1, -3};
        Arrays.sort(arr2, (i1, i2) -> i1 > i2 ? -1 : 1); // Lambda expression of Comparator.
        System.out.println(Arrays.toString(arr2));

        // ---------Integer array -> Stream <Integer>----------------------------------------------
        List<Integer> sortedIntegers = Arrays.stream(arr2) //
                .sorted((i1, i2) -> i1 > i2 ? -1 : 1) //
                .collect(Collectors.toList());
        System.out.println((sortedIntegers));


        // Example Fruits--------------------------------
        List<String> fruits =
                Arrays.asList("orange", "apple", "orange", "lemon");
        Set<String> newFruits = // convert to Set, duplicates
                fruits.stream()//
                        .collect(Collectors.toSet());//
        System.out.println(newFruits);// [orange, apple, lemon]


        // distinct() -> remove duplicates
        // What if List<Book> by distinct()
        List<String> newFruit2 = fruits.stream()//
                .distinct()//
                .collect(Collectors.toList()); //
        System.out.println(newFruit2);// [orange, apple, lemon]

        // Stream.class---------------------------------------------
        Stream.of("abc", "def");
        Stream<Book> books2 = Stream.of(new Book("abc"), new Book("def"));

        List<Book> books3 = books2.filter(e -> e.getName().contains("a"))
                .collect(Collectors.toList());

        LocalDate date1 = LocalDate.of(2014, 10, 31);
        String str = String.valueOf(123);

        Stream<String> ss = Stream.empty();
        System.out.println(ss.count());// 0

        Optional<Book> targetBookBox =
                Stream.of(new Book("abc"), new Book("def"))
                        .filter(e -> "abc".equals(e.getName())) //
                        .findFirst(); // Find the first one

        // Optional (Java 8 )
        // 1. targetBook never be null , Optional never be null
        // 2. targetBook is an Optional Object, so it can Optional method only
        // 3. You have to check the content of Optional Object before ising it
        // 4. isPresent() & ifPresent() are the ways to resolve Optional in safe mode
        // 5.Never to resolve the Optional object by get() only. (unsafe)
        int x = 10;
        if (targetBookBox.isPresent()) { // somthing like peek, isPresent() 入面係咪真係有野
            Book targetBook = targetBookBox.get();
            System.out.println(targetBook.getName());
            System.out.println(x);// 10

        }

        // similar to for-each
        targetBookBox.ifPresent(e -> { // 如果有野就SystemOut
            System.out.println(e.getName()); // abc
            System.out.println(x); // 10
            // x = 100;
        });


        // stream for-each
        String name10 = "oscar";
        Stream.of(100, 120, 300).forEach(e -> {
            System.out.println(e);
            System.out.println(name10); // read the name -> OK
            // but cannot write the name variable
            // name = "abc";
        });


        String name2 = "ok";
        for (Integer integer : Stream.of(100, 120, 300)
                .collect(Collectors.toList())) {
            System.out.println(integer);
            name2 = "ijk";
        }

        // Another way to reslove the Optional
        // targetBookBox.get();
        // 1.
        Book targetBook2 = targetBookBox.orElse(new Book("default"));

        // 2./// if 入面冇野 Throw 一樣野出去
        Book targetBook3 = targetBookBox
                .orElseThrow(() -> new RuntimeException("Book is not found."));
        // 3.
        Book targetBook4 = targetBookBox.orElseGet(() -> new Book("default"));// similar to orElse

        // Of(), ofNullabl()------------------------------------------------------
        String name3 = "ABC";
        Optional<String> os1 = Optional.of(name3);

        String name4 = null;
        System.out.println("name4:");
        Optional<String> os2 = Optional.ofNullable("name4:" + name4);

        Optional<String> os3 = Optional.empty();
        if (os3.isPresent()) {
            System.out.println(os3.get());
        } else {
            System.out.println("The String is Null.");

        }
        // Stream intermediate operation won't execute itself, until terminal operation
        // Once the termuial operattion ecevuted , the stream object can no longer be used agained.
        Stream<Integer> integerLargerThan10 =
                Stream.of(10, 100, -1).filter(e -> e > 10);

        System.out.println(integerLargerThan10.count());// 1

        // integersLargerThen10.colloect(Collectors.toList());
        // Runtime Exception: stream has already been operated upon or clsoed
        // Terminla Operation



        Stream<Integer> plusOne = Stream.of(1, 2, 3).map(i -> {
            System.out.println(i);
            return i + 1;
        });

        // List<Integer> plusOneList = plusOne.collect(Collectors.toList());

        long count = plusOne.count();
        // Because Java thinks map() doesn't change the result of count().
        // So it won't execute map(), when the terminal operattion is count().
        System.out.println(count);// 3


    }



    // List<String> bookNames2 = List.of("abc", "herry" , "def");
    // List <Book> newBookNames =
    // bookNames2.stream().map( e -> new Book (e.getName))
    // .collect(Collectors.toList());
    // System.out.println(newBookNames);

    // Convert from List of Object A (more fields ) to List of Object B (less fields)
    // public static List <Book> getBookListForSearch(List <Book2> books) {
    // return books.stream()
    // .map(e -> new Book(e.getName()))
    // .collect(Collectors.toList());
    // }



    public static class Book2 {
        private String name;
        private double price;

        public Book2(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return this.name;
        }

        public double getPrice() {
            return this.price;
        }

        @Override
        public String toString() {
            return "Book{" + "Name: " + getName() + "Price: " + getPrice()
                    + "}";

        }
    }


    public static class Book {
        private String name;

        public Book(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return "Book[]" + "Name= " + this.name + "]";
        }
    }
}
