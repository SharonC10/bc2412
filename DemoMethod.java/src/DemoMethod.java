public class DemoMethod {
     //!sum (int x, int y) -> input parameters
     //!int -> return type
     public static int sum(int x, int y){
        int result = x + y;
        return result; // the return value should align the return type
     }

     public static double sum2 (double x2, double y2){
        double result = x2 * y2;
        return result;
     }

     public static double subtract(double vincent , double lucas ){
        return vincent - lucas;
     }
     
     public static int sum3(int one ,int tow){ //收依兩個index  
        int result = one / tow;
        return result;
     }
     //source - "hello"
     // target 'l'
     //reture ->2
     public static int countCharacter(String source, char target){
        // toCharArray -> 
        //依個係seareching
        //return type -> int
        // 收左D野返尼，String嘅source, char嘅target
        int chr = 0;
        for (int i=0; i < source.length() ; i++){
            if (source.charAt(i) == target)
            chr++;// 記低數左幾多次
        }
        return chr;//
     }


    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int x =3;
        int a = 10 ;
        int b = 11;
        int y = a + b;

        System.out.println(y);//21

        a =19; 
        b = 21;
        y= a + b;
        System.out.println(y); //40
        
        //call sum () method 
        y= sum (10,11);
        System.out.println(y);//21
        y= sum (19, 21);
        System.out.println(y);//40

        double y2 = a + b;
        y2 = sum2(3.0 ,2.0);
        System.out.println(y2); //6.0
        
        //直接call
        System.out.println(subtract(100, 98));//100.0 -98.0 = 2.0
        System.out.println(countCharacter("hello",'l')); //2
        System.out.println(countCharacter("abc",'a')); //1
        



    }
}
