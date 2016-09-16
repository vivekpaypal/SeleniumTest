package com.example.freelance.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SampleTest extends BaseTest {
	
	
	
	@BeforeSuite
	public void testSuite(){
		System.out.println("I ran first");
	}
	
	
	@BeforeTest
	
	public void test(){
		System.out.println("I ran second");
	}
	
	@BeforeClass
	public void classTest(){
		
		System.out.println("I ran thrid");
	}
	
	@BeforeMethod
	public void testMethod(){
		
		System.out.println("I ran fourth");
	}
	
	@Test
	public void testMet(){
		session.getDriver().get(session.getConfig().getUrl());
	}

}
