package org.step;

import org.base.Payload;
import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDef extends Payload {

	Response res;
	Response put;
	Response post;
	Response delete;

	@When("I send a Get request to get response code for petstore endpoint")
	public void i_send_a_get_request_to_get_response_code_for_petstore_endpoint() {

		RestAssured.baseURI = "https://petstore.swagger.io";
		res = RestAssured.given().header("Content-Type", "application/json").when().log().all().get("/v2/swagger.json");

	}

	@Then("the response body should contains correct Response body")
	public void the_response_body_should_contains_correct_response_body() {

		String resGet = res.getBody().asString();
		System.out.println(resGet);
	}

	@Then("The Response Status code should be {int}")
	public void the_response_status_code_should_be(int expectedHttpStsCode) {

		int code = res.getStatusCode();
		System.out.println(code);
		Assert.assertEquals(expectedHttpStsCode, code);
	}

	@When("I send a post request to create response body for petstore endpoint")
	public void i_send_a_post_request_to_create_response_body_for_petstore_endpoint() {

		RestAssured.baseURI = "https://petstore.swagger.io";
		post = RestAssured.given().header("Content-Type", "application/json").body(Payload.createPet()).when().log()
				.all().post("/v2/swagger.json");

	}

	@Then("the response body should contains created Response body {string}\" \\{\"name\":\"bird\"} \"{string}")
	public void the_response_body_should_contains_created_response_body(String string, String expbody1)  {
		String bodyPost = post.getBody().asString();
		System.out.println(bodyPost);
		Assert.assertTrue(bodyPost.contains(expbody1));
	}

	@Then("The Response Status code should be created with expected code {int}")
	public void the_response_status_code_should_be_created_with_expected_code(int expectedHttpStsCode1) {

		int code1 = post.getStatusCode();
		System.out.println(code1);
		Assert.assertEquals(expectedHttpStsCode1, code1);
	}

	@When("I send a Put request to update response body for petstore endpoint")
	public void i_send_a_put_request_to_update_response_body_for_petstore_endpoint() {
		RestAssured.baseURI = "https://petstore.swagger.io";
		put = RestAssured.given().header("Content-Type", "application/json").body(Payload.updatePet()).when().log()
				.all().put("/v2/swagger.json");

	}

	@Then("the response body should contains updated Response body {string}\" \\{\"name\":\"puppy\"} \"{string}")
	public void the_response_body_should_contains_updated_response_body(String string, String expbody2) {
		String body = put.getBody().asString();
		System.out.println(body);
		Assert.assertTrue(body.contains(expbody2));
	}

	@Then("The Response Status code should be updated with expected code {int}")
	public void the_response_status_code_should_be_updated_with_expected_code(int expectedHttpStsCode2) {

		int code2 = put.getStatusCode();
		System.out.println(code2);
		Assert.assertEquals(expectedHttpStsCode2, code2);
	}

	@When("I send a Delete request to delete response code for petstore endpoint")
	public void i_send_a_delete_request_to_delete_response_code_for_petstore_endpoint() {

		RestAssured.baseURI = "https://petstore.swagger.io";
		delete = RestAssured.given().header("Content-Type", "application/json").when().log().all()
				.delete("/v2/swagger.json");
	}

	@Then("The Response Status code should be deleted with expected code {int}")
	public void the_response_status_code_should_be_deleted_with_expected_code(int expectedHttpStsCode3) {

		int code3 = delete.getStatusCode();
		System.out.println(code3);
		Assert.assertEquals(expectedHttpStsCode3, code3);
	}

}