package StepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Opengoogle {

	WebDriver driver = null;
	WebElement element;
	
	
	@Given("user is on google page")
	public void user_is_on_google_page() {
	    
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
	}

	@When("user enter the search term raina")
	public void user_enter_the_search_term_raina() {
	 
		element = driver.findElement(By.name("q"));
		
	}

	@When("user enter the search button")
	public void user_enter_the_search_button() {
	    element.sendKeys("Raina" + Keys.ENTER);
	}

	@Then("user should see the search results")
	public void user_should_see_the_search_results() {
	  boolean status = driver.findElement(By.partialLinkText("Suresh Raina")).isDisplayed();
	  if (status==true) {
		System.out.println("Raina name is displayed");
	}else {
		System.out.println("Please check the search Term");
	}
	  driver.close();
	}
	
}
