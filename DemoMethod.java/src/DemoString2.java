public class DemoString2 {
  public static void main(String[] agrs) {
    String s1 = "hello";
    //1
    System.out.println(s1.length());
    //2
    System.out.println(s1.charAt(1));
    //3
    System.out.println("hello".equals(s1));
    //4
    System.out.println(s1.substring(0, 2));// will -1, he

    //5
    System.out.println(s1.contains("ll"));// true
    System.out.println(s1.contains("lll"));
    //6
    System.out.println(s1.concat("!!!"));// hello!!!
    //7
    System.out.println(s1.startsWith("h"));// true
    System.out.println(s1.startsWith("ha"));// false
    //8
    System.out.println(s1.endsWith("lo"));// true
    System.out.println(s1.endsWith("oo"));// false
    //9
    System.out.println(s1.toUpperCase());// hello -> HELLO
    //10
    System.out.println("HeLLo".toLowerCase());// HeLLo -> hello


    // *** 11
    System.out.println(s1.replace("ll", "xxx"));// hexxxo replace smth by smth
    System.out.println(s1.replace('l', 'm'));// hemmo
    //12
    System.out.println(s1.equalsIgnoreCase("HeLLo"));// true

    // *** String to index
    //13
    System.out.println(s1.indexOf('e')); // 1
    System.out.println(s1.indexOf('h')); // 0
    System.out.println(s1.indexOf('x'));// -1 -> not found
    System.out.println(s1.indexOf("ll"));// 2, -> String count: 2
    System.out.println(s1.indexOf("hello"));// 0 ????
    //14
    System.out.println(s1.lastIndexOf('l'));// 3 --> 0,1,2,3
    System.out.println("hellollo".lastIndexOf("ll"));// 5
    //15
    System.out.println(s1.isEmpty());// false
    System.out.println(" ".isEmpty());// false //***
    //16
    System.out.println(s1.isBlank());//false
    System.out.println("".isBlank()); //true
    System.out.println(" ".isBlank());//true //***
    //17
    System.out.println(" hel lo".trim());// 中間不remove, remove first & last space 
    //18
    System.out.println("abc".compareTo("bbb"));// -1
    System.out.println("abc".compareTo("dbb"));//-3
    System.out.println("aac".compareTo("azb"));//-25 (a vs z)
    
//-------------------------------------
//Chain Method
System.out.println("hello".concat("ijk").concat("def").toUpperCase());//concat adding
String website = "HELLOworld.COM";
System.out.println(website.toLowerCase());

//-------------------------------------***
//charAt() -> Find char by index
//indexOf() -> Find index by char




  }
}
