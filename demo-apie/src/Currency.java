public enum Currency {
  //Scenario for enum
  // 1. Finite -> 有限數 numbers of Value
  // gender, month, week,
  //2. Values not likely to have a new value
  //Stock, coin -> updated everyday (everyday add enum....) not suites for enum
  HKD("Hong Kong Dollar",1 ), //
  USD("US Dollar",2), //
  CNY("Chinese Yuan Renminbi",3),
  ; //

  private final String desc;
  private final int value;
  //carry more than one attribute

  //private construtor in enum.
  private Currency (String desc, int value){
    this.desc= desc;
    this.value = value;
  }
  public String getDesc(){
    return this.desc;
  }
  public int getValue(){
    return this.value;
  }

  //will not write setter! enum will not change 

  public static String getDesctiption(Currency currency){
    //before Java 14
    if (currency == Currency.HKD){
      return "Hong Kong Dollar";}
      else if (currency == Currency.CNY)
      {
        return "Chinese Yuan Renminbi";}
      else if (currency == Currency.USD)
      {
        return "US Dollar";}
      return "";
    // switch(currency){
    //   case HKD:
    //   return "Hong Kong Dollar";
    //   break;
    //   case USD:
    //   return "U.S Dollar";
    //   break;
    //   case CNY:
    //   return "Chinese Yuan Renminbi";
    //   break;
    //   default :
    //   return "";
    // }
  }

  public static void main(String[] args) {
    Currency.getDesctiption(Currency.USD);
    System.out.println(Currency.getDesctiption(Currency.CNY));
    //new Currency("ABC") //You can not create enum object;

    System.out.println(Currency.CNY.getDesc());
    System.out.println(Currency.CNY.getValue());

    Currency hkd = Currency.HKD;
    System.out.println(hkd.getDesc()); //Hong Kong Dollar
    //=------------------------------------------
    System.out.println(Currency.HKD.getDesc() + Currency.HKD.getValue());
    System.err.println(Currency.USD.getValue() + Currency.USD.getValue());

    Currency usd = Currency.USD;
    Currency rmb = Currency.CNY;
    System.out.println(usd.getDesc());
    System.out.println(rmb.getValue() + rmb.getDesc());
  }
}
