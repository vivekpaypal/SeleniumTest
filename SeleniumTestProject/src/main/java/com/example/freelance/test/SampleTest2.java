package com.example.freelance.test;

import org.testng.annotations.Test;


public class SampleTest2 extends BaseTest {
	
	
	
	@Test
	public void testMet(){
		session.getDriver().get(session.getConfig().getUrl());
	}

}
