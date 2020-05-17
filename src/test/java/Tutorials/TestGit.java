package Tutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Naushad/Desktop/Tutorial Videos/Jars and Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		

	}

}
