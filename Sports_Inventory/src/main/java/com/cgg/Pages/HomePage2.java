package com.cgg.Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgg.constants.HomePageConstant;
import com.cgg.testcases.TestBase;
import com.cgg.util.AssertionsUtil;

public class HomePage2 extends TestBase{
	
	private WebDriver driver;
	
	public HomePage2(WebDriver driver)
	{
	this.driver=driver;	
	PageFactory.initElements(driver,this);	
		
	}
	
	
	@FindBy(name=HomePageConstant.USERNAME)
	private WebElement userName;
	
	@FindBy(name=HomePageConstant.PASSWORD)
	private WebElement password;
	
	public void sendUserName(String uName)
	{
		sendKeysToTextBox(this.userName,uName);
		
	}
	
	public LoggedInPage login(String userName,String PWord)
	{
		sendKeysToTextBox(this.userName,userName);
		
		sendKeysToTextBox(this.password,PWord);
		return PageFactory.initElements(this.driver,LoggedInPage.class);
		
		
		
	}
	
	
	
	public boolean isHomePageOpened()
	{
		try{
			
			AssertionsUtil.isElementPresent(this.userName);
		}
		
		catch(NoSuchElementException e)
		{
		return false;	
			
		}
		return true;
		
		
		
	}
	

}
