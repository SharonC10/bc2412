import java.util.Arrays;

public class Demo2DArray {
  public static void main (String []args ){
    //20/12  溫好week 1 & 溫好week 2先
    
    int[] arr = new int[3];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    System.out.println(Arrays.toString(arr));//
    // Array ＝連續儲存空間

    // excel (row x colum)
    int[] arr2d = new int[2][3]; // 2row x 3colums
    // row: 0, 1
    // column 0,1,2
    // 1 st row, 1st column
    arr2d[0][0] = 100;
    arr2d[1][2] = 100; // 2nd row, 3rd column, 100

    for (int i= 0; i < arr2d.length; i++){ 
      for (int j = 0; j < arr2d[i].length; j++){;// how many columns 
      System.out.println(arr2d[i][j]);} // how many rows == arr2d.length
      }
    


// 1st row -> {100, 0 ,0}
//2nd row -> {0,0,100}}
int [][]arr2d2 = new int [][]{{100, 0 , 0},{0,0,100}};
System.out.println(Arrays.deepToString(arr2d2));// [[100, 0 ,0], [0,0,100]]
  //int rowLength = arr2d3[1].length; //3

int [][] arr2d3= new int [] [] {{100,7, 9},{101, -9,100}};
// Find the max value for each row, and then put it into a new int array.
int max = Integer.MIN_VALUE;
int [] rowMaxs = new int [arr2d3.length];
int idx = 0;

for (int i = 0; i < arr2d3.length; i++){
  max = Integer.MIN_VALUE;

  for (int j = 0; j < arr2d3[i].length; j++){// 講緊column = arr2d3[i].length
    max = Math.max(arr2d3[i][j]);

  }rowMaxs[idx++] = max;
} System.out.println(Arrays.toString(rowMaxs));






  }
}
