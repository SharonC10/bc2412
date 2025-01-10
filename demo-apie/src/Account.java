public abstract class Account {
  private Currency currency;
  private double balance;

  public Account(Currency currency, double balance){
    this.currency = currency;
    this.balance = balance;
  }

  public Currency getCurrency(){
    return this.currency;
  }
  public double getBalance(){
    return this.balance;
  }
  
  // public static SavingAccount createSavingAccount(Currency currency, double balance){
  //   return new SavingAccount(currency, balance);
  // }

//7/1/24-------------------------------------
  //1000 -> 1,000 assign 逗號，use substring 
  public String getBalanceDwsc(){
    return this.currency.name() + this.balance; //HKD100
  }//封裝左原始數據， currency private 左 -> you don't know 
  //the type of currency is Currency.
  //someday i can change the type Currency to int 
  // it will not affect the user
  //the result no changes.
  //this is Encasulaion
  
  public static void main(String[] args) {
    Ball b1 = new Ball(Color.BLUE);
    // b1.number =3;
    // System.out.println(b1.number);
    
  }
}
