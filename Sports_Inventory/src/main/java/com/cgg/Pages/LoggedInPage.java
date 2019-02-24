package com.cgg.Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgg.constants.LoggedInPageConstants;
import com.cgg.util.AssertionsUtil;

public class LoggedInPage {
	
	private WebDriver driver;
	
	public LoggedInPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=LoggedInPageConstants.STOCKREQUESTBYGI)
	private WebElement StockRequestByGi;
	
	
public boolean isLoggedInPageOpened(){
		
		try {
			 AssertionsUtil.isElementPresent(this.StockRequestByGi);
		} catch(NoSuchElementException e) {
			return false;
		}
		return true;
	}

}
