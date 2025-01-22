import java.util.Optional;

public class DemoOptional {
  //3. Never use Optional Type as attribut type
  //firstName still can be null. but what is this meaning ? 
  private Optional<String > firstName;
  
  public static void main(String[] args) {
    //Caller
    //更有優勢to dual with null
    //Avantage: Able to avoid null pointer exception
    Optional <String> result = concat("abc", "def");
  // isPresent
  if (result.isPresent()){ //if (!result.isPresent )
    System.out.print(result.get());
  }

  String result2 = concat(Optional.of("abc"), Optional.of("dfe"));
  // it just String concat...
  }
  //1. Optional can only be useed as a return type of method 
  //Optional 唯一用處 return type
 //If you decided to have a return type if Optional,
 // it implies the result may be null.

 // if a || b  is null , the result is null.
 // 
  public static Optional <String> concat (String a, String b){
    if (a == null || b == null)
      return Optional.empty();
      return Optional.of(a.concat(b)); //確保左唔可能係null
  } //1000lines

  //2. never use Optional as input parameter
  //x and y still can be null (not safe)
  public static String concat (Optional <String > x, Optional<String> y){
    //用家會好煩，拎String data，need to change to Optional 
    if (x == null || y == null) 
    return null;
    if (!x.isPresent() || !y.isPresent())
    return null;
    return x.get().concat(y.get());
  }
}
