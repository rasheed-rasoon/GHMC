package rough;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MapInterface {
	
	
	public static WebDriver driver;
	public static void JavaScriptExecutorExamples()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Rashi_Workspace\\Sports_Inventory\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://testghmc.cgg.gov.in/sports/");
		
		//driver.findElement(By.id("ctl00$ContentPlaceHolder1$txtmobieno")).sendKeys("RASHEED");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
		
		
	}
	
	

	public static void main(String[] args) {
		MapInterface.JavaScriptExecutorExamples();

	}

}
