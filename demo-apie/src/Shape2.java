public interface Shape2 {
  //Problems: 咩情況冇attribute -> 行為就沒有
  // OOP（Shape）是Object 不是行為，之後design program 會寫死自己
  //No attribute 
  //Before Java 8 , no static & no default method
  double area();
  
  default double calculate(){
    return area()+3;
  }

}
