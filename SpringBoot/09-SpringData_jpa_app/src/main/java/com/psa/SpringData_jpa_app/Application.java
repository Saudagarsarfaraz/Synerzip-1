package com.psa.SpringData_jpa_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.psa.SpringData_jpa_app.Repository.EmpRepository;
import com.psa.SpringData_jpa_app.Service.EmpService;
import com.psa.SpringData_jpa_app.entity.EMP_TBL;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
	
		EmpService bean = run.getBean(EmpService.class);
		bean.saveOrUpdateData();
		bean.fetchData();
		bean.deleteData();
	
	    run.close();  
	
	}

}
