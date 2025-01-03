public class DemoInteger {
  public static void main(String[] args) {
    Integer x = 3;
    Integer x2 =3;
    System.out.println(System.identityHashCode(x));//1841205829
    System.out.println(System.identityHashCode(x2));//1841205829

    Integer x3 = new Integer(3);
    Integer x4 =  Integer.valueOf(3);


    //Cache Range: -128 to 127
    Integer x5 = 128;
    System.out.println(System.identityHashCode(x5));//1933863327
    Integer x6 = 128;
    System.out.println(System.identityHashCode(x6));//112810359

    Integer x7 = new Integer(128);
    Integer x8 =  Integer.valueOf(128);
    System.out.println(System.identityHashCode(x7));//2124308362
    System.out.println(System.identityHashCode(x8));//146589023

    //Same situations for Byte, Short, Long, Character, Boolean
    Character1 c1 = 'a';//
    Character1 c2 = 'a';
    System.out.println(System.identityHashCode(c1));//344639057
    
    System.out.println(System.identityHashCode(c2));//44639057
    
    Character1 c3 = '你';//
    Character1 c4 = '你';
    System.out.println(System.identityHashCode(c3));//1482968390
    System.out.println(System.identityHashCode(c4));//349885916

    Boolean b = true;
    Boolean b2 = true;
    System.out.println(System.identityHashCode(b));//414493378
    System.out.println(System.identityHashCode(b2));//414493378


    //Not support Inernal Cache: Float & Double 
    Double d1 = 10.3;
    Double d2 = 10.3;
    System.out.println(System.identityHashCode(d1));//1984697014
    System.out.println(System.identityHashCode(d2));//    205029188

    //
    Float f1 = 10.3f;
    Float f2 = 10.3f;
    System.out.println(System.identityHashCode(f1));//1309552426
    System.out.println(System.identityHashCode(f2));//    1943105171


    //Most Important!! 
    //> , < , >= , <=, != , == for Primitive ONLY
    if (d1 > 10.0){ // NOT OK! 

    }
    Double d3 = 10.3;
    Double d4 = 10.1;
    if (d3.compareTo(d4) > 0 ){
      System.out.println("d3 > d4");
    } //Object use method 做comparare

    Double d5 = 10.1;
    Double d6 = 10.6;
    if (d5.compareTo(d6) < 0 ){
      System.out.println("d5 < d6");
    }

    Double d7 = 10.1;
    Double d8 = 10.1;
    if (d7.compareTo(d8) == 0 ){ // if (d7.equals(d8)){
      System.out.println("d7 = d8");
    }

    //OK in hard code
    if (d3 > 3.0){ // 3.0 -> double (NOT Double)
//because 3.0 -> primitive double -> d3 auto convert to duoble 
System.out.println("d3> 3.0 ");    
}

    //Java Developer need to know 
    // Usally not using 
    //寫OOP 應該trust method 而不是符號
    //




  }
}
