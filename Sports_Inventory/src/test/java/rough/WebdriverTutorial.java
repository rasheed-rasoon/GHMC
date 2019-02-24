package rough;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverTutorial {
	public static WebDriver driver;
	
	public static void JDBCConnection() throws SQLException, ClassNotFoundException
	{
		
		Connection con=DriverManager.getConnection("url","user name","Password");
		Class.forName("com.mysql.jdbc.driver");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from table table name");
		
		while(rs.next())
		{
			
			
		}
		
	}
	
	public static void iframeEx()
	{
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Rasheed\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.guru99.com/handling-iframes-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		int size=driver.findElements(By.tagName("iframe")).size();
		System.out.println("size is  "+size);
	}
	
	public static void main(String []args )
	{
		WebdriverTutorial.iframeEx();
		
	}
	

}
