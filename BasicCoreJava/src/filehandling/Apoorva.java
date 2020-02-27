package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apoorva {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream ("D:\\AutomationRepo\\BasicCoreJavaPractise\\src\\filehandling\\Apoorva.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		String str = sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(str);
		
		int row = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getLastCellNum();
		
		System.out.println(row);
		System.out.println(col);
		
	
		for (int r =0; r <row; r++)
		{
			for (int c= 0; c < col; c++) {
				
				String str1 = sheet.getRow(r).getCell(c).getStringCellValue();
				
				System.out.print(str1 +" ");
			}
			
			System.out.println();
			
			XSSFRow row1 = sheet.getRow(8);
			if(row1 == null)
				row1 = sheet.createRow(8);

			XSSFCell cell1 = row1.getCell(0);
			if (cell1 == null)
				cell1=row1.createCell(0);

			cell1.setCellValue("mayra");
			
			FileOutputStream file2 = new FileOutputStream("D:\\AutomationRepo\\BasicCoreJavaPractise\\src\\filehandling\\Apoorva.xlsx");
			
			wb.write(file2);
		} 
		
	}
}
