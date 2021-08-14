package GitHub_RestAssured_Project;

import org.testng.annotations.BeforeClass;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//Add a @BeforeClass annotation method to set up the test. In the setup method, use RequestSpecBuilder() to create a request specification that has:
//Content type set to JSON
//A Authorization header that has the value “token <GitHub access token>”
//The base URL set to https://api.github.com

public class GitHub_RestAssuredProject {

	// Declare request specification
	RequestSpecification requestSpec;
	// Declare response specification
	ResponseSpecification responseSpec;

	String SSHKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCWXXAVH281VxabGxk8TeCbk6pn7q0/f19XMSf1xe+2XS6U37pOkjr+U3IcOQYOT+1EmeM1t58hUyOVTV09FI3cl8mbwZURzS2uJgGYG+DH0ahvDB72G2bPUPgbppuHn2HazqdgB9yuFg0k3IjiGQgs5WnudZxwjLLDniqaWsVsp81fIX/43BzOkt6P+MwTQ4GvjuTGtjtBw7TgRVPFNCPUwUvx7/47rSLvCo2UYvNYQwet0uvdMzg6+nF8dd6OEzYuO7P/pLuVldUOJM80/iN7O72v3yR7oLBeQ6vESXeRqtEGF42QP0liKKrp2mDV88ZRsXCRVjxgPkKewEgwIuS2DJZzsjgZEPDCuaOza0gcGuXSymLeVxkxS5ZQrbOQdEAjBa3rMTfR/bBqjgj4MSMkw/N4gDOPrCf0v6baO4BXulteB7mCkeUZktpdg4ttBcaRBQ9UHXyIJ3lPm/WtRe/uRF+cazOC47FrUlu6aJuAcpoaE3QhMFKuuaWrc5EIMi8=";
	int sshid;

	@BeforeClass
	public void setUp() {

		// Create request specification
		requestSpec = new RequestSpecBuilder().setContentType(ContentType.JSON) // Set content type
				.setBaseUri("https://api.github.com") // Set base URL
				.addHeader("Authorization", "token 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") // A Authorization header
																								// that has the value
																								// “token <GitHub access
																								// token>”
				.build(); // Build request specification
	}

	@Test(priority = 1)
	public void postRequest() {
		// for sending a POST request to add a SSH key to your account

		String reqBody = "{\"title\": \"TestAPIKey\",\"key\": \"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCWXXAVH281VxabGxk8TeCbk6pn7q0/f19XMSf1xe+2XS6U37pOkjr+U3IcOQYOT+1EmeM1t58hUyOVTV09FI3cl8mbwZURzS2uJgGYG+DH0ahvDB72G2bPUPgbppuHn2HazqdgB9yuFg0k3IjiGQgs5WnudZxwjLLDniqaWsVsp81fIX/43BzOkt6P+MwTQ4GvjuTGtjtBw7TgRVPFNCPUwUvx7/47rSLvCo2UYvNYQwet0uvdMzg6+nF8dd6OEzYuO7P/pLuVldUOJM80/iN7O72v3yR7oLBeQ6vESXeRqtEGF42QP0liKKrp2mDV88ZRsXCRVjxgPkKewEgwIuS2DJZzsjgZEPDCuaOza0gcGuXSymLeVxkxS5ZQrbOQdEAjBa3rMTfR/bBqjgj4MSMkw/N4gDOPrCf0v6baO4BXulteB7mCkeUZktpdg4ttBcaRBQ9UHXyIJ3lPm/WtRe/uRF+cazOC47FrUlu6aJuAcpoaE3QhMFKuuaWrc5EIMi8=\"}";

//    	Send the POST request to the URI resource /user/keys and save the response in a variable of type Response.
//    	From the response, extract the id of the SSH key that was just added and save it in the integer variable that was declared at the beginning.
//    	Add assertions to the test method to check if the test method passes or fails.
//    	The status code for a POST request to GitHub API is 201.

		Response response = given().spec(requestSpec).body(reqBody).when().post("/user/keys"); // send post request
		String resBody = response.getBody().asPrettyString();
		System.out.println("Response body is: " + resBody);
		
		sshid = response.then().extract().path("id");

		System.out.println("id is: " + sshid);

		// Assertions
		response.then().statusCode(201);

		System.out.println("Post method passed");

	}

	@Test(priority = 2)
	public void getRequest() {
		// for sending a GET request to get all the SSH keys attached to your account

//    	In this method, send a GET request to the URI resource /user/keys and save the response in a variable of type Response.
//    	Print the response to the console or to the TestNG report using Reporter.log().
//    	Add assertions to the test method to ensure that the test passes.
//    	The status code for a POST request to GitHub API is 200.
		Response response = given().spec(requestSpec)
							.get("/user/keys"); // send get request
		String getResponse = response.getBody().asPrettyString();

		response.then().statusCode(200).log().all();

		System.out.println("Get method passed" + getResponse);

	}

	@Test(priority = 3)
	public void deleteRequest() {
		// for sending a DELETE request to delete the key attached to your account.
//    	In this method, send a DELETE request to the URI resource /user/keys/{keyId} and save the response in a variable of type Response.
//    	Ensure to add a path parameter for keyId. The value of the path parameter is the integer value that was extracted in the POST request method.
//    	Print the response to the console or to the TestNG report using Reporter.log().
//    	Add assertions to the test method to ensure that the test passes.
//    	The status code for a DELETE request to GitHub API is 204.

		Response response = given().spec(requestSpec)
							.pathParam("keyId", sshid)
							.when().delete("/user/keys/{keyId}");
		
		String deleteResponse = response.getBody().asPrettyString();
		response.then().statusCode(204).log().all();
		
		System.out.println("Delete method passed"+ deleteResponse);

	}

}
