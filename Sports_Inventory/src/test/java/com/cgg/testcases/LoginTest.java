 package com.cgg.testcases;
import java.util.Hashtable;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.cgg.Pages.HomePage;
import com.cgg.Pages.LoggedInPage;
import com.cgg.util.TestUtil;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest extends TestBase{

	@Test(dataProvider="getData")
	
	public void testLogin(Hashtable <String,String>data){
		test=report.startTest("Testing login functionality for aports inventory");
		
		if(!TestUtil.isExecutable(this.getClass().getSimpleName(), xls)|| data.get("Runmode").equalsIgnoreCase("N"))
			throw new SkipException("Skipping the Test Case Number");

		driver.get("http://testghmc.cgg.gov.in/Sports_Inventory");
		test.log(LogStatus.INFO,"navigated to url");

		HomePage home=PageFactory.initElements(driver,HomePage.class);
		
		
		test.log(LogStatus.INFO, "Testing Loging Functionality");
		LoggedInPage	lp= home.login(data.get("LoginId"), data.get("Password"));
		System.out.println("going to test login functionality");

		if(data.get("DataFlag").equalsIgnoreCase("P") && home.isHomePageOpened()){
			reportFail("unable to logged for valid data");
		}
		else 
			
			if(data.get("DataFlag").equalsIgnoreCase("N") && lp.isLoggedInPageOpened()){
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
