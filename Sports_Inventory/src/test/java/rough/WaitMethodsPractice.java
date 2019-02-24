package rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethodsPractice {
	static WebDriver driver;
	
	public static void isElementPresent(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
	public static void IsAllElementsPResent(List<WebElement> elements)
	{
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}
	
	public static void waitTillTheElementIsLoaded(String titleName)
	{
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleContains(titleName));
		
	}

	public static void waitTillTheTiTles(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.titleIs(title));
	}
	
	
	public static void elementToBeSleectable(WebElement element)
	{
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public static void elementToBeSelected(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeSelected(element));
		
	}
	
	public static void presenceOfAllElementsLocatedBy(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
		
	}

	
}
