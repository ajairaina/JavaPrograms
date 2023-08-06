package Testscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testcases1.Googlesearchpage;
import Testcases1.Twitterpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testcases {

	WebDriver driver;
	Googlesearchpage objectrepo;
	
	@BeforeTest 
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		
	}
		
	@Test (priority = 0)
	public void Googlepage() {
		Googlesearchpage page = new Googlesearchpage(driver);
		page.searchpage("twitter");
	}
	
	@Test (priority = 1)
	public void twitterclick() {
		objectrepo  = new Googlesearchpage(driver);
		objectrepo.twitterclick();	
	}
	
	@Test (priority =2)
	public void twitterlogin() throws InterruptedException {
		Twitterpage TP = new Twitterpage(driver);
		TP.verifylogin();
	}
	
	
	
	@AfterTest
	public void aftertest() {
		driver.close();
	}
	
}
