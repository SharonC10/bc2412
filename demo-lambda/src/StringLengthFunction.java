import java.util.function.Function;
//Function (Java Built-int interface)
public class StringLengthFunction implements Function<String , Integer>{
  @Override
  public Integer apply (String s ){
    return s.length();
  }

public static void main(String[] args) {
  //Traditional Class & Interface
  StringLengthFunction slf = new StringLengthFunction();
  System.out.println(slf.apply("hello"));
  // need to open Class to do it 

  //Lambda Expression(define formula at the runtime)
  Function <String , Integer> stringLength = s -> s.length();
  stringLength.apply("hello");
  System.out.println(stringLength.apply("hello")); //5 (output: 5 -> s'length)

}
}
