package com.stepdefination;

import static org.testng.Assert.fail;

import org.junit.Assert;
import org.payload.Payload;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PetStore extends Payload {
	
	Response res;
	Response put;
	Response post;
	Response delete;
@When("I send a Get request to get response code for petstore endpoint")
public void i_send_a_get_request_to_get_response_code_for_petstore_endpoint() {
	RestAssured.baseURI = "https://petstore.swagger.io";
    res = RestAssured.given().header("Content-Type", "application/json").when().log().all().get("/v2/swagger.json");
    
}

@Then("The Response Status code should be {int}")
public void the_response_status_code_should_be(int expectedHttpStsCode) throws InterruptedException {
	Thread.sleep(3000);
	int code = res.getStatusCode();
    System.out.println(code);
    
    Assert.assertEquals("verify http status code", expectedHttpStsCode, code);
}

@When("I send a post request to create response code for petstore endpoint")
public void i_send_a_post_request_to_create_response_code_for_petstore_endpoint() throws InterruptedException {
	Thread.sleep(3000);
	RestAssured.baseURI = "https://petstore.swagger.io";
	post = RestAssured.given().header("Content-Type", "application/json").body(Payload.createPet()).when().log().all().post("/v2/swagger.json");
	
	
}

@Then("The Response Status code should be created with expected code {int}")
public void the_response_status_code_should_be_created_with_expected_code(int expectedHttpStsCode) throws InterruptedException {
	Thread.sleep(3000);
	int code2 = post.getStatusCode();
    System.out.println(code2);
    
    Assert.assertEquals("verify http status code", expectedHttpStsCode, code2);

}

@When("I send a Put request to update code for petstore endpoint")
public void i_send_a_put_request_to_update_code_for_petstore_endpoint() throws InterruptedException {
	Thread.sleep(3000);
	RestAssured.baseURI = "https://petstore.swagger.io";
	put = RestAssured.given().header("Content-Type", "application/json").body(Payload.updatePet()).when().log().all().put("/v2/swagger.json");
    
	
}

@Then("The Response Status code should be updated with expected code {int}")
public void the_response_status_code_should_be_updated_with_expected_code(int expectedHttpStsCode) {
	int code1 = put.getStatusCode();
	System.out.println(code1);
		
	String body = put.getBody().asString();
	System.out.println(body);
	
}



@When("I send a Delete request to delete response code for petstore endpoint")
public void i_send_a_delete_request_to_delete_response_code_for_petstore_endpoint() throws InterruptedException {
	Thread.sleep(3000);
	RestAssured.baseURI = "https://petstore.swagger.io";
	delete = RestAssured.given().header("Content-Type","application/json").when().log().all().delete("/v2/swagger.json");
	
	
}

@Then("The Response Status code should be deleted with expected code {int}")
public void the_response_status_code_should_be_deleted_with_expected_code(int expectedHttpStsCode) throws InterruptedException {
	Thread.sleep(3000);
	int statusCode = delete.getStatusCode();
	System.out.println(statusCode);
	
	 Assert.assertEquals("verify http status code", expectedHttpStsCode, statusCode);

}

}
