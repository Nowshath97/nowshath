package collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceltoList {

	public static void main(String[] args) throws IOException {
		
		File src = new File("C:/Users/Naushad/Desktop/Tutorial Videos/Selenium/ExcelData/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Testdata");
		
		
		
		ArrayList<Employee> empdata = new ArrayList<Employee>();
		
		for(int i=sheet.getFirstRowNum();i<sheet.getLastRowNum();i++){
			System.out.println("Row("+i+"): "+i);
			Row ro = sheet.getRow(i);
		for(int j=ro.getFirstCellNum();j<ro.getLastCellNum();j++){
			Cell ce = ro.getCell(j);
				System.out.println(ce.getStringCellValue());
		}
		
		}
		
		
		for(int i=1;i<sheet.getLastRowNum();i++){
			Employee e = new Employee();
			Row ro = sheet.getRow(i);
			
		for(int j=0;j<ro.getLastCellNum();j++){
			
			Cell ce = ro.getCell(j);
	
			
			e.setEmpId(ce.getStringCellValue());
			e.setName(ce.getStringCellValue());
			e.setpunchin(ce.getStringCellValue());
			e.setpunchout(ce.getStringCellValue());
			
		}
			
		empdata.add(e);
			
		}
		
		/*for(Employee emp: empdata){
			System.out.println("|ID: "+emp.getEmpId() +"| Name: "+emp.getName()+"| Punch In: "+emp.getPunchIn()+"| Punch Out: "+emp.getPunchOut()+"|");
		}*/
		
	}

}
