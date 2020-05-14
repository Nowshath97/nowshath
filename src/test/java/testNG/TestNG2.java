package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUP(){
		System.setProperty("webdriver.chrome.driver", "C:/Users/Naushad/Desktop/Selenium/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}

	@Test(priority=1)
	public void googleTitleTest(){
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2)
	public void googleLogoTest(){
		boolean b = driver.findElement(By.className("RNmpXc")).isDisplayed();
		System.out.println(b);
	}
	
	@Test(priority=3)
	public void gmailTest(){
		WebElement mail = driver.findElement(By.linkText("Gmail"));
}
		@AfterMethod
		public void quit(){
			driver.quit();
	}
	}
