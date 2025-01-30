package com.bootcamp.lombok;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// JDK (Java Development Kit) = Dev Library/ Tools + JRE (Java Runtime Enviornment)
// + JVM ()
//Dev Library -> java c ,class Library (BigDecimal: java.math)
//StringBuilder (java.lang)

//1. Some of the Library auto-imported by Java project: (i.e. :java-lang)
//2. But some of them have to be manually imported.(i.e: BigDecimal)
//3. Maven: download external (outside JDK) library from maven public
//(i.e. lombok) 

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class Person {
private String name;
private int age;



public static void main(String[] args) {
  Person p1 = new Person();
  p1.setAge(20);
  p1.setName("Peter");
  Person p2 = new Person("Tommy", 10);
  System.out.println(p2.getAge());
  System.out.println(p2.getName());

  System.out.println(p1);

  Person p3 = new Person("Tommy", 10);

  System.out.println(p2.equals(p3));

  System.out.println(p2.hashCode() == p3.hashCode());

  Person p4 = Person.builder().name("Tommy").age(10).build();

  System.out.println(p4);

}
}
