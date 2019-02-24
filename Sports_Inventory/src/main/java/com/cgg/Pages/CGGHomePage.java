package com.cgg.Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cgg.constants.CGGHomePageConstants;
import com.cgg.testcases.TestBase;
import com.cgg.util.AssertionsUtil;
import com.cgg.util.FunctionUtil;
import com.cgg.util.WaitUtil;

public class CGGHomePage extends TestBase{
	private WebDriver driver;
	
	public CGGHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id=CGGHomePageConstants.USENAME)
	private WebElement UserName;
	
	@FindBy(id=CGGHomePageConstants.PASSWORD)
	private WebElement Password;
	
	@FindBy(xpath=CGGHomePageConstants.LOGINBUTTON)
	private WebElement LoginButton;
	
	
	public boolean CGGHomePageOpened()
	{
		try{
			
			AssertionsUtil.isElementPresent(this.LoginButton);
		}
		
		catch(NoSuchElementException e)
		{
			return false;
		}
		
		return true;
		
		
	}

	public CGGLoggedInPage cgglogin(String uname,String pwd)
	{
		sendKeysToTextBox(this.UserName,uname);
		//APP_LOGS.info
		sendKeysToTextBox(this.Password,pwd);
		try {
			//WaitUtil.waitForElementClickable(this.LoginButton);
			FunctionUtil.safeJavaScriptClick(this.LoginButton);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return PageFactory.initElements(driver,CGGLoggedInPage.class);
	}
	
	
	
	
	
	
}




