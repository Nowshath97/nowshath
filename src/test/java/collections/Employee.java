package collections;

import org.apache.poi.hpsf.Date;
import org.apache.poi.hwpf.usermodel.DateAndTime;

public class Employee  {
	
	int EmpId;
	String name;
	String punchin;
	String punchout;
	
	public Employee(){}
	public Employee(int empid, String name, String punchin, String punchout){
		super();
		this.EmpId = empid;
		this.name = name;
		this.punchin = punchin;
		this.punchout = punchout;
	}
	
	public int getEmpId(){
		return EmpId;
	}

	public void setEmpId(int empid){
		this.EmpId=empid;
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
