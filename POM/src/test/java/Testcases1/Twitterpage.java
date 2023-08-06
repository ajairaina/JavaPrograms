package Testcases1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Twitterpage {

	WebDriver driver;
	 public Twitterpage(WebDriver driver) {
		this.driver =driver;
	}
	
	
	 
	 public void verifylogin() throws InterruptedException {
		 
		 Thread.sleep(4000);
		 
		 String title = driver.getTitle();
		 Assert.assertEquals(title, "Log in to Twitter / Twitter");
	 }
			 
	 
	 
	 
	 
}
