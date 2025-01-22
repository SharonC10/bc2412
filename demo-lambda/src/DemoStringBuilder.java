public class DemoStringBuilder {
  public static void main(String[] args) {
    String s = "hello";
    s += "!!!";
    s += "???";

    System.out.println(System.currentTimeMillis()); // 1737012382460
    s = "";
    long before = System.currentTimeMillis();
    for (int i = 0; i < 100_000; i++) {
      s += "!";
    }
    long after = System.currentTimeMillis();
    System.out.println(after - before); // 1737012382460

    StringBuilder sb = new StringBuilder("");
    before = System.currentTimeMillis();
    for (int i = 0; i < 100_000; i++) {
      sb.append("!"); //similar to setter (but not return void) -> 自身個波 由！ -> ！！-> ！！！
      //but BigDceimal -> 10係一個波 ＋ 2一個波 create 12
      //person = person.setName()
    }
    after = System.currentTimeMillis();
    System.out.println(after - before);
    
    sb = new StringBuilder("ABCD");
    sb.reverse();
    System.out.println(sb); //DCBA

    System.out.println(sb.charAt(2));
    sb.replace(0, 2, "yy");
    System.out.println(sb); //yyBA , 冇左D 
    
    sb.deleteCharAt(2); //for loop 
    System.out.println(sb);//yyA

    sb.setCharAt(2, 'o');
    System.out.println(sb);//yyo
    //LinkList -> String Builder

    sb.indexOf("1");
    System.out.println(sb); //yyo
    sb.insert(1, "!!!");
    System.out.println(sb); //y!!!yo
    System.out.println(sb.length()); //6




  }

}
