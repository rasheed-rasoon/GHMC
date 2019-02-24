package rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class propertiesclass {
	@Test
	public void sampleCodeProperties()
	{
	Properties p=new Properties();
	try {
		FileInputStream fis=new FileInputStream("D:\\RASHEED\\config.properties");
		p.load(fis);
		System.out.println(p.getProperty("Name"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getStackTrace());
		e.printStackTrace();
	}
	
		
	}

}
