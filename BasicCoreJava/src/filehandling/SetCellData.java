package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetCellData {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("D:\\AutomationRepo\\BasicCoreJava\\src\\filehandling\\Book1.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");

		XSSFRow row = sheet.getRow(14);
		if(row == null)
			row = sheet.createRow(14);

		XSSFCell cell = row.getCell(10);
		if (cell == null)
			cell=row.createCell(10);

		cell.setCellValue("Apoorva");
		
		FileOutputStream file2 = new FileOutputStream("D:\\AutomationRepo\\BasicCoreJava\\src\\filehandling\\Book1.xlsx");
		
		wb.write(file2);
	}

}
