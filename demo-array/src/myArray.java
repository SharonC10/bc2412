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


  }
}
