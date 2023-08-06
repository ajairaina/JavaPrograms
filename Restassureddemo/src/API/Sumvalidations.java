package API;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;

import org.testng.annotations.Test;

import files.Payload;
import io.restassured.path.json.JsonPath;

public class Sumvalidations {

	//Verify if Sum of all Course prices matches with Purchase Amount
	
	@Test
	public void Sumofcourses() {
		
		int sum=0;
		JsonPath js = new JsonPath(Payload.Courses());
		int count = js.get("courses.size()");
		for (int i=0; i<count; i++) {
			int price = js.getInt("courses["+i+"].price");
			int copies= js.getInt("courses["+i+"].copies");
			int TotalCourseAmount = price * copies;
			System.out.println(TotalCourseAmount);
			sum = sum + TotalCourseAmount;
			}
		    System.out.println("Total course fees = " + sum);
		    
		  int ps_amount =   js.getInt("dashboard.purchaseAmount");
		  assertEquals(sum, ps_amount);
	}
}
