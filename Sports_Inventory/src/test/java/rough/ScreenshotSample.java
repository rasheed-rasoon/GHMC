 package rough;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotSample {
	
	public static WebDriver driver;
	
	public static void takeCsreenshot() throws IOException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rasheed\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.softwaretestingmaterial.com/create-testng-xml-file/");
		screesnhot();
		
		
	}
	
	public static void screesnhot() throws IOException
	{
		
		
	TakesScreenshot screeShot=(TakesScreenshot)driver;
	File src=screeShot.getScreenshotAs(OutputType.FILE);
	
	File dest=new File("D:\\Rashi_Workspace\\Sports_Inventory\\Screenshorts");
	FileUtils.copyFile(src, dest);
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ScreenshotSample.takeCsreenshot();
	

	}

}
