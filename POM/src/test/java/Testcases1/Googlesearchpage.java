package Testcases1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Googlesearchpage {

	WebDriver driver;

	public Googlesearchpage(WebDriver driver) {
		this.driver = driver;

	}

	By searchbox = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input");
	By searchbtn = By.xpath("(//*[@class=\"gNO89b\"])[1]");
	By clicktwitter = By.xpath("(//*[text()=\"Log in to Twitter\"])");

	public void searchpage(String searchinput) {

		try {
			driver.findElement(searchbox).sendKeys(searchinput);
			driver.findElement(searchbtn).click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
		
	}
	
	public void twitterclick() {
		
		try {
			driver.findElement(clicktwitter).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	
}