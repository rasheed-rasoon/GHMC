package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ActionClassExamples {
	public WebDriver driver;

@Test(description="scroll up and scroll down")
public void scrollupAndDown()
{
	System.setProperty("webdriver.chrome.driver","D:\\Rashi_Workspace\\Sports_Inventory\\Drivers\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement element=driver.findElement(By.linkText("Linux"));
	js.executeScript("arguments[0].scrollIntoview();", element);
	
}
{
}

	}


