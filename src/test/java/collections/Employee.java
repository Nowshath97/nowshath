package collections;

import org.apache.poi.hpsf.Date;
import org.apache.poi.hwpf.usermodel.DateAndTime;

public class Employee  {
	
	String EmpId;
	String name;
	String punchin;
	String punchout;
	
	public Employee(){}
	public Employee(String empid, String name, String punchin, String punchout){
		super();
		this.EmpId = empid;
		this.name = name;
		this.punchin = punchin;
		this.punchout = punchout;
	}
	
	public String getEmpId(){
		return EmpId;
	}

	public void setEmpId(String string){
		this.EmpId=string;
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getPunchIn(){
		return punchin;
	}
	
	public void setpunchin(String punchin){
		this.punchin = punchin;
	}
	public String getPunchOut(){
		return punchout;
	}
	
	public void setpunchout(String punchout){
		this.punchout = punchout;
	}
	
}
