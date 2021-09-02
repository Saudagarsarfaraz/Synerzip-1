package com.synerzip.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.synerzip.model.Model;
import com.synerzip.product.Product;

@Configuration
public class AnnotationConfig {

	@Bean
	public Model mod() {
		Model m = new Model();
		m.setmId(9228);
		m.setmName("Hp-Pavilion");
		return m;
	}
	
	@Bean
	public Product prod() {
		Product p = new Product();
		p.setpId(101);
		p.setpName("Hp");
		p.setModel(mod());
		return p;
		
	}
	
}
