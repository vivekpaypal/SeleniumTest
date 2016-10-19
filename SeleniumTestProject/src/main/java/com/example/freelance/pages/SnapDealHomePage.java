package com.example.freelance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class SnapDealHomePage {
	
	@FindBy(how = How.ID, using = "inputValEnter")
    private WebElement searchBox;
	@FindBy(how = How.CLASS_NAME, using = "searchformButton")
	private WebElement searchButton;
	@FindBy(how = How.CLASS_NAME, using = "search-result-text")
	private WebElement resultText;
	
	
	public void searchForItem(String searchterm){
		
		searchBox.sendKeys(searchterm);
		searchButton.click();
		Assert.assertTrue("Verify the search term in result page", resultText.getText().contains(searchterm));
	}

}
