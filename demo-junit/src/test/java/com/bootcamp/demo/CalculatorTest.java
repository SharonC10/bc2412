package com.bootcamp.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

// ! mvn compile : compile main code
// ! mvn testCompile: "mvn compile" + compile test code
// !mvn test: "mvn testCompile" + run all test cases
// !mvn package : "mvn test" + package jar
// ! mvn install : "mvn package " + install jar to m2

// mvn test -> locat "@Test" annotation
// mvn create test object to invoke testSum()
public class CalculatorTest {
  // Unit test - Requires a framework to compare the actual &
  // expected result

  // Definition of PASS
  @Test
  void testSum() {
    
    // testcase TC
    // TC1: 1+ 2 =3
    // TC2: -1 + 3 = 2
    // TC3: 0+ 0 = 0
    Assertions.assertEquals(3, Calculator.sum(1, 2));
    Assertions.assertEquals(2, Calculator.sum(-1, 3));
    Assertions.assertEquals(0, Calculator.sum(0, 0));
    // ! if actual result ! = expected result , maven throw error
    // ! so that you cannot pass through hte "test" cycle

  }


  @Test
  void testSum2() {
    Assertions.assertEquals(-5, Calculator.sum(-1, -4));
  }

  public static void main(String[] args) {
    CalculatorTest ct = new CalculatorTest();
    ct.testSum();

  }
}
