import java.util.Arrays;

public class BubbleSort {
  public static void main (String [] args){
    //BubbleSort
    int [] arr = new int[]{20, -20, 90,50,-40};
    int temp = 0;

    for (int i = 0; i < arr.length -1; i++){
      for (int j = 0; j<arr.length - i -1; j++){
        if (arr[j] > arr[j+1]){
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;

        }
      }System.out.println(Arrays.toString(arr));

    }
  }
}
