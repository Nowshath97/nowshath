package Tutorials;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:/Users/Naushad/Desktop/Tutorial Videos/Selenium/ExcelData/TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Testdata");
		
		int rowCount = sheet.getLastRowNum();

		for(int i=0;i<rowCount;i++){
			
			String data0 = sheet.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("Test data from Excel is: " +data0);
		}
		//String data0 = sheet.getRow(1).getCell(0).getStringCellValue();
		
		//System.out.println("Data from Excel is: "+data0);
		wb.close();
	}
}
