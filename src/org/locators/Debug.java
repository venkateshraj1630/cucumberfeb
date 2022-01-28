package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse\\InstallSelenium\\driver\\chromedriver.exe");
		
	  WebDriver	driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	   WebElement btnCreateNewAct = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	   btnCreateNewAct.click();
	   Thread.sleep(900);
	   WebElement txtFirstName = driver.findElement(By.name("firstname"));
	   txtFirstName.sendKeys("karthik");
	   
	}

}
