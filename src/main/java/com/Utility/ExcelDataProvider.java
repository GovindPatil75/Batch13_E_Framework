package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		
		String filepath="D:\\Batch_13E_Framework\\TestData\\Data.xlsx";
		
		FileInputStream file=new FileInputStream(filepath);
		
		 wb=new XSSFWorkbook(file);
	}

	public String getStringData(String Sheetname,int row,int cell) {
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	
	
}
