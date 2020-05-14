package Tutorials;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Naushad/Desktop/Selenium/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com");
		driver.findElement(By.className("signin")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("proceed")).click();
		Alert popup = driver.switchTo().alert();
		String popuptext = popup.getText();
		popup.accept();
		
		if(popuptext.equals("Please enter a valid user name")){
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
	}

}
