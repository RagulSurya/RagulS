package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {
	public static String getData (int rownum, int cellnum) throws IOException {
		File f=new File("C:\\Users\\sulu\\Desktop\\Maven\\Ragul\\Excel\\Demo.xlsx");
		FileInputStream stream = new FileInputStream (f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Ragul");
		Row r = s.getRow(rownum);
		Cell c = r.getCell(cellnum);
		int type = c.getCellType();
		String name = null;
		if (type == 1) {
			name = c.getStringCellValue();
		}
		if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				new SimpleDateFormat("dd-MMM-yy").format(c.getDateCellValue());
				}
			else
			{
			name = String.valueOf((long)c.getNumericCellValue());
			}
		}
		
		return name;
		
	}

}
