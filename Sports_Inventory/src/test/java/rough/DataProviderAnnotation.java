package rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProviderAnnotation {
  @Test(dataProvider="Authentication")
  public void StudentInfo(String userName,String passWord) {
	  
	  System.out.println("user name is "+userName+" and password is "+passWord);
  }
  
  @DataProvider(name="Authentication")
  public Object[][] getData() throws IOException
  {
	Object [][] data=new Object[2][2]; 
	FileInputStream fis=new FileInputStream("C:\\Users\\Rasheed\\Downloads\\data.xlsx");
	Workbook wb=new XSSFWorkbook(fis);
	Sheet s=wb.getSheetAt(0);
	
	int rowSize=s.getLastRowNum();
	for(int i=0;i<rowSize;i++)
	{
		Row r=s.getRow(i);
		for(int j=1;j<r.getLastCellNum();j++)
		{
			Cell c=r.getCell(j);
			data[0][j]=c.getStringCellValue();
			data[1][j]=c.getStringCellValue();
			//System.out.println(c.getStringCellValue());
			
		}
	}
	wb.close();
	  
	return data ;  
  }
  
  
  
}
