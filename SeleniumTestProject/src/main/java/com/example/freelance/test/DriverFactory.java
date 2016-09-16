package com.example.freelance.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	
	protected DriverFactory() {
		
	}
	
	public static WebDriver getInstance(String browser){
		
		
		if(browser.equals("firefox")){
			
			return new FirefoxDriver();
			
		}
		
		if(browser.equals("chrome")){
					
			return new ChromeDriver();
					
		}


		if(browser.equals("internetexproler")){
			
			return new InternetExplorerDriver();
			
		}
		return new InternetExplorerDriver();
	}

}
