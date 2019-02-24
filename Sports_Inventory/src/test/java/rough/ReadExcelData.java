package rough;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static void readExcelData() throws IOException
	{
	FileInputStream fis=new FileInputStream("D:\\Rashi_Workspace\\Sports_Inventory\\data\\TestCases.xlsx");	
		Workbook w=new XSSFWorkbook(fis);
		for(int k=0;k<=2;k++)
		{
			System.out.println("getting data from "+k +"  sheet");
		Sheet s=w.getSheetAt(k);
		int rowCount=s.getLastRowNum();
		System.out.println("row count is   "+rowCount);
		
		System.out.println(rowCount);
		for(int i=0;i<=rowCount;i++)
		{
			Row r=s.getRow(i);
			
			for(int j=0;j<r.getLastCellNum();j++)
				
			{
				Cell c=r.getCell(j);
				System.out.print(c.getStringCellValue());
				System.out.println();
			}
			
		}
		
	}
		w.close();
		fis.close();
	}

	public static void main(String[] args) throws IOException {
	ReadExcelData.readExcelData();

	}

}
