public class DemoRecursion {
public static void main(String[] args) {
  // 1+ 2+3... +10 
  int sum = 0;
  for (int i = 0; i < 11; i++){
    sum = i+1;
  }
  System.out.println(sum);

  //Recurrsion
System.out.println(sum(10));// 55

int n = 8;
int result = n % 2 ==1 ? product(n): product(n-1) ; //result = 8%2 ==1 if true -> product(n) : 
//if not product(n-1)

 //1*3*5*7......*n
System.out.println(result); //105
} 

public static int sum(int value ){
  // base criteria (exit)
  if (value <= 0 ) //  value = 10 - 1 = 9 -> 10+ 9 ;1+ 2+3+4+5+6+7+8+9+10
  return value;
  //invoke myself
  return value + sum( value -1);
} 

public static int product (int n){
  if (n <= 1) //because i want 1 be the last number, not show 0.
  return 1;
  return n* product(n -2);
}



}
