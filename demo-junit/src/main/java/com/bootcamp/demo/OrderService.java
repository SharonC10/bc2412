package com.bootcamp.demo;

// Person has name and age 
public class OrderService {
  private PaymentService paymentService; //don't have attribute -> good! No values, No different
  private InventryService inventryService;

//Dependency Injection (Pring) - DI
// 將依賴往向拋 
// use 'this.' not 'new' 
  public OrderService(PaymentService paymentService
  ,InventryService inventryService) {
    this.paymentService = paymentService;
    this.inventryService = inventryService;
  }



// Unit Test? 
//! 1. stock <= 0 -> throw
//2. pay() -> true , deductStock() -> true
//3. 

  public boolean order(){
    if (this.inventryService.checkAvailableStock() <= 0)
    throw new IllegalStateException();
    return this.paymentService.pay() 
    && this.inventryService.deductStock();

  }

  public static void main(String[] args) {
    PaymentService ps = new PaymentService();
    InventryService is = new InventryService();
    OrderService os1 =new OrderService(ps ,is);
  //all the 'ps' is the same 
  }
}
