package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_METHOD) 
// ! One tes object to call all test case 

public class CalculatorPerMethodTest {
//Test Object
private int x; // Test enc variable 
@Test
void testSum(){
  this.x += Calculator.sum(1, 2);
assertEquals(4,this.x );
}

void testSum2(){
  this.x += Calculator.sum(1, 2);
assertEquals(3,this.x );
}

//! "Mvn test" perform something similar process as below
public static void main(String[] args) {
  CalculatorPerClassTest testObject = new CalculatorPerClassTest();
  testObject.testSum();

CalculatorPerMethodTest testObject2 = new CalculatorPerMethodTest();
  testObject2.testSum2();
}  
}
