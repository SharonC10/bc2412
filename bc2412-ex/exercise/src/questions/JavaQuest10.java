import java.util.Arrays;
import java.util.Scanner;

/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
// Insert an elements into a specific position of the array
// The original last element should be removed accordingly
// if the specified position is the last index, return the original array
public class JavaQuest10 {

  public static void main(String[] args) {

    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    System.out.print("Input an index for inserting the value: ");
    int indexPosition = input.nextInt();

    System.out.print("Input the value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    // code here ...
    //int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    int temp = 0;
    int [] newArr = new int [my_array.length];
    for (int i=0; i< my_array.length; i++){
      if ( my_array[indexPosition] == my_array[i]){
        temp = my_array[i];
        my_array[i] = newValue;
        my_array[i+1] = temp;
        //my_array[i+2] =  my_array[i+1];
        //my_array[i+1] = temp;
        
      }newArr[i] = my_array[i];
      }
    

    my_array = newArr;
    System.out.println("New Array: " + Arrays.toString(newArr));
  }
}