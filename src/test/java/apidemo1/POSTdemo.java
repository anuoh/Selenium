package apidemo1;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
//import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.*;

import io.restassured.RestAssured;

import static io.restassured.matcher.RestAssuredMatchers.*;


public class POSTdemo {
	
	public void testpost() {
HashMap<String, String> hm= new HashMap<String, String>();
hm.put("name", "anu");
hm.put("job", "qa");
	
		given()
		  .contentType("application/json")
		  .body(hm)
		  
	.when()
		   .post("https://reqres.in/api/users")
	.then()   
		   .statusCode(201)
		    .log().all();
		  	
}

	
}