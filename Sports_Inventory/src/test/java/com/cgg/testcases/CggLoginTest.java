package com.cgg.testcases;

import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cgg.Pages.CGGHomePage;
import com.cgg.Pages.CGGLoggedInPage;
import com.cgg.util.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

public class CggLoginTest extends TestBase {
@Test(dataProvider="getData")
	
	public void testLogin(Hashtable <String,String>data) throws Exception{
		test=report.startTest("Testing login functionality");
		

		if(!TestUtil.isExecutable(this.getClass().getSimpleName(), xls)|| data.get("Runmode").equalsIgnoreCase("N"))
			throw new SkipException("Skipping the Test Case Number");

		driver.get("https://mail.cgg.gov.in/");
		test.log(LogStatus.INFO,"navigated to url");

		CGGHomePage home=PageFactory.initElements(driver,CGGHomePage.class);
		test.log(LogStatus.INFO, "Testing Loging Functionality");
		CGGLoggedInPage	lp= home.cgglogin(data.get("LoginId"), data.get("Password"));

		if(data.get("DataFlag").equalsIgnoreCase("P") && home.CGGHomePageOpened()){
			reportFail("unable to logged for valid data");
		}
		else 
			
			if(data.get("DataFlag").equalsIgnoreCase("N") && lp.isCGGLoggedInPageOpened()){
			reportFail("Navaigated to Logged in page with invalid data");
		}
			else{
				reportpass("Login Functionallity Working Fine");
			
			}

	}

	



	@DataProvider
	public Object[][] getData(){
		return TestUtil.getData(this.getClass().getSimpleName(),xls);
	}



}
