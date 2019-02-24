package com.cgg.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgg.constants.HomePageConstant;
import com.cgg.testcases.TestBase;

public class HomePages3 extends TestBase {
	private WebDriver driver;
	
	
	public HomePages3(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, driver);
		
	}
	
	@FindBy(name=HomePageConstant.PASSWORD)
	private WebElement uName;
	
	
	
	@FindBy(name=HomePageConstant.PASSWORD)
	private WebElement pWord;
	
	@FindBy(name=HomePageConstant.SUBMIT)
	private WebElement clickSubmit;
	
	public void enterUserName(String userName)
	{
		
		sendKeysToTextBox(this.uName, userName);
		
	}
	
	public void enterPassword(String PassWord)
	{
		sendKeysToTextBox(this.pWord, PassWord);
	}
	
	public LoggedInPage login(String uName,String pWord)
	{
		enterUserName(uName);
		enterPassword(pWord);
		clickSubmit.click();
		return PageFactory.initElements(this.driver,LoggedInPage.class);
		
		
	}

}
