package API;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import files.Payload;
import io.restassured.RestAssured;

public class Validations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.Addplace()).when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
		.body("scope", equalTo ("APP")).header("Server", "Apache/2.4.41 (Ubuntu)");
		
		//add place / update new place / get place to validate if new place is added in the response 
		
		
		
		
	}



	}


