package com.example.freelance.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.example.freelance.pages.SnapDealHomePage;


public class SnapDealSearchDataDrivenTest extends BaseTest {
	
	
	
	/*
	 * The following test will search for multiple data using the data provider in the snapdeal website.
	 * 
	 */

	
	@Test(dataProvider="searchData")
	public void searchSnapDealDataDriven(String text){
		session.getDriver().get(session.getConfig().getUrl());
		SnapDealHomePage page = PageFactory.initElements(session.getDriver(), SnapDealHomePage.class);
		page.searchForItem(text);
		
		
	}
	
	@DataProvider(name="searchData")
	public Object [][] getData(){
		
		
		Object [] [] data = { {"mobile"},{"pen"},{"toys"}};
		return data;
	}

}
