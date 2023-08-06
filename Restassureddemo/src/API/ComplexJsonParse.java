package API;

import java.util.Iterator;

import files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		
		JsonPath js = new JsonPath(Payload.Courses());
		
		//Print No of courses returned by API
		int Coursesize = js.getInt("courses.size()");
		System.out.println("No of courses = " + Coursesize);
		
		//Print Purchase Amount
		int Totalamount = js.getInt("dashboard.purchaseAmount");
		System.out.println("Purchase Amount = " + Totalamount);
		
		//Print Title of the first course
		String title = js.get("courses[0].title");
		System.out.println("Title of the first course = " + title);
		
		//Print All course titles and their respective Prices
		for (int i=0; i<Coursesize; i++) {
			
			String Titless = js.get("courses["+i+"].title");
			System.out.println(js.get("courses["+i+"].price").toString());
			System.out.println(Titless);
		}
		
		//Print no of copies sold by RPA Course
			for (int i=0; i<Coursesize; i++) {
			String Titless = js.get("courses["+i+"].title");
			
			if (Titless.equals("RPA")) {
			int Rpa_copies=	js.get("courses["+i+"].copies");
			System.out.println("no of copies sold by RPA Course = " + Rpa_copies);
			break;
			}
		
		}
	}
}
