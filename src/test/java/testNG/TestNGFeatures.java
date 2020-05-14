package testNG;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test(priority=1,groups="Title")
		public void googeTitleTest(){
			System.out.println("Google");
	}
	@Test
	public void loginTest(){
		System.out.println("login test");
	}
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest(){
		System.out.println("Home Page test");
	}
	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest(){
		System.out.println("Search Page test");
	}
	
	@Test(invocationTimeOut=2)
	public void infiniteloop(){
		int i=1;
		while(i==1){
			System.out.println(i);
		}
		}
		
	@Test(expectedExceptions=NumberFormatException.class)
	public void NumFormat(){
		String x="100A";
		Integer.parseInt(x);
	}
	

}
