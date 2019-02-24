package rough;

import java.util.List;

import org.eclipse.jetty.client.WWWAuthenticationProtocolHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rough {
	public static WebDriver driver;
	
	
	public static WebElement waitForElementVisible(WebElement element)
	{
		WebDriverWait wWait=new WebDriverWait(driver,30);
		 wWait.until(ExpectedConditions.visibilityOf(element));
		return element;
		
	}
	
	
	public static WebElement waitMethod2(WebElement element)
	{
		WebDriverWait wwait=new WebDriverWait(driver, 30);
		wwait.until(ExpectedConditions.elementToBeSelected(element));
		return element;
		
		
	}
	
	public static void waitMethod3(List<WebElement> element)
	{
		
		WebDriverWait wWait=new WebDriverWait(driver,30);
		wWait.until(ExpectedConditions.visibilityOfAllElements(element));
		
	}
	
	public static void waitMathod3(WebElement element)
	{
		
		WebDriverWait wWiat=new WebDriverWait(driver, 30);
		wWiat.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	{
		
		
	}
	
	
	

}
