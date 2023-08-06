package Testscenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Testcases1.Googlesearchpage;
import Testcases1.Registrationpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterTest {

	WebDriver driver;
	
	@BeforeTest 
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
	}
	
	@Test
	public void reg_process() {
		Registrationpage rp = new Registrationpage(driver);
				rp.registerform();
		rp.setfirstname("ajai");
		rp.setlastname("raina");
		rp.setphone("123654");
		rp.setemail("www.ggooj.com");
		rp.setaddress("abc street");
		rp.setcity("chennai");
		rp.setstate("Tn");
		rp.setpostalcode("600024");
		rp.setsubmit();
		rp.verifythecase();
	}
	
	
	

	@AfterTest
	public void afterrtest() {
		driver.close();
	}
	
	
	}
	
