package com.stepdefination;

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
    String resGet = res.getBody().asString();
    System.out.println(resGet);
    
}

@Then("The Response Status code should be {int}")
public void the_response_status_code_should_be(int expectedHttpStsCode){
	
	int code = res.getStatusCode();
    System.out.println(code);
    
    Assert.assertEquals("verify http status code", expectedHttpStsCode, code);
}

@When("I send a post request to create response code for petstore endpoint")
public void i_send_a_post_request_to_create_response_code_for_petstore_endpoint(String expBody){
	RestAssured.baseURI = "https://petstore.swagger.io";
	post = RestAssured.given().header("Content-Type", "application/json").body(Payload.createPet()).when().log().all().post("/v2/swagger.json");
	
	 String bodyPost = post.getBody().asString();
	 Assert.assertEquals("True", expBody, bodyPost);
}

@Then("The Response Status code should be created with expected code {int}")
public void the_response_status_code_should_be_created_with_expected_code(int expectedHttpStsCode1){
	int code2 = post.getStatusCode();
    
    Assert.assertEquals("verify http status code", expectedHttpStsCode1, code2);
    
   
	
}

@When("I send a Put request to update code for petstore endpoint")
public void i_send_a_put_request_to_update_code_for_petstore_endpoint(String expBody1){
	RestAssured.baseURI = "https://petstore.swagger.io";
	put = RestAssured.given().header("Content-Type", "application/json").body(Payload.updatePet()).when().log().all().put("/v2/swagger.json");
    
	String body = put.getBody().asString();
	 Assert.assertEquals("True", expBody1, body);
}

@Then("The Response Status code should be updated with expected code {int}")
public void the_response_status_code_should_be_updated_with_expected_code(int expectedHttpStsCode2) {
	int code1 = put.getStatusCode();
	System.out.println(code1);
		
	Assert.assertEquals("verify http status code", expectedHttpStsCode2, code1);
	
}



@When("I send a Delete request to delete response code for petstore endpoint")
public void i_send_a_delete_request_to_delete_response_code_for_petstore_endpoint(){
	RestAssured.baseURI = "https://petstore.swagger.io";
	delete = RestAssured.given().header("Content-Type","application/json").when().log().all().delete("/v2/swagger.json");
	
	
}

@Then("The Response Status code should be deleted with expected code {int}")
public void the_response_status_code_should_be_deleted_with_expected_code(int expectedHttpStsCode3){
	int statusCode = delete.getStatusCode();
	
	 Assert.assertEquals("verify http status code", expectedHttpStsCode3, statusCode);

}

}
