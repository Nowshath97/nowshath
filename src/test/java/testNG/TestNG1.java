package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNG1 {

	@BeforeTest
	public void launchBrowser(){
		System.out.println("Launch the Browser");
	}
	
	@BeforeClass
	public void login(){
		System.out.println("Login to App");
	}
	
	@BeforeMethod
	public void enterURL(){
		System.out.println("Enter URL");
	}
	@Test
	public void googleTitleTest(){
		System.out.println("Google Title Test");
	}

	@AfterClass
	public void closeBrowser(){
		System.out.println("Close the browser");
	}

}
