package com.synerzip.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.synerzip.config.AppConfig;
import com.synerzip.emp.Employee;

public class App {
  public static void main(String[] args) {
    
	    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
	    Employee bean = applicationContext.getBean(Employee.class);
	    System.out.println(bean);
  }
}
