package com.synerzip.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.synerzip.Country;

public class App {
  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    Country bean1 = ac.getBean(Country.class);
    bean1.setCountryName("India");
    String countryName1 = bean1.getCountryName();
    System.out.println("Bean-1 : "+countryName1);
    
    Country bean2 = ac.getBean(Country.class);
    String countryName2 = bean2.getCountryName();
    System.out.println("Bean-2 : "+countryName2);
  
  }
}
