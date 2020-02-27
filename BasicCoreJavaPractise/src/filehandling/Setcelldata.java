package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Setcelldata {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("D:\\AutomationRepo\\BasicCoreJavaPractise\\src\\filehandling\\Naysha.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook (file);
		XSSFSheet sheet =  wb.getSheet("Sheet1");
		
		
		
		XSSFRow row = sheet.getRow(30);
		if (row == null)
			row = sheet.createRow(30);
		
		XSSFCell cell = row.getCell(10);
		if(cell == null)
			cell =row.createCell(10);
		
		
		cell.setCellValue("Apoorva");
		
		FileOutputStream file2 = new FileOutputStream("D:\\AutomationRepo\\BasicCoreJavaPractise\\src\\filehandling\\Naysha.xlsx");
		
		wb.write(file2);
		
		
	}
}
