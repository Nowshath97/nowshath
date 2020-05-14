package Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCrmTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Naushad/Desktop/Selenium/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.freecrm.com");
		
		driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("nowshathshaik@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Honey@786");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='item'][3]")).click();

	}

}
