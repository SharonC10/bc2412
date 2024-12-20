import javax.management.StandardEmitterMBean;

public class DemoForEach {
  public static void main (String []args ){
    int [] arr = new int [] {3,4,5};
    for (int i=0; i<arr.length; i++){ // Just get one value for each iteration
      System.out.println(arr[i]); //345
    } 
    
    //Vincent :  for loop not for 返工用
    //for loop vs each-loop -> for loop 可以用一個loop read 兩個value
    // for loop tooo flexible -> easy to make things worng 
    // for loop may having too much posibility
    //e.g 3+4
    //4+5
    for (int i=0; i<arr.length -1; i++){ 
      System.out.println(arr[i] + arr[i+1]);}
    //不同寫法-> 代表不用諗法
    //different situation using the best sutable method
    int temp = -1;
    for (int i = 0; i <arr.length / 2 ; i++){
      temp =arr[i];
      arr[i] = arr[arr.length- i -1];
      arr[arr.length -i -1] = temp;
    }
    
    
    //可以用最簡單方法

    for (int integer : arr){ // : 右邊放array
      System.out.println(integer);
    }
    //each-loop -> safe -> esay 
    // each loop loop one number 
    // e.g  sending one number to boss each by each

    char[] arr2 = new char [] {'p', 't', 'e'};
    // for each loop -> "pte"
    String str = "";
    for (char c : arr2){//for (int integer : arr2){
      str += c;
    }System.out.println(str);
    //System.out.println(String.valueOf(arr2));

    String [] arr3 = new String []{ "abc", "def", "ijk"};
    String target = "ijk";
    boolean result = false;

    for (String s : arr3){
  
      if(target.equals(s)){
        result = true;
      }
    }
     System.out.println(result);

  }
}