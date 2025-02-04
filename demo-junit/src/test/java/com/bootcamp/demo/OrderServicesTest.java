package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

// ! Mokito
@ExtendWith(MockitoExtension.class)
public class OrderServicesTest {
  @Mock
  private PaymentService paymentService;
  // mock object (without real implementation)
  @Mock
  private InventryService inventryService;
  // mock object (without real implementation)

  // -----------------------------------------------------------
  @Test
  void testOrder_whenStockCountLargerThenZero() {
    // For this scenario, how do we perform Unit Test?(UT)
    // Order service -> inventry Service
    // -> paymentSetrvice
    //
    Mockito.when(this.inventryService.checkAvailableStock()).thenReturn(10);
    Mockito.when(this.inventryService.deductStock()).thenReturn(true);
    Mockito.when(this.paymentService.pay()).thenReturn(true);

    OrderService os =
        new OrderService(this.paymentService, this.inventryService);
    boolean orderResult = os.order(); // need to check if 'order()' ,is this method -> true? 
    
    assertEquals(true, orderResult);

    verify(this.inventryService, times(1)).checkAvailableStock();
    verify(this.inventryService, times(1)).deductStock();
    verify(this.paymentService, times(1)).pay();
    // !嚴緊性問題
    // 有機會testcase call左兩次 當左testcase success

  }



  // -----------------------------------------------------------
  // Question! 上面用左 mokito 下面再用會唔會重疊左？

  // assertThrow
  @Test
  void testAssertThrow_whenStockCountIsZero() {
    Mockito.when(this.inventryService.checkAvailableStock()).thenReturn(0);
    // Mockito.when(this.inventryService.deductStock()).thenReturn(true);
    // Mockito.when(this.paymentService.pay()).thenReturn(true);

    OrderService os =
        new OrderService(this.paymentService, this.inventryService);
        //!No need!
        //! boolean orderResult = os.order(); 
        //because it only check the available stock will it throw the exception or not!
    assertThrows(IllegalStateException.class, () -> {
      os.order();
    });

    verify(this.inventryService, times(1)).checkAvailableStock();
    verify(this.inventryService, times(0)).deductStock();
    verify(this.paymentService, times(0)).pay();
    // proof what you didn't do.
  }
  // ans: no, because Test default 'per method'. not 'per class '
}
