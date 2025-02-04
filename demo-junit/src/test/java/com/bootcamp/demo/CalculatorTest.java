package com.bootcamp.demo;

// static import
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// ! mvn compile: compile main code
// ! mvn testCompile: "mvn compile" + compile test code
// ! mvn test: "mvn testCompile" + run all test cases
// ! mvn package: "mvn test" + package jar
// ! mvn install: "mvn package" + install jar to m2

// ! Regression Test (for day2 enhancement )
// ! TDD (Test case first)-> rapidly define all test cases without main code.
// 先寫testcase 再入main，頭腦清醒D
// 如果main 先打，testcase有機會跟隨maincode 做答案
//
// mvn test -> locate "@Test" annotation
// Maven create test object to invoke testSum()
public class CalculatorTest {
  // Unit test = Requires a framework to compare the actual & expected result
  // Definition of PASS
  @Test
  void testSum() {
    // TC1: 1 + 2 = 3
    // TC2: -1 + 3 = 2
    // TC3: 0 + 0 = 0
    assertEquals(4, Calculator.sum(1, 2));
    assertEquals(3, Calculator.sum(-1, 3));
    assertEquals(1, Calculator.sum(0, 0));
    // ! if actual result != expected result, maven throw error
    // ! so that you cannot pass through the "test" cycle.
  }

  @Test
  void testSum2() {
    assertEquals(-4, Calculator.sum(-1, -4));
  }

  // Mockito
  @Test
  void testMethodB() {
    assertEquals(24, Calculator.methodB(7));
  }

  public static void main(String[] args) {
    CalculatorTest ct = new CalculatorTest();
    ct.testSum();
  }
}