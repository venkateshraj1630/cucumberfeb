package org.locators;

	import org.openqa.selenium.By;
    import org.openqa.selenium.By.ByXPath;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Facebook {

		public static void main(String[] args)throws InterruptedException  {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse\\InstallSelenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement txtusrname = driver.findElement(By.id("email"));
			txtusrname.sendKeys("7904143545");
			WebElement txtpassword = driver.findElement(By.id("pass"));
			txtpassword.sendKeys("hanikuttyma");
			Thread.sleep(2000);
			WebElement btnLogin = driver.findElement(By.xpath("//button[@value='1']"));
			btnLogin.click();
			
		}
	}

	
