package Tutorials;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotConcept {

	public static void main(String[] args) throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Naushad/Desktop/Selenium/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		//Take screenshot and store as a file format
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//now copy the screenshot to desired location using copyfile//method
		
		//FileUtils.copyFile(src, new File("C:/Users/Naushad/workspace/SeleniumTutorials/src/Tutorials/google.jpg"));
	}

}
