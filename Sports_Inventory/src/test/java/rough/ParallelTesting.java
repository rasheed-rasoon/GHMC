package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	public WebDriver driver;

  @BeforeTest
  @Parameters("browser")
  public void beforeTest(String browser) {
	  if(browser.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Rasheed\\Downloads\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  
	  }
	  else if(browser.equals("chrome"))
	  {
		 System.setProperty("WebDriver.chrome.driver","D:\\Rashi_Workspace\\Sports_Inventory\\Drivers\\chromedriver.exe"); 
		  driver=new ChromeDriver();
		  
	  }
	   
  }
@Test

public void parallelTest()
{
driver.get("https://mail.cgg.gov.in/?loginOp=logout");	

driver.findElement(By.id("username")).sendKeys("rasheedahmed.sk");

driver.findElement(By.id("password")).sendKeys("Sep@1628");


}
}
