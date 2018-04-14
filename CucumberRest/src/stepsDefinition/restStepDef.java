package stepsDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class restStepDef {
	public static WebDriver driver;
	
	@Given("^I invoke the REST request and veriy the email address$")
	public void I_invoke_the_REST_request_and_veriy_the_email_address() throws Throwable {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();

		// Make a GET request call directly by using RequestSpecification.get() method.
		// Make sure you specify the resource name.
		Response response = httpRequest.get("/comments/1");

		// Response.asString method will directly return the content of the body
		// as String.
		System.out.println("Response Body is =>  " + response.asString());
		@SuppressWarnings("rawtypes")
		ResponseBody body = response.getBody();
		String bodyAsString = body.asString();
		Assert.assertEquals(bodyAsString.contains("Eliseo@gardner.biz") /*Expected value*/, true /*Actual Value*/, "Response body contains Eliseo@gardner.biz");

		}
	
	@Given("^I invoke the REST request and verify the number of users in response$")
	public void I_invoke_the_REST_request_and_verify_the_number_of_users_in_response() throws Throwable {
			
		// Specify the base URL to the RESTful web service
				RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

				// Get the RequestSpecification of the request that you want to sent
				// to the server. The server is specified by the BaseURI that we have
				// specified in the above step.
				RequestSpecification httpRequest = RestAssured.given();

				// Make a GET request call directly by using RequestSpecification.get() method.
				// Make sure you specify the resource name.
				Response response = httpRequest.get("/users");

				// Response.asString method will directly return the content of the body
				// as String.
				System.out.println("Response Body is =>  " + response.asString());
				@SuppressWarnings("rawtypes")
				ResponseBody body = response.getBody();
				String bodyAsString = body.asString();
				System.out.println("responsecheck"+bodyAsString);
				Assert.assertSame(bodyAsString.contains("Bret") /*Expected value*/, true /*Actual Value*/, "Response body contains Bret");
				Assert.assertSame(bodyAsString.contains("Ervin Howell") /*Expected value*/, true /*Actual Value*/, "Response body contains Ervin Howell");
				Assert.assertSame(bodyAsString.contains("Clementine Bauch") /*Expected value*/, true /*Actual Value*/, "Response body contains Clementine Bauch");
				Assert.assertSame(bodyAsString.contains("Patricia Lebsack") /*Expected value*/, true /*Actual Value*/, "Response body contains Patricia Lebsack");
				Assert.assertSame(bodyAsString.contains("Chelsey Dietrich") /*Expected value*/, true /*Actual Value*/, "Response body contains Chelsey Dietrich");
				Assert.assertSame(bodyAsString.contains("Mrs. Dennis Schulist") /*Expected value*/, true /*Actual Value*/, "Response body contains Mrs. Dennis Schulist");
				Assert.assertSame(bodyAsString.contains("Kurtis Weissnat") /*Expected value*/, true /*Actual Value*/, "Response body contains Kurtis Weissnat");
				Assert.assertSame(bodyAsString.contains("Nicholas Runolfsdottir V") /*Expected value*/, true /*Actual Value*/, "Response body contains Nicholas Runolfsdottir V");
				Assert.assertSame(bodyAsString.contains("Glenna Reichert") /*Expected value*/, true /*Actual Value*/, "Response body contains Glenna Reichert");
				Assert.assertSame(bodyAsString.contains("Clementina DuBuque") /*Expected value*/, true /*Actual Value*/, "Response body contains Clementina DuBuque");
				

		
	}
}