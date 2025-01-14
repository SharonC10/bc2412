import java.util.Scanner;

public class ExceptionExercise3 extends RuntimeException {
  // Question: Create a custom exception called InvalidAgeException. Throw this exception if a user
  // enters an age less than 18.

  // 1. If NumberFormatException is caught, print "Error: Please enter a valid number."
  // 2. Pass the age number into a static method checkAge().
  // This method will throw a custom exception InvalidAgeException if the age < 18; otherwise, print "Age X is accepted".
  // 3. For the method caller, handle the potential exception by printing "Age is invalid. Please input again later."

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter age: ");
    String age = scanner.nextLine();
    // code here for the caller...

    try {
      int x = Integer.parseInt(age);
      int input = checkAge(Integer.parseInt(age));
      System.out.println("Age " + age + "is accepted");
    } catch (InvalidAgeException e) {
      // TODO: handle exception
      // if age < 18 -> Age is invalid. Please input again later.
      System.out.println("Age is invalid. Please input again later." + age);
    } catch (NumberFormatException e) { // must enter integer!!
      // TODO: handle exception
      System.out.println("Error: Please enter a valid number.");

    }
  }

  // code here for the method
  public static int checkAge(int age) throws InvalidAgeException {
    if (age < 18)
      throw new InvalidAgeException();
    return age;

  }




public static class InvalidAgeException extends RuntimeException {
  public InvalidAgeException() {

  }
}
}

