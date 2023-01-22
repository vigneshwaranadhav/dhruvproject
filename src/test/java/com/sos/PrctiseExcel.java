package com.sos;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class PrctiseExcel {
	
	public static void main(String[] args) throws Throwable {
		File file = new File("C:\\Users\\user\\eclipse-workspace\\Newunit\\demo.xls");
		FileInputStream fn = new FileInputStream(file);
		Workbook wb = new HSSFWorkbook(fn);
		Sheet sheet = wb.getSheet("maven");
		//Row row = sheet.getRow(1);
		//Cell cell = row.getCell(0);
		//System.out.println(cell);
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		Row row = sheet.getRow(1);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		System.out.println(physicalNumberOfCells);
		
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);
			
			for (int j = 1; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				System.out.println(cell);				
			}
			
			
		}
		
		
		
		
		
		
	}

}
