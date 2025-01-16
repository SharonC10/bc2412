public class DemoUncheckedException { //you must handle, right row bomb
//2 Types Exceptions: 
//1) Checked Exception (Compile-time) 
//2) Unchecked Exception
  //Define Unchecked Exception
  public static class BussinessException extends Exception{
    //compile time no need to check 
    //唔會有紅線
    
  }

  //Define checked Exception 
//checked exception must use tryCatch

  //Define Unchecked Exception
  public static class BussinessRuntimeException







  //Who is the caller of main() method? 
  //JVM (Java Virtual Machine) call this main method 
  public static void main(String[] args) throws BussinessException {
    //throw new BussinessException(); //-> it is Unchecked Exception
    int sum = 0;
    //sum = sum(10,1);
    try{
      sum(10, null); //throw checked exception )comile time   
      System.out.println("sum =" + sum);
    }catch (BussinessException e){
      System.out.print("x and y cannot be null");
    }
     //throw check exception
  }

//-----------------------------------------------

  public static int sum2(Integer x, Integer y ) //throw unchecked exception (run time )
   sum = sum2(10, null);
   try {
    sum = sum2(10, null);
    System.out.println();
   }

  public static int sum (Integer x , Integer y) throws BussinessException { //
    if (x == null || y ==null)
    throw new BussinessException();
    return x.intValue() + y.intValue();
  }
}
