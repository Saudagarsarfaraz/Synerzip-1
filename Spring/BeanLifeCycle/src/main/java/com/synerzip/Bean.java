package com.synerzip;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean  {  //implements InitializingBean,DisposableBean
	public Bean() {
		System.out.println("Object is created");
	}
	//Predefined beans
	/*@Override
	public void destroy() throws Exception {
		System.out.println("closing SMTP server");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Connected to SMTP server");
		
	}*/
	//Custom Beans	
	public void close() {
		System.out.println("closing SMTP server");
	}
	public void init() {
		System.out.println("Connected to SMTP server");
	}
	private int port;
	private String host;	
	public void setPort(int port) {
		this.port = port;
	}
	
	public void setHost(String host) {
		System.out.println("providing data");
		this.host = host;
	}
	public void show() {
        System.out.println("Method is executed");		
	}
	

}
