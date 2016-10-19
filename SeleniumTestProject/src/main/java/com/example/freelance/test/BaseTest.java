package com.example.freelance.test;

import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	
protected DriverSession session;
	
	
	@BeforeMethod(alwaysRun=true)
	public void intiDriver(ITestContext context){
		TestConfig config = new TestConfig();
		
		config.setBrowser(context.getSuite().getParameter("browser"));
		config.setUrl(context.getSuite().getParameter("url"));
		
		session = new DriverSession(config);
		session.setDriver();
	}
	
	@AfterMethod
	public void tearDown (){
		
		session.getDriver().close();
	}
}
