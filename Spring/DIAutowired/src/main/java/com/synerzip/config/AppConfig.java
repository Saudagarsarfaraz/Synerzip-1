package com.synerzip.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.synerzip.addImpl.PermanentAdd;
import com.synerzip.addImpl.PhysicalAddress;
import com.synerzip.emp.Employee;

@Configuration
public class AppConfig {
	   @Bean
	   
	   public PermanentAdd perAdd() {       
		   PermanentAdd p1 = new PermanentAdd();
		   p1.setHno(625);
		   p1.setLoc("Latur");
		   return p1;	   
	   }
	   
	   @Bean
	   @Primary
	   public PhysicalAddress phyAdd() {
		   PhysicalAddress p2 = new PhysicalAddress();
		   p2.setHno(666);
		   p2.setLoc("Pune");
		   return p2;		   
	   }
	   
	   @Bean
	   public Employee emp() {
		   Employee e1 = new Employee();
		   e1.setEmpId(100);
		   e1.setEmpName("sazz");
		   return e1;
	   }
	   
	   
	   
	   
	   
	   
	   
   }


