public class DemoWrapperClass {
    public static void main(String[] args) {
        int x = 3;// x is "variable"; Primitive Type variable
        Integer x2 = x; // auto-box
        System.out.println(x2);// ----------3
        System.out.println(x2.doubleValue());// 3.0
        System.out.println(x2);// 3 --> x2 no change, .doubleValue 多一個presnetation

        // Method is presentation
        String s = "hello";
        System.out.println(s.length());// -----5

        double d = 3.3;
        Double d2 = d;// auto-box
        System.out.println(d2);// ----------3.3
        System.out.println(d2.intValue());// ---------3
        System.out.println(d2.longValue());// -------3
        System.out.println(d2.floatValue());// ------3.3

        double d3 = d2; //un-box
        double d4 = d2.doubleValue();

        //char -> Character **
        char c1 ='a';
        Character c2 = c1; // auto-box
        c2.compareTo('a');
        System.out.println(c2.compareTo('a'));// 0
        // 0 -> equals

        Character c3 = 'c';
        System.out.println(c3.compareTo('a'));//2 (ascii of 'c' > ascii of 'a')
        Character c4 = 'A';
        System.out.println(c4.compareTo('a'));//-32 

        int asciiOfA = 'A';
        int asciiOfa = 'a';
        System.out.println(asciiOfa - asciiOfA);//--------32
        System.out.println('a' - 'A');//-----------32, char value - char vale -> int value -> int value
        
        char c5 = c4;
        System.out.println(c5);//-----------A

        // boolean -> Boolean **
        boolean b1 = false;
        Boolean b2 = b1;
        System.out.println(b2);//-----------false 

        boolean b3 = b2;
        System.out.println(b3);//----un-box------false 

        // byte -> Byte
        //short -> Short
        // float -> Float
        // long -> Long

        //me
        char a = 'b';
        Character a1 = a;
        System.out.println(a1); // b-----------> a1 = a = b

        boolean c = true;
        //Boolean c1 = c;
        System.out.println(c1);// -------true

        boolean isSmoker = false;
        Boolean Ada = isSmoker;
        System.out.println("Ada is smoker:" + isSmoker);

        






    }
}
