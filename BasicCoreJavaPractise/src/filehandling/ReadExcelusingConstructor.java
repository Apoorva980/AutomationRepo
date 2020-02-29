


public void setCellData(String sheetName, int rowNum, int colNum, String value) throws IOException
	{
		FileInputStream file= new FileInputStream(filepath);
		
		//Workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		//work sheet
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		//Row
		XSSFRow row=sheet.getRow(rowNum);
		if(row==null)
			row=sheet.createRow(rowNum);
		
		//Cell
		XSSFCell cell=row.getCell(colNum);
		if(cell==null)
			cell=row.createCell(colNum);
		
		cell.setCellValue(value);		

		FileOutputStream fileOut = new FileOutputStream(filepath);

		wb.write(fileOut);