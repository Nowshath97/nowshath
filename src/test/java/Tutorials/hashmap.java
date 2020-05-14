package Tutorials;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class hashmap {

	public static void main(String[] args) throws Exception {
		
		 Map<String, String> hashMap = new HashMap<String, String>();
		 
		 hashMap.put("username", "nowshath@test.com");
		 
		 hashMap.put("password", "test@123");
		 

		 
		 File src = new File("C:/Users/Naushad/Desktop/Tutorial Videos/Selenium/ExcelData/TestData.xlsx");
		 FileInputStream fi = new FileInputStream(src);
		 
		 XSSFWorkbook book = new XSSFWorkbook();
		 XSSFSheet sheet = book.getSheet("TestData");
		 
		 int rowcount = sheet.getLastRowNum();
		 
		 for(int i=0;i<rowcount;i++){
			 String data1 = sheet.getRow(i).getCell(1).getStringCellValue();
			 
			 System.out.println(data1);
		 }
		 
		 
	}

}
