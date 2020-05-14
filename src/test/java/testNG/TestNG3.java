package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestNG3 {
	
	WebDriver driver;
	@BeforeMethod
	public void setup(){

	System.setProperty("webdriver.chrome.driver", "C:/Users/Naushad/Desktop/Selenium/Driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
	}
	
	@SuppressWarnings("deprecation")
	@Test(groups="Title")
	public void googleTitletest(){
	
	String title = driver.getTitle();
	
	Assert.assertEquals("Google", title);
	
	}
	
	@Test(groups="Gmail Link")
	public void gmaillink(){
	boolean b = driver.findElement(By.linkText("mail")).isDisplayed();
	Assert.assertTrue(b);
	}
	
	@Test(groups="Google HomePage Link")
	public void googlesublink(){
	WebElement link = driver.findElement(By.className("RNmpXc"));
	Assert.assertEquals("I'm Feeling Lucky", link.getText());
	}
	
	@AfterMethod
	public void quit(){
	driver.quit();
	}
}
