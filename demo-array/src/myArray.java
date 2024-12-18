public class myArray {
  public static void main (String []args ){
    int x1 = 3;
    int x2 = 10;
    int x3 = 11;

    int [] arr = new int []{3,10,11};
    //int []arr = new int [3];
    //arr[0] = 3;
    //arr [1] = 10;
    //arr [2] = 11;
    int sum = 0;
    for (int i = 0 ; i < arr.length; i++){
      sum += arr[i]; 
      System.out.println(arr[i]); //read array value
    }System.out.println("sum is " +sum);
//Step1: arr have 3 boxs or u dont know. 
// -> i < length()
//Step2: i want to sum up all the numbers from the box
// set "sum" =0 -> save the sum up no.
//Step3: arr[0] = 3 < arr.length (arr.length = 3)
// sum = sum + arr[0] 
// sum = 0 + 3
//sum = 3

//Step4: arr[1] = 10 <arr.length(arr.length = 3)
// sum = 10 + sum
// sum = 10 +3
// sum = 13

//Step5: arr[2] = 11 < arr.length(arr.length = 3)
//sum = 11 + sum
//sum = 11 + 13
//sum = 24;

int[] arr2 = new int []{2,4,6,8,10};
int sum2 = 0;
for (int i = 0; i < arr2.length; i++){
  sum2 += arr2[i];
} System.out.println("sum is " + sum2);

//String 


  }
}
