package Testcases1;

import javax.print.DocFlavor.BYTE_ARRAY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Registrationpage {

	WebDriver driver;
	
	public Registrationpage (WebDriver driver) {
		this.driver=driver;
	}
	
	By click_reg = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
	By firstname = By.name("firstName");
	By lastname = By.name("lastName");
	By Phone = By.name("phone");
	By Email = By.id("userName");
	By address = By.name("address1");
	By city = By.name("city");
	By state = By.name("state");
	By postalcode = By.name("postalCode");
	By submit = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/"
			+ "tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input");
			


	public void registerform() {
	   driver.findElement(click_reg).click();
 }

	public void setfirstname(String Fname) {
		driver.findElement(firstname).sendKeys(Fname);
		;
	}

	public void setlastname(String Lname) {
		driver.findElement(lastname).sendKeys(Lname);
		;
	}

	public void setphone(String ph) {
		driver.findElement(Phone).sendKeys(ph);
	}

	public void setemail(String mail) {
		driver.findElement(Email).sendKeys(mail);
	}

	public void setaddress(String add) {
	   driver.findElement(address).sendKeys(add);
}
	public void setcity(String cy) {
		   driver.findElement(city).sendKeys(cy);
	}
	public void setstate(String st) {
		   driver.findElement(state).sendKeys(st);
	}
	public void setpostalcode(String pcode) {
		   driver.findElement(postalcode).sendKeys(pcode);
	}
	public void setsubmit() {
		   driver.findElement(submit).click();
	}
	
	public void verifythecase() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Register: Mercury Tours");
		System.out.println("title of the page =" + title);
	}
	
}