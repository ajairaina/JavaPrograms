package StepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Orangehrmlogin {

	WebDriver driver = null;
	
	@Given("user is on the orangehrm login page")
	public void user_is_on_the_orangehrm_login_page() {
	    
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	}

	@And("user click login button")
	public void user_click_login_button() {
	   
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@Then("user navigate to orangehrm home page")
	public void user_navigate_to_orangehrm_home_page() {
	   boolean status= driver.findElement(By.partialLinkText("Quick Launch")).isDisplayed();
	   if (status==true) {
		System.out.println("Home page is dispalyed");
	}else {
		System.out.println("Please check the errors");
	}
	}
}
