package com.example.freelance.test;

import org.openqa.selenium.WebDriver;

public class DriverSession {
	
	
	private  TestConfig config;
	
	private  ThreadLocal<WebDriver> session = new ThreadLocal<WebDriver>() {
		
		
		
	};
	
	
	public DriverSession(TestConfig config) {
		
		this.config = config;
	}
	
	
	
	
	public TestConfig getConfig() {
		return config;
	}




	public void setConfig(TestConfig config) {
		this.config = config;
	}


    public void setDriver(){
    	session.set(DriverFactory.getInstance(config.getBrowser()));
    }

	public WebDriver getDriver(){
		
		return session.get(); 
		
	}
	
	

}
