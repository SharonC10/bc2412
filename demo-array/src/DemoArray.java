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
        for (int i = 0; i < arr.length; i++) { // i = 0,1,2
            // as "arr.length -> 0,1,2 -> 3, 10,11"
            if (arr[i] >= 10) // 1. print all value, which > 10
                System.out.println(arr[i]); // use if filter
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

        // String arrway
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
        } System.out.println(isTargetExist); //true

        char[] arr4 = new char[]{'b','c','a'};
        //same as arr4[0] = "b";
        //arr4[1] = "a";
        //arr4[2] = "v";
        //convert the char value to int value, then assign them to a new int arrway
        //int number = arr4[1];
        //int number2 = arr4[2];
        //int number3 = arr4[3];
        int [] ascii = new int [arr4.length];//98,99,97
            for ( int i = 0; i < arr4.length; i++){
            ascii[i] = arr4[i]; // char valie (arr4[i] -> int variable (ascii[i])
        } for (int i = 0; i < ascii.length; i++){
            System.out.println(ascii[i]);
        }

        //boolean isSmoker = false;


        //find the max ascii value in the int array
        //int ascii[0] = 98
        //int ascii[1] = 99
        //int ascii[2] = 97
        int max = 0;
        for (int i = 0; i < ascii.length; i++){
            if ( ascii[i] > max){
                max = ascii[i];
            }
            
            }
            
            System.out.println(max);
    

            //if ( 98 > 99? > 97)
            //else (98 > 97 > 99)
            //else ( 97 > 99 > 98)
            //(97 > 98 > 99)
            //(99> 97 > 98)
            //(99 > 98 > 97)












        // Find the min value in the int array
        //int [] arr5 = new int[] {9, -8, -99, -98};

        //System.out.println(min);//-99


    }
}
