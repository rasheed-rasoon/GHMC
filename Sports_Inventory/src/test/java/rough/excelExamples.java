package rough;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelExamples {
	
	public static void readExcel() throws Exception
	{
		FileInputStream fis=new FileInputStream("D:\\Rashi_Workspace\\Sports_Inventory\\data\\TestCases.xlsx");
		Workbook wb=new XSSFWorkbook(fis);
		Sheet s=wb.getSheetAt(0);
		
		int rowcount=s.getLastRowNum();
	
		for(int i=0;i<rowcount;i++)
			
		{
		Row r=s.getRow(i);
		//System.out.println("number of cell for "+i +" row are");
			for(int j=0;j<r.getLastCellNum();j++)
			{
				Cell c=r.getCell(j);
				System.out.println("number of cell for "+i +" row are" +r.getLastCellNum());
				
				System.out.print(c.getStringCellValue());
			}
			System.out.println();
		}
		
	}
	
	public static void writeData() throws IOException
	{
		FileOutputStream fos=new FileOutputStream("D:\\Rashi_Workspace\\data.xlsx");
		 Workbook wb=new XSSFWorkbook();
		 Sheet s=wb.createSheet("testCase");
		 int rowCount=s.getLastRowNum();
		 
		 for(int i=0;i<=rowCount;i++)
		 {
			Row r=s.createRow(i);
			
			for(int j=0;j<=r.getLastCellNum();j++)
			{
				
				Cell c=r.createCell(j);
				c.setCellValue("rasheed");
				
			}
			 
			 
		 }
		 wb.write(fos);
		 wb.close();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//excelExamples.readExcel();
		excelExamples.writeData();
	}

}
