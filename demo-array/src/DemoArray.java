import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        int x1 = 3;
        int x2 = 10;
        int x3 = 11;
        // indepandent


        // 連續記錄
        // declare array
        int[] arr = new int[3]; // 定義三間屋，3個數字連續Save起
        // assign value to array
        arr[0] = 3; // first one , 將個3放入去，
        arr[1] = 10;
        arr[2] = 11;
        // for loop -> read array values
        // array 同forloop 天生一對
        for (int i = 0; i < arr.length; i++) { // i = 0,1,2
            // as "arr.length -> 0,1,2 -> 3, 10,11"
            if (arr[i] >= 10) // 1. print all value, which > 10
                System.out.println("print:" + arr[i]); // use if filter
        }

        // declare double array , length ->5
        // 10.4, 4.3, 3.3, 1.9, 9.9 -> assign
        // sumup all value in the double arrway
        double[] arr2 = new double[5];
        arr2[0] = 10.4;
        arr2[1] = 4.3;
        arr2[2] = 3.3;
        arr2[3] = 1.9;
        arr2[4] = 9.9;
        double sum = 0;

        for (int i = 0; i < arr2.length; i++) {
            sum = sum + arr2[i];

        }
        System.out.println(sum);
//---------------------------------------------------
        // String arrwy
        // "abc" , "def" , "ijk"
        // find "abc"
        String[] arr3 = new String[3];
        arr3[0] = "abc";
        arr3[1] = "def";
        arr3[2] = "ijk";
        String target = "abc";
        boolean isTargetExist = false;

        for (int i = 0; i < arr3.length; i++) {
            if (target.equals(arr3[i]))
                isTargetExist = true;
        }
        System.out.println(isTargetExist); // true
//---------------------------------------------------
        char[] arr4 = new char[] {'b', 'c', 'a'};
        // same as arr4[0] = "b";
        // arr4[1] = "a";
        // arr4[2] = "v";
        // convert the char value to int value, then assign them to a new int arrway
        // int number = arr4[1];
        // int number2 = arr4[2];
        // int number3 = arr4[3];
        int[] ascii = new int[arr4.length];// 98,99,97
        for (int i = 0; i < arr4.length; i++) {
            ascii[i] = arr4[i]; // char valie (arr4[i] -> int variable (ascii[i])
        }
        for (int i = 0; i < ascii.length; i++) {
            System.out.println(ascii[i]);
        }

        // boolean isSmoker = false;


        // find the max ascii value in the int array
        // int ascii[0] = 98
        // int ascii[1] = 99
        // int ascii[2] = 97
        int max = 0; // 如果定義係零 做唔到負數
        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i] > max) { // 搵個 O 做比較
                max = ascii[i];
            }

        }
        // Step1: i = 0, 98 > 0 -》true -> put 98 to mas
        // Step2: i = 1, 99 > 98 -> true -> put 99 to max
        // Step3: i =2, 97> 98 -> false -> exit
        System.out.println(max);// ----------------99


        // if ( 98 > 99? > 97)
        // else (98 > 97 > 99)
        // else ( 97 > 99 > 98)
        // (97 > 98 > 99)
        // (99> 97 > 98)
        // (99 > 98 > 97)



        // Find the min value in the int array
        // int [] arr5 = new int[] {9, -8, -99, -98};
        // System.out.println(min);//-99

        // int min = 0; if min = 0計唔到負數，有機會array入面有大數，應該點Set？
        // 可以將max Set做一個int 入面最大嘅數。 -> Integer.MAX_VALUE
        int min = Integer.MAX_VALUE; // int max valur
        int[] arr5 = new int[] {9, 8, 99, 98};
        // arr5 [0] = 9;
        // arr5 [1] = -8;
        // arr5 [2] = -99;
        // arr5 [3] = -98;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }
        System.out.println(min);// ---------------8

        // array sum
        int sum100 = 0;
        int[] arr6 = new int[] {9, 8, 99, 98};
        for (int i = 0; i < arr6.length; i++) {
            sum100 = sum100 + arr6[i];
        }
        System.out.println("sum:" + sum100);// ----------214

        // swap
        int left = 7;
        int right = 9;
        // left is 9 ; right -> 7
        int temp = left;// back-up left
        left = right;
        right = temp;

        System.out.println("is" + left);// -----9
        System.out.println("is" + right);// -----------7

        // array
        int[] arr8 = new int[] {9, -8, 109, 99, 98};
        // print1 (9 + -8)
        // print 101 (-8 + 109)
        // print (109 + 99)
        // print 197 (99+98)
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < arr8.length - 1; i++) {
            System.out.println(arr8[i] + arr8[i + 1]);// sum1 = arr8[0] + arr8[1];
            // sum2 = arr8[1] + arr8[2];
            // sum3 = arr8[2] + arr8[3];
            // sum4 = arr8[3] + arr8[4];
        }

        // System.out.println(sum1);// print1 (9 + -8)
        // System.out.println(sum2);// print 101 (-8 + 109)
        // System.out.println(sum3);// print 208 (109 + 99)
        // System.out.println(sum4);// print 197 (99 + 98)

