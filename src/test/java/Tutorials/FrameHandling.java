package Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Naushad/workspace/Jars/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("Test");
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		String handle = driver.getWindowHandle();
		System.out.println(handle);
	}

}
