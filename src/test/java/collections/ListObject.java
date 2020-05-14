package collections;

import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.Comparator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ListObject  {
	
	public static void main(String[] args) throws Exception{
	FileInputStream file = new FileInputStream("C:/Users/Naushad/Desktop/Tutorial Videos/Selenium/ExcelData/TestData.xlsx");
	
	XSSFWorkbook wb = new XSSFWorkbook(file);
	XSSFSheet sheet = wb.getSheet("Testdata");
	
	ArrayList<Employee> empdata = new ArrayList<Employee>();
	
	
	for(int i=sheet.getFirstRowNum()+1;i<=sheet.getLastRowNum();i++){
		Employee e = new Employee();
		Row ro = sheet.getRow(i);
		for(int j=ro.getFirstCellNum();j<=ro.getLastCellNum();j++){
			Cell ce = ro.getCell(j);
			
			if(j==0){
				e.setEmpId((int) ce.getNumericCellValue());
			}
			if(j==1){
				e.setName(ce.getStringCellValue());
			}
			if(j==2){
				e.setpunchin(ce.getStringCellValue());
			}
			if(j==3){
				e.setpunchout(ce.getStringCellValue());
			}

		}
		
		empdata.add(e);
	}
	Comparator<Employee> c = (s1, s2) -> (s1.getName().compareTo(s2.getName()));
	empdata.sort(c);
	
	
	for(Employee emp: empdata){
		System.out.println("|ID: "+emp.getEmpId() +"| Name: "+emp.getName()+"| Punch In: "+emp.getPunchIn()+"| Punch Out: "+emp.getPunchOut()+"|");
	}
	
	file.close();
}

}