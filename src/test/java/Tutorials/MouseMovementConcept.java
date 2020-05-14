package Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Naushad/Desktop/Selenium/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tspsc.gov.in/index.jsp");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		//WebElement addon = driver.findElement(By.xpath("//a[@id='highlight-addons']"));
		WebElement login = driver.findElement(By.linkText("Organization"));
		action.moveToElement(login).build().perform();
		
	

	}

}
