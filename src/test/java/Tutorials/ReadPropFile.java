package Tutorials;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream("C:/Users/Naushad/workspace/SeleniumTutorials/src/Tutorials/config.properties");
	
		prop.load(ip);
		
		String browser = prop.getProperty("browser");
		
		System.setProperty("webdriver.chrome.driver", browser);
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		Actions act = new Actions(driver);
	
	}

}
