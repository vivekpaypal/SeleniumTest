package com.example.freelance.test;

import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	
protected DriverSession session;
	
	@BeforeTest(alwaysRun=true)
	public void test(ITestContext context){
		
		TestConfig config = new TestConfig();
		
		config.setBrowser(context.getSuite().getParameter("browser"));
		config.setUrl(context.getSuite().getParameter("url"));
		 
		session = new DriverSession(config);
		session.setDriver();
		
		
	}
	
	
	@AfterTest
	public void tearDown (){
		
		session.getDriver().close();
	}
}
