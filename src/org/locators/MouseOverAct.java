package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOverAct {
		
		public static void main(String[] args)throws InterruptedException  {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse\\InstallSelenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://mrbool.com/");
			WebElement mouseOverAction = driver.findElement(By.className("menulink"));
			Actions acc = new Actions(driver);
			acc.moveToElement(mouseOverAction).perform();
			Thread.sleep(6000);
			driver.quit();
			
	}

}
