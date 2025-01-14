public class App {
    public static void main(String[] args) {
        // Forsee -> Avoid
        // 1.Arithmetic Exception: /by zero除零
        int q = 0;
        if (q != 0) {
            int x = 10 / q;
        } else {
            System.out.println("Q is zero");
        }

        try {
            int a = 10 / q; // Java by default throw exception for some scenario (i.e /0)
        } catch (ArithmeticException e) {
            System.out.println("Cannot dicided by Zero");
        }
        // But why use Void not (try...& catch )?
        // as can use (if...else ) handle, will not use (try...catch)

        // 2. Nullpointer Exception (NPE)
        // try & catch
        String s = null;
        // avoid
        if (s != null)
            System.out.println(s.charAt(0));

        String result = null;
        String input = null;
        try {
            result = concat(input, "abc"); // method caller
        } catch (IllegalArgumentException e) {
            // 1. catch class
            // 2. when something wrong happen within the try block
            System.out.println("Ignore the bomb.");
        }
        System.out.println(result);

        // 3. Integer.parse
        String input2 = "-3.";
        int x2 = 0;
        try {
            x2 = Integer.parseInt(input2);
        } catch (NumberFormatException e) {
            x2 = -1;
        }
        System.out.println(x2);

        // 4. java.lang.ArrayIndexOutOfBoundsException
        String[] arr = new String[] {"abc", "def", "ijk"};
        // System.out.println(arr[3]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        // 5. java.lang.StringIndexOutOfBoundsException
        String s3 = "hello";
        // System.out.println(s3.charAt(s3.length()));

    }


    public static String concat(String x, String y) { // x can be null
        if (x == null)
            throw new IllegalArgumentException(); // complanin method input parameters
        // throw an object
        return x.concat(y);

        // But why not (if...else )?
        // because the inpull



    }
}
