import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
  HashSet<String> strings = new HashSet<>();
  
  strings.add("ABC");
  strings.add("IJK");
  System.out.println(strings.size());//2

  //Differenct between HashSet and ArrayList
  strings.add("ABC");
  System.out.println(strings.add("ABC"));//false 
  //"ABC" 重覆左 HashSet幫你阻隔左重覆嘅可能性
  System.out.println(strings.size());//2, HashSet avoid duplicate item
  
  strings.add("XYZ");
  System.out.println(strings.size()); //3
  strings.remove("XYZ");
  System.out.println(strings.size()); //2
  
  //HashSet cannot be ordering natually.
  //because its underlying data structure is not an arry.
  // so HashSet structure did not provide remove by index method.
  //HashSet底層不是HashSet
  //所以唔一定係順序
  






}
}
