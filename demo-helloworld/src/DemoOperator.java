public class DemoOperator{
  public static void main (String[]agrs) {
    // +1
    int x = 3;
    x = x +1;
    x++; // x + 1
    ++x;
    x += 1; // += means x = x + 1
    System.out.println(x); //7

    // -1
    int y = 10;
    y = y -1;
    y--;
    --y;
    y -= 1; // -= means y = y - 1
    System.out.println(y);//6

    // + 2
    int b = 20;
    b = b + 2;
    b += 2; // += means b = b + 2
    System.out.println(b);//24

    // - 2
    int c = 100;
    c = c -2;
    c -= 2; // -= means c = c - 2
    System.out.println(c);// 96

    // *= vs /=
    int m = 5;
    m = m * 2;
    m *= 2;
    System.out.println(m); //20

    int u = 4;
    u = u / 2;
    u /= 2;
    System.out.println(u); //1

    // me test
    int z = 100;
     z = z * 2; // 100 * 2 = 200
     z *= 2; // 200 * 2 = 400
     System.out.println(z); // 400



     int remainder = 10 % 3;
     System.out.println(remainder); // 1




     // ++x vs x++
     // whats different?
     int a = 8;
     int result1 = ++a + 3; //8 + 1 + 3 
     System.out.println(result1);
     System.out.println("a :" + a); //12
    //step: a become 9
    //step : a + 3 ( 9 + 3)
    //step assign 12 to result1

     int q = 8;
     int result2 = q++ + 3; // q + 3 first 8+3 = 11
     System.out.println("result2:" + result2);
     System.out.println(q);//9
     // q +3  (8+3)
     // assign 11 to result2
     // q become 9 

     //Me test
     int i = 10;
     int result3 = i++ + 3;
     System.out.println(result3);
     System.out.println(i);

     // Me test
     double p = 10.0;
     double result4 = p++ + 10.222;
     System.out.println(result4);
     System.out.println(p);
    //Step 1: p = 10.0
    // Step 2: 10.0 + 10.222
    // Step 3: 20.222 

    int h = 8;
    int result5 = h++ + 3;
    // h = h + 1;
    System.out.println(h);
    System.out.println(result5);




    //String +=
    String s = "hello"; // already remembered!!
    s += "!";
    System.out.println(s); // result ---> hello!

    //int + double -> double 
    // String + anthing -> String
    s += 'a';
    System.out.println(s); // result ---> hello!a

    s += 1;
    System.out.println(s);// result ---> hello!a1

    s += true;
    System.out.println(s);//result ----> hello!1atrue



    int x10 = 5;
    int y10 = 10;
    int z10 = x10 += 3 * y10;
    System.out.println(z10);//35
    // x10 =+ 3 * y10 
    // x10 =+ (3 * 10)

    
    
    int x11 = 3;
    int y11 = (x11 ++ + 3)* x11 ++;
    System.out.println(y11); //24
    //(3 + 3) * 3 +1 -------> ++ always be the last action
    
    //Step1: 3+3
    //Step2: x11 become 4
    //Step3: 6 *4
    //Step4: assignment 
    //Step4: x11 become 5 (x11 ++ ) x2 ---> 2 + 3


  } 
}