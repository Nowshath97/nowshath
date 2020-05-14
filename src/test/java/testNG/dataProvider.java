package testNG;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataProvider {
	
	public static void main(String[]args) throws IOException{
		
		String[][] data ;
		dataProvider dp = new dataProvider();
		dp.getexcelData();
		
		
		
	}
	
	/*@DataProvider(name="searchData")
	public String[][] searchData() throws IOException{
		
		String[][] data ;
		dataProvider dp = new dataProvider();
		data = dp.getexcelData();
		return data;
	}*/
	
	
	/*public void doSearch(String site){
		System.setProperty("webdriver.chrome.driver", "C:/Users/Naushad/workspace/Jars/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(site);
		driver.close();
	}*/
	
	public void getexcelData() throws IOException{
		String[][] ExcelData = null;
		
		FileInputStream fis = new FileInputStream("C:/Users/Naushad/Desktop/Tutorial Videos/TestData/testdata1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int len = sheet.getLastRowNum();
		System.out.println(len);
		for(int i=1;i<=len;i++){
			Row ro = sheet.getRow(i);
			for(int j=0;j<ro.getLastCellNum();j++){
				
			
			
			Cell ce = ro.getCell(j);
		
			
			
			
			
	
			}
		}
		
		System.out.println(ExcelData[0][0]);
	
	}
		
		
	}



