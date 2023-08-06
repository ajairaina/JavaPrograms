package API;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import files.Payload;
public class Extractjsonresponse {

	public static void main(String[] args) {
		
		RestAssured.baseURI =  "https://rahulshettyacademy.com";
		
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.Addplace()).when().post("/maps/api/place/add/json").then().assertThat().statusCode(200)
		.body("scope", equalTo ("APP")).header("Server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		
		JsonPath js = new JsonPath(response); // for parsing json respnse
		String place_id = js.getString("place_id");
		System.out.println(place_id);
		
		
		//update place
		String Updated_Address = "70 winter walk, USA";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+ place_id +"\",\r\n"
				+ "\"address\":\"" + Updated_Address +"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}").when().put("maps/api/place/update/json").then().assertThat().log().all().statusCode(200).
		body("msg",equalTo( "Address successfully updated"));
		
		
		//getplace
		
		String getplaceresponse= given().log().all().queryParam("key", "qaclick123").queryParam("place_id", place_id)
		.when().get("maps/api/place/get/json").then().assertThat().log().all().extract().response().asString();
		System.out.println(getplaceresponse);
		
		JsonPath js1 = new JsonPath(getplaceresponse);
		String Actual_address = js1.getString("address");
		System.out.println(Actual_address);
	    assertEquals(Actual_address, Updated_Address);
	}
}
