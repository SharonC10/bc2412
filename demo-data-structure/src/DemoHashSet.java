import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
  HashSet<String> strings = new HashSet<>();
  
  strings.add("ABC");
  strings.add("IJK");
  System.out.println(strings.size());//2
  System.out.println(strings);

  //Differenct between HashSet and ArrayList
  strings.add("ABC");
  System.out.println(strings.add("ABC"));//false 
  //"ABC" 重覆左 HashSet幫你阻隔左重覆嘅可能性
  System.out.println(strings.size());//2, HashSet avoid duplicate item
  
  strings.add("XYZ");
  System.out.println(strings.size()); //3
  strings.remove("XYZ");
  System.out.println(strings.size()); //2
  strings.add("abc");
  System.out.println(strings);

  
  //HashSet cannot be ordering natually. 沒有次序可言，Map -> 雖然我唔係跟次序，但唔好理（因為底層不是Array）我就係可以拎到野
  //because its underlying data structure is not an arry.
  // so HashSet structure did not provide remove by index method.->唔係跟次序
  //HashSet底層不是 Array
  //所以唔一定係順序
  






}
}
