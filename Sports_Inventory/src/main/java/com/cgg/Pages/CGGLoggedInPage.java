package com.cgg.Pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgg.testcases.TestBase;
import com.cgg.util.AssertionsUtil;

public class CGGLoggedInPage extends TestBase{
	
	private WebDriver driver;
	public CGGLoggedInPage(WebDriver  driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@id='zi_search_inputfield']")
	private WebElement SearchBox;
	
	public boolean isCGGLoggedInPageOpened()
	{
		try {
			 AssertionsUtil.isElementPresent(this.SearchBox);
		} catch (NoSuchElementException e) {
			return false;
		}
		return true;
	}
	

}
