package com.stepdefination;

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
	public void i_send_a_Get_request_to_get_response_code_for_petstore_endpoint() {
	    
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
	    res = RestAssured.given().header("Content-Type", "application/json").when().get("/swagger.json");
	    
	    
	}

	@Then("The Response Status code should be {int}")
	public void the_Response_Status_code_should_be(Integer int1) throws InterruptedException {
		Thread.sleep(3000);
		int code = res.getStatusCode();
	    System.out.println(code);
	}

	@When("I send a Put request to update code for petstore endpoint")
	public void i_send_a_Put_request_to_update_code_for_petstore_endpoint() throws InterruptedException {
		Thread.sleep(3000);
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		put = RestAssured.given().header("Content-Type", "application/json").body(Payload.updatePet()).when().put("/swagger.json");
	    
	}
	@Then("The Response Status code should be updated")
	public void the_Response_Status_code_should_be_updated() {
		int code1 = put.getStatusCode();
		System.out.println(code1);
			
		String body = put.getBody().asString();
		System.out.println(body);
		
	}

	@When("I send a post request to create response code for petstore endpoint")
	public void i_send_a_post_request_to_create_response_code_for_petstore_endpoint() throws InterruptedException {
		Thread.sleep(3000);
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		post = RestAssured.given().header("Content-Type", "application/json").body(Payload.createPet()).when().post("/swagger.json");
		
	}
	@Then("The Response Status code should be created")
	public void the_Response_Status_code_should_be_created() throws InterruptedException {
		Thread.sleep(3000);
		int code2 = post.getStatusCode();
	    System.out.println(code2);
	    
	    String body1 = post.getBody().asString();
	    System.out.println(body1);
	}


	@When("I send a Delete request to delete response code for petstore endpoint")
	public void i_send_a_Delete_request_to_delete_response_code_for_petstore_endpoint() throws InterruptedException {
		Thread.sleep(3000);
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		delete = RestAssured.given().header("Content-Type","application/json").when().delete("/swagger.json");
		
	}
	@Then("The Response Status code should be deleted")
	public void the_Response_Status_code_should_be_deleted() throws InterruptedException {
		Thread.sleep(3000);
		int statusCode = delete.getStatusCode();
		System.out.println(statusCode);
	}
}
