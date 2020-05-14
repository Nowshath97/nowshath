package Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

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


		/*System.setProperty("webdriver.chrome.driver", "C:/Users/Naushad/Desktop/Selenium/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("http://www.amazon.in");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().refresh();*/

	}

}
