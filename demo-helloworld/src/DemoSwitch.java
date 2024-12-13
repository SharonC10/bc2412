public class DemoSwitch {
  public static void main(String[] args) {

    int x = 1;
    if (x == 1) {
      System.out.println("x = 1");
    } else if (x == 2) {
      System.out.println("x = 2");
    } else if (x == 3) {
      System.out.println("x = 3");
    } else {
      System.out.println("somethings else...");
    } // simple

    // Switch :
    // only check (==); equals
    //
    switch (x) { // checking x equal to what? kinda like "if else "
      case 1: // case 1 -> case (int); can't be case x > 1;
        System.out.println("x = 1");
        break;
      case 2:
        System.out.println("x = 2");
        break;
      case 3:
        System.out.println("x = 3");
        break;
      default:
        System.out.println("somethings else...");
    } // x = 3, somethings else...
    // not expect somth else
    // if fund smth courrect, it will show all the rest.
    // eg: x = 3, in switch: fund x = 3, then will also show somth else
    // if dont want to just add "break"

    char gender = 'M'; // F, M(well defined value range with limted data/ number )-> never change
    switch (gender) {
      case 'M':
        System.out.println("Male");
        break;
      case 'F':
        System.out.println("Female");
        break;
        default:
        System.out.println("unknown");
    }//week 3 


  }
}
