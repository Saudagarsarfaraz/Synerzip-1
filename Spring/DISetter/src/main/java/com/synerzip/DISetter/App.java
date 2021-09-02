package com.synerzip.DISetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.synerzip.Country;

public class App {
  public static void main(String[] args) {
	  ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
      Country bean = ac.getBean(Country.class);
      String countryName = bean.getCountryName();
      String capitalName = bean.getCapital().getCapitalName();
      System.out.println(capitalName+" is the capital of "+countryName );   
  }
}
