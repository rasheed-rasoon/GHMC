package rough;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Rasheed\\Downloads\\data.xlsx");
		Workbook wb=new XSSFWorkbook(fis);
		Sheet s=wb.getSheetAt(0);
		
		int RowSize=s.getLastRowNum();
		for(int i=0;i<=RowSize;i++)
		{
			Row r=s.getRow(i);
			for(int j=1;j<r.getLastCellNum();j++)
			{
				Cell c=r.getCell(j);
				System.out.println(c.getStringCellValue());
				
			}
		}
wb.close();

	}

}
