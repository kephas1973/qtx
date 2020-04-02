package APIHomework;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;

public class ApiHomework {
	
	@Test // TEST SUCCESSFUL
	public void getSingleUser() {

		//String url = new String("https://reqres.in/api/users?id=2");
		String url = new String("https://reqres.in/api/users/2");
		when()
		.get(url)
		.then()
		.assertThat()
		.body("data.email", equalTo("janet.weaver@reqres.in"));

	}
			
	@Test // TEST UNSUCCESSFUL
	public void postLogin() {
		// FAILED: Expected status code <200> but was <201>.
		//String url = new String("https://reqres.in/api/register/4");
		String url = new String("https://reqres.in/api/login/4");
		String userCredentials = new String("{\"email\": \"eve.holt@reqres.in\", \"password\": \"pistol\"}");
		byte[] byteArray = userCredentials.getBytes();

		given()
		//.contentType("application/userCredentials")
		//.body(userCredentials)
		.contentType("application/byteArray")
		.body(byteArray)
		.when()
		.post(url)
		.then()
		.statusCode(200) // expected status code 200 - request successful
		//.contentType("application/userCredentials")
		.contentType("application/byteArray")
		.body("token", equalTo("QpwL5tke4Pnpja7X4"));
	}
	
	@Test // TEST SUCCESSFUL
	public void deleteUser() {
		given()
		.when()
		.delete("https://reqres.in/api/users/6") // delete user at index 6
		.then()
		.statusCode(204);
		// HTTP Status 204 (No Content) indicates that
		// the server has successfully
		// fulfilled the request and that there is no
		// content to send in the response payload body.
	}
	
	@Test // TEST SUCCESSFUL - NEED TO VERIFY
	public void testPatch() {

		String usersName = new String("{\"name\": \"Morpheus2\", \"updatedAt\": \"2020-03-31T20:50:27.961Z\"}");
		byte[] byteArray = usersName.getBytes();
		System.out.println(byteArray);

		given()
		//.contentType("application/usersName")
		//.body(usersName)
		.contentType("application/byteArray")
		.body(byteArray)
		.when()
		.patch("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.body("name", equalTo("Morpheus2"))
		.body("updatedAt", equalTo("2020-03-31T20:50:27.961Z"));

		// QUESTIONABLE CODE HERE! HOW DO YOU ASSERT THAT THE CHANGE ACTAULLY TOOK PLACE?
		//when().get("https://reqres.in/api/users/2").then().assertThat().body("data.name", equalTo("Morpheus2"));
	}
	
	@Test // TEST UNSUCCESSFUL
	public void testPut() {
		
		String usersNameTimeStamp = new String("{\"name\": \"Morpheus2\", \"updatedAt\": \"2020-04-01T11:52:00.682Z\"}");
		byte[] byteArray = usersNameTimeStamp.getBytes();
		System.out.println(byteArray);

		given()
		.contentType("application/byteArray")
		.body(byteArray)
		.when()
		.put("/api/users/2")
		.then()
		.statusCode(200)
		//.contentType("application/byteArray")
		.body("name", equalTo("Morpheus2"))
		.body("updatedAt", equalTo("2020-04-01T11:52:00.682Z"));
		
	}

	@Test // TEST UNSUCCESSFUL
	public void getSingleUserDeserialize() {

		//String url = new String("https://reqres.in/api/users?id=2");
		String url = new String("https://reqres.in/api/users/2");
		String text = when()
		.get(url)
		.then()
//		.contentType("text/plain")
		.contentType("application/json")
		.toString();
		
		System.out.println("my test> " + text); // OUTPUT NOT WHAT I EXPECTED

	}
}