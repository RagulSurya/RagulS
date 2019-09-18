package org.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excel {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\sulu\\Desktop\\Maven\\Ragul\\Excel\\Demo.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		System.out.println("to print the cell in excel");
		Sheet s = w.getSheet("Ragul");
		Row r = s.getRow(2);
		Cell c = r.getCell(1);
		System.out.println(c);
		int phyrow = s.getPhysicalNumberOfRows();
		System.out.println(phyrow);
		int phycell = r.getPhysicalNumberOfCells();
		System.out.println(phycell);
		System.out.println("printing the value present in excel sheet in only row using for loop");
		//For Cell
		for (int i = 0; i<r.getPhysicalNumberOfCells();i++) {
			Cell ce = r.getCell(i);
		System.out.println("to print all values present in excel sheet using nested for loop");
		//For Row
		for (int j = 0; j<s.getPhysicalNumberOfRows(); j++) {	
			Row row = s.getRow(j);
	    //For Cell
		for (int k = 0; k<r.getPhysicalNumberOfCells(); k++) {
			Cell cell = r.getCell(k);
			System.out.println(cell);
		//Cell Type
		//type == 1 means String
		//type == 0 means Numerical or Date
		int type = c.getCellType();
		if (type == 1 ) {
			String cellValue = c.getStringCellValue();
			System.out.println(cellValue);
		if (type == 0) {
			double cellValue2 = c.getNumericCellValue();
			System.out.println(cellValue2);
			//to convert double into string
			long l = (long)cellValue2;
			String of = String.valueOf(l);
			System.out.println(of);
		}}}}}}}

		
		
	
