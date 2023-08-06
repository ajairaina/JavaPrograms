package logintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bothincorrect {

	@Test
	public void loginbothincorrect() {
		
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\DELL\\eclipse-workspace\\Projectajai\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin1");
		driver.findElement(By.id("txtPassword")).sendKeys("admin1");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();
	}
}
