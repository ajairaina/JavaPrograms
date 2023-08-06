package logintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class correctusername {

	@Test
	public void loginwithcorrectusername() {
		
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\DELL\\eclipse-workspace\\Projectajai\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("nji");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();
	}
}
