package com.example.freelance.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.example.freelance.pages.SnapDealHomePage;


public class SnapDealSearchTest extends BaseTest {
	
	
	
	/*
	 * The following test will search for "mobile" in the snapdeal website.
	 * 
	 */
	@Test
	public void searchSnapDeal(){
		session.getDriver().get(session.getConfig().getUrl());
		SnapDealHomePage page = PageFactory.initElements(session.getDriver(), SnapDealHomePage.class);
		page.searchForItem("mobile");
		
		
	}

}
