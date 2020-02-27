package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(
				"D:\\AutomationRepo\\BasicCoreJavaPractise\\src\\filehandling\\Naysha.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(file);

		XSSFSheet sheet = wb.getSheet("Sheet1");

		XSSFRow row = sheet.getRow(4);

		XSSFCell cell = row.getCell(0);

		String str = cell.getStringCellValue();

		System.out.println(str);

		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();

		System.out.println(cols);
		System.out.println(rows);

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {

				String str1 = sheet.getRow(r).getCell(c).getStringCellValue();
				System.out.print(str1 + " ");
			}
			System.out.println();
		}

	}

}
