package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;
	@Given("Open firefox and start application")
	public void Open_firefox_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Rashi_Workspace\\TsFactories-ExtentReports\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("^I enter valid userName and valid password$")
	public void I_enter_valid_UserId_and_valid_Password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("rasheed.rasoon@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("R@sheed66");
	    
	}

	@Then("User should be able to login succesfully")
	public void User_should_be_able_to_login_succesfully() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("u_0_2")).click();
	}
}