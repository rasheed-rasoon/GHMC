package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterAnnotation {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	
	public void parameterization(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
		
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Rasheed\\Downloads\\geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.dribver","D:\\Rashi_Workspace\\Sports_Inventory\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
			
		}
	}
	
	
	
  @Test
  public void f() {
	  driver.get("https://mail.cgg.gov.in/?loginOp=logout");
  }
}
