package com.cgg.Pages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cgg.constants.HomePageConstant;
import com.cgg.testcases.TestBase;
import com.cgg.util.AssertionsUtil;
import com.cgg.util.FunctionUtil;


public class HomePage extends TestBase {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name=HomePageConstant.USERNAME)
	private WebElement UserName;
	
	@FindBy(name=HomePageConstant.PASSWORD)
	private WebElement PassWord;
	
	
	
	@FindBy(name=HomePageConstant.SUBMIT)
	private WebElement Submit;
	
	
	public boolean isHomePageOpened(){
		
		try {
			 AssertionsUtil.isElementPresent(this.UserName);
		} catch(NoSuchElementException e) {
			return false;
		}
		return true;
	}
	
	public LoggedInPage login(String userName,String PassWord)
	{
		sendKeysToTextBox(this.UserName, userName);
		FunctionUtil.acceptAlertIfAvailable();
		sendKeysToTextBox(this.PassWord, PassWord);
		FunctionUtil.acceptAlertIfAvailable();
		//clickOnButton(this.Submit);
		try {
			FunctionUtil.safeJavaScriptClick(this.Submit);
			FunctionUtil.acceptAlertIfAvailable();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return PageFactory.initElements(driver, LoggedInPage.class);
	}
	
	
	
			
	}
	

	