//-------------------------------------------------------
        int temp2 = 0;
        // array swap
        int[] arr7 = new int[] {9, -8, 109, 99, 98};
        // move max value to the tail
        // for loop + swap
        for (int i = 0; i < arr7.length - 1; i++) {// Step1:
            if (arr7[i] > arr7[i + 1]) {
                temp2 = arr7[i]; // backup
                arr7[i] = arr7[i + 1];
                arr7[i + 1] = temp2; // swap
                // swap
            }
            System.out.println(Arrays.toString(arr7)); // [x, x, x, x, 109]
        }
        // {9, -8, 109, 99, 98};
        // {-8, 9, 109, 99, 98};
        // {-8, 9, 109, 99, 98};
        // {-8, 9, 99, 109, 98};
        // {-8, 9, 99, 98, 109};
        // System.out.println(Arrays.to.String(arr7)); //[x, x, x, x, 109]
//-------------------------------------------------------
        int product = 1;
        Integer[] arr20 = new Integer[] {9, 6, 4};
        // Product for all numbers
        for (int i = 0; i < arr20.length; i++) {
            product = product * arr20[i];
        }
        System.out.println(product);// ----------------216


        double[] prices = new double[] {8.2, 6.5, 10.5};
        int[] quantities = new int[] {9, 8, 3};
        // 8.2 * 9 + 6.5 X 8 + 10.5 * 3
        double sum20 = 0.0;
        for (int i = 0; i < prices.length; i++) {
            sum20 += quantities[i] * prices[i];
        }

        String s = String.valueOf(123);
        System.out.println(s);// "123"
        s = String.valueOf(true);
        System.out.println(s);// "true"

        System.out.println(String.valueOf('A'));// 'A'

        Integer i1 = Integer.valueOf("123");
        System.out.println(i1);// "123"

        // Integer i2 = Integer.valueOf("h"); java.lang.NumberFormatException

        // "hello" -> 'h', 'e', 'l','l',o
        char[] chArr = "hello".toCharArray(); //經常用!!!! toCharArray -> 
        
        //olleh
        char cTemp = 0;
        for (int i = 0; i < chArr.length / 2 ; i++){ // 0, 1
            // chArr[i] vs chArr[chArr.length - i]
                cTemp = chArr[i];
                chArr[i] = chArr[chArr.length - i -1];
                chArr[chArr.length -1 -i] = cTemp;
        }


        String result = "";
        for (int i = 0 ; i < chArr.length; i++){ //
            result += chArr[i];
        }System.out.println(result);//olleh
//-------------------------------------------------------
        // h -> i
        // e -> f
        // l-> m
        //o -> p
        //ifmmp (hello)
        //cha -> int -> cha??
        chArr = "hello".toCharArray(); 
        for (int i = 0; i <chArr.length ; i++){
            chArr[i] = (char)(chArr[i] + 1);// h + 1 -> i, h下一個係i 
        }//
        System.out.println(String.valueOf(chArr));// 要背
        //"ifmmp", char Array -> String.

        // which char is max? 
        //assum we have small letter,26
        char[] arr12 = new char []{'p', 'a', 'p', 'b', 'a', 'p'};
        //more than one loop
        String maxNumChar = "";
        int count = 0;
        for (int i =0; i < arr12.length; i++);
        for (int i = 0; i < 26; i++);
        if (arr12.length == 'p'){
            count++;
        }

        System.out.println(count);//p
//-------------------------------------------------------
        //數字母
        //char[] arr12 = new char []{'p', 'a', 'p', 'b', 'a', 'p'};
        int [] counters = new int [26];
        // count[15] =3  i-> 'p' -> 'p' - 'a' =15 -> 112 - 97 = 15;
        //count[0]=2 -> 'a' - 'a' =0 
        //count [1] = 1
        //count [3] = 0

        char maxNumberChar = ' ';
        for (int i = 0 ; i < arr12.length; i++){
            counters[arr12[i] - 'a']++ ; // why -a, as within 0 - 25 
            // a - a = 0; mark one! won't use -b
            //用左減號char 會自己轉‘數目‘

            System.out.println(arr12[i] - 'a');
            //System.out.println(i);
            // counters[arr12[i]-'a'] = counters[arr12[i]-'a'] +1 
        } 

        int max2 = Integer.MIN_VALUE;// 最細嘅數
        for (int i = 0 ; i < counters.length; i++ ){
            //max = Math.max(counters[i], max == 97);
            if (counters[i] > max){
                maxNumberChar = (char) (i + 97);
                max2 = counters[i];
            }
        }
        //-------------------------------------------------------
        //19/12 Bubble Sort 
        //Sorting, without create a new array
        // Move the value to tail
        //Step :[X,X,X,X,90] =, when i = 0 [20,-20,50, -40,90]
        // [X,X,X,50, 90],when i = 1
        //[X,X,20,50, 90] when i = 2
        //[X, -20,20,50,90]when i = 3
        // [-40,-20,20,50,90]
        //move 好多數 -> 用兩個for loop
        int [] arr200 = new int []{20, -20, 90, 50, -40};
        int temp20 = 0;
        for (int i=0; i< arr200.length -1; i++){//0 -3
            //

            for (int j = 0; j< arr200.length -i -1 ; j++){ //swap index //j <arr20.length - i -1
                //
                if (arr200[j] > arr200[j + 1]){

                    temp20 = arr200[j];
                    arr200[j] = arr200[j +1];
                    arr200[j +1] = temp20; 
                }
            }
        }
    System.out.println(Arrays.toString(arr200));

    }
}
