package com.bootcamp.demo;

//Singleton Pattern (Coding Pattern )
//全局唯一 
public class InventryService {
  //private static InventryService uniqueInstance = new InventryService(); 
  private int stockCount;

  //private InventryService(){

  //}  //empty construtor 

  //public static 


  public int checkAvailableStock(){
    return -1;
  }
 
  public boolean deductStock(){
    this.stockCount--;
    return true;
    
  }
}
