package com.synerzip.JavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.synerzip.config.AnnotationConfig;

import com.synerzip.product.Product;

public class App {
  public static void main(String[] args) {
   
	  AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationConfig.class);
	  Product bean = applicationContext.getBean("prod", Product.class);
	  System.out.println(bean);
	  
	  
	  
  }
}
