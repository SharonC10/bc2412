public class LoginManager {
  private String username;
  private String password;

  public LoginManager(String username, String password) {
    this.username = username;
    this.password = password;
  }

  //Approach2
//  public static BussinessRuntimeException of (SysError sysError){
//   return new BussinessRuntimeException(sysError);
//  }
  public static class BussinessRuntimeException extends RuntimeException{
    //Runtime -> spelling mistake
    //"Invalid User Name."
    //"Invalid Password."
    public static BussinessRuntimeException of (SysError sysError){
      return new BussinessRuntimeException(sysError);
    }
    private BussinessRuntimeException(SysError sysErr){ //Best, already decided use SysError sysErr
      //if wanna add exception -> enum SysError
      super(sysErr.getDesc());
    }
    
    // private BussinessRuntimeException (String message){
    //   super(message);
    // }
  }

  //Approach1 
  // Custom Exception-----------------------class
  // can bring message
  public static class InvalidUsernameException extends RuntimeException {
    public InvalidUsernameException(String message) {
      super(message);
    }
  } // without empty construtor need giving message...

  public static class InvalidPasswordException extends RuntimeException{
    public InvalidPasswordException(String message){
      super(message);
  }
}
   //--------------------------------------------//right now you can know which one was wrong

//! For Approach 1
  public void validateUsername() {
    if (this.username == null || this.username.isEmpty()) {
      throw new InvalidUsernameException("Username is invalid: " + this.username);
    }
  }
//! For Approach 1
//Regular Expression
  public void validatePassword() {
    if (this.password == null || this.password.length() < 8
        || (!this.password.contains("@") && !this.password.contains("!")
            && !this.password.contains("$") && !this.password.contains("&")
            && !this.password.contains("_"))) {
      throw new InvalidPasswordException("Password is invalid : " + this.password);
    }
  }

  //-Approach 2 -------------------------------------------------
  public void validateUsername2() {
    if (this.username == null || this.username.isEmpty()) {
      throw BussinessRuntimeException.of(SysError.INVALID_USERNAME);
    }
  }
  public void validatePassword2() {
    if (this.password == null || this.password.length() < 8
        || (!this.password.contains("@") && !this.password.contains("!")
            && !this.password.contains("$") && !this.password.contains("&")
            && !this.password.contains("_"))) {
      throw BussinessRuntimeException.of(SysError.INVALID_PASSWORD);
    }
  }

  public static void main(String[] args) {
    LoginManager loginManager = new LoginManager("jackywong", "abcd123!");
    //1. we can define the program flow by custome exceptions.
    //Approach 1
    try {
      loginManager.validateUsername();
      loginManager.validatePassword();

    } catch (InvalidUsernameException e) {
      System.out.println(e.getMessage());// e can bring the bomb message , the spcific bomb (InvalidUsernameException)

    }catch (InvalidPasswordException e){
      System.out.println(e.getMessage());
    }
  
    //Approach 2
    LoginManager loginManager2 = new LoginManager("jackywong", "abcd1234");
    try {
      loginManager.validateUsername2();
      loginManager.validatePassword2();  
      System.out.println("Validate Success");

    } catch (BussinessRuntimeException e) {
      System.out.println(e.getMessage());// e can bring the bomb message , the spcific bomb (InvalidUsernameException)

    }
  }
}
