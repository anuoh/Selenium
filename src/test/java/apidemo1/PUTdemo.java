package apidemo1;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;
public class PUTdemo {
	HashMap<String, String> hm= new HashMap<String, String>();
	@BeforeMethod
public void createPayload() {	
		hm.put("name","anu");
		hm.put("email","anupam10feb@gmail.com");
		hm.put("gender","female");
		hm.put("status", "active");
		RestAssured.baseURI="https://gorest.co.in";
		RestAssured.basePath=" /public/v2/users/.....";
		
}
	
	@Test
	public void updateResource() {
RestAssured
.given()
			.contentType("application/json")
			    .body(hm)	    
			    .header("Autorization, Bearer a6051b65aa55628bd170fe22f6a0dc950c3c378e9874da2ce34d618154e25101");
			   
 .when()
			    .put()
.then()		    
      .statusCode(200)
.and()
      .body("name", is("anupambha"))
.log().all();
}
}