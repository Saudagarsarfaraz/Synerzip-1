package com.synerzip.BeanLifeCycle;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.synerzip.Bean;

public class App {
  public static void main(String[] args) {
      ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
      Bean b1 = ac.getBean(Bean.class);
	  b1.show();
	  ac.close();
  }
}
