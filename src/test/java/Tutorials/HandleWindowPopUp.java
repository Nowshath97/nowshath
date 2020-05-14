package Tutorials;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Naushad/workspace/Jars/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='blu']")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent window id: " +parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Parent window id: " +childWindowId);
		
		System.out.println("Child window popup title" +driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("Parent WindowId: "+driver.getTitle());
		
		

	}

}
