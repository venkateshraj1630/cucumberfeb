package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse\\InstallSelenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//WebElement txtusrname = driver.findElement(By.id("email"));
		//txtusrname.sendKeys("7904143545");
		//WebElement txtpassword = driver.findElement(By.id("pass"));
		//txtpassword.sendKeys("hanikuttyma");
		//WebElement btnLogin = driver.findElement(By.name("login"));
		//btnLogin.click();
		
		WebElement txtusrname = driver.findElement(By.xpath("//input[@name ='email']"));
		txtusrname.sendKeys("7904143545");
		WebElement txtpassword = driver.findElement(By.xpath("//input[@name ='pass']"));
		txtpassword.sendKeys("english");
		WebElement btnLogin = driver.findElement(By.xpath("//button[@name ='login']"));
		btnLogin.click();
		String attribute = txtusrname.getAttribute("7904143545");
		System.out.println(attribute);
		
		
		
		
		
		
	}

}
