   package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliPractice {
	public static WebDriver driver;
	public static void sikuli() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rasheed\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://testghmc.cgg.gov.in/sports");
		Screen sc=new Screen();
		String mobileNum="C:\\Users\\Rasheed\\Downloads\\Sikuli\\Image1.PNG";
		Pattern pt=new Pattern(mobileNum);
		sc.wait(mobileNum);
		sc.type(pt, "9491023820");
		
	}
	
	

	public static void main(String[] args) throws Exception {
		SikuliPractice.sikuli();

	}

}
