package Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		DropDown dd = new DropDown();
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Naushad/Desktop/Selenium/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

		WebElement day = driver.findElement(By.id("day"));
		dd.SelectDropDown(day);
		
		WebElement month=driver.findElement(By.id("month"));
		dd.SelectDropDown(month);
		
		WebElement year = driver.findElement(By.id("year"));
		dd.SelectDropDown(year);
	}

	public void SelectDropDown(WebElement dropdown){
		Select select = new Select(dropdown);
		select.selectByIndex(4);
		
	}
}
