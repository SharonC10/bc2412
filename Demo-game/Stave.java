public enum Stave {
  ARCHANGEL("Archangel",10),
  LIANDRY("Liandry",10),
  ;

   private final String dese;
   private final int paValue;

   private Stave (String desc, int paValue){
    this.dese = desc;
    this.paValue = paValue;
   }

   public String getDesc(){
    return this.dese;
   }
   public int getPaValue(){
    return this.paValue;
   }

   
}
