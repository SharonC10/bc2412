import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoSorting {
    public static void main(String[] args) {
        //bubble sort (Nested Loop)
        // Collection.sort
        
        List<Integer> integers = Arrays.asList(1,3, 10,-4,2);
        Collections.sort(integers);//pass by reference 
        System.out.println(integers); //[-4, 1, 2, 3, 10]
        // you should think of the bussiness logic

        int [] arr = new int []{2,10,9};
        allZero(arr);
        System.out.println(Arrays.toString(arr));//[0,0,0]

        //in Java, array & all custom types are always pass by reference 
        //Primitive , wrapper class & String are always pass by value(a copy of value)

        //Custom Type (Book)
        Book book = new Book("Sun");
        changeBookName (book); //pass by Book reference 
        System.out.println(book); //Book [name = hello]

        //Primitives or Wrapper class 
        int a = 3;
        int b = 4;
        System.out.println(sum(a,b)); //300, passing a copy of values to the method
        System.out.println(a); // 3, but not 100, because we pass by value for prmitives
        System.out.println(b);// 4, but not 200 ,because we pass by value for prmitives

        //Sort String by Colloections.sort()

        BigDecimal bd1 = BigDecimal.valueOf(10);
        BigDecimal bd2 = BigDecimal.valueOf(3);
        System.out.println(addBigDecimal(bd1, bd2).doubleValue());
        System.out.println(bd1.doubleValue());
        System.out.println(bd2.doubleValue());
        
        
    }
    public static int sum( int x, int y ){
        x = 100;
        y = 200;
        return x + y ;
    }
    
    public static String concat(String x, String y) {
        return x.concat(y);
      }
    
      // overflow -> int * int -> int
      // long * long -> long -> Long
      public static Long multiply(int x, int y) {
        return (long) x * (long) y; // avoid overflow
      }
    
      public static void allZero(int[] arr) { // pass by object reference
      // public static int[] allZero(int[] arr) { // pass by object reference
        for (int i = 0; i < arr.length; i++) {
          arr[i] = 0;
        }
      }
    
      public static void changeBookName(Book book) {
        book.setName("hello");
      }

    //   public static Book changeBookName(Book book){
    //     return new Book("hello" , book.getAuthod()); //Similar to Big Decimal
    //   }
    
      // BigDecimal? pass by value OR pass by reference
      //Similar to String(String alway create new thing)
      public static BigDecimal addBigDecimal(BigDecimal original, BigDecimal delta){
        //Can you revise the value inside a BigDecimal Object? 
        return original.add(delta); //always return a new BigDecimal Object
      }




    }
    
    
    
    
    
    
