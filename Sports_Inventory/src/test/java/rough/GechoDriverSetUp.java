package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GechoDriverSetUp {
	
	public static WebDriver driver;
	public static void firefoxDriver()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rasheed\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.linkText("MOBILE TESTING"));
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	

	public static void main(String[] args) {
		GechoDriverSetUp.firefoxDriver();

	}

}
