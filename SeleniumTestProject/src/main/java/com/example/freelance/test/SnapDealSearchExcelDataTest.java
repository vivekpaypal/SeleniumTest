package com.example.freelance.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.example.freelance.pages.SnapDealHomePage;


public class SnapDealSearchExcelDataTest extends BaseTest {
	
	
	
	/*
	 * The following test will search for data from the excel sheet in the snapdeal website.
	 * 
	 */
	@Test (dataProvider="searchData")
	public void searchSnapDeal(DataInfo data){
		session.getDriver().get(session.getConfig().getUrl());
		SnapDealHomePage page = PageFactory.initElements(session.getDriver(), SnapDealHomePage.class);
		page.searchForItem(data.searchData);
		
		
	}
	
	
	/*
	 * Data provider reading the data from excel sheet.
	 */
	@DataProvider(name="searchData")
	public Iterator<Object[]> getData() throws Exception{
		
		ExcelUtility<DataInfo> data = new ExcelUtility<DataInfo>("./src/main/resources/testData/","SampleTestData.xlsx");
	
		List<Object []> list=  new ArrayList<Object[]>();
		List<DataInfo> l =  data.getData(DataInfo.class);
		for(DataInfo d: l){
		Object [] o = {d};	
		list.add(o);
		}
		
		return list.iterator();
	}
	
	

}
