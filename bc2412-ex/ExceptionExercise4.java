import java.util.Scanner;

public class ExceptionExercise4 extends RuntimeException{

  // Follow the instructions below to complete the User Registration Process.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    System.out.print("Enter email: ");
    String email = scanner.nextLine();

    // code here ...
    try {
      // validateEmail(email);
      // validatePassword(password);
      // validateUsername(username);
      registerUser(username, password, email);
      System.out.println("User Registeration is Success.");
    } catch (UserRegistrationException e) {
      System.out.println("User Registeration is Fail.");
    }
    // call method registerUser(), handle the exception to print "User Registeration is Fail."
    // or "User Registeration is Success."

    scanner.close();

  }

  // Call validateUsername(), validatePassword() and validateEmail()
  // if anyone of the above throw exception, this method registerUser() should throw custom
  // exception UserRegistrationException.
  // otherwise, print "User registered successfully: jackywong", where jackywong is the username.
  public static void registerUser(String username, String password,
      String email) throws UserRegistrationException {
    try {
        validateUsername(username);
        validateEmail(email); //if email checking fail, throw and exit this method
        validatePassword(password);
        System.out.println("User registered successfully:" + username); //if all pass sysOut "User registered successfully"
    } catch (IllegalArgumentException e) {//these maybe hv problems, so catch IllegalArgumentE 
      //re-throw 綜合事件再說明 
      throw new UserRegistrationException();

    }

  }

  // Throw IllegalArgumentException if String username is null or empty string
  private static void validateUsername(String username) {
    if (username == null || username.isEmpty())
      throw new IllegalArgumentException();
  }

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain
  // any special characters of !@$&_
  private static void validatePassword(String password) {
    if (password == null || password.length() < 8 || (!password.contains("!") //次序都好重要
        && !password.contains("@") && !password.contains("$")
        && !password.contains("&") && !password.contains("_"))) //-> !@$&_  don't contain all of these
      throw new IllegalArgumentException();
  }

  // Throw IllegalArgumentException if String email is null or it does not contain character @
  private static void validateEmail(String email) {
    if (email == null || !email.contains("@"))
      throw new IllegalArgumentException();
  }

  public static class UserRegistrationException extends RuntimeException {
    public UserRegistrationException() {
    }
  }
  
}

