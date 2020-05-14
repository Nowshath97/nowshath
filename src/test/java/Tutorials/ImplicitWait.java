package Tutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Naushad/Desktop/Selenium/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.half.ebay.com");
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}
