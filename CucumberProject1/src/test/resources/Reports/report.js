$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Task.feature");
formatter.feature({
  "name": "Testing the API endpoint with RestAssured",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify \u0026 Find the pet id",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I send a Get request to get response code for petstore endpoint",
  "keyword": "When "
});
formatter.match({
  "location": "PetStore.i_send_a_Get_request_to_get_response_code_for_petstore_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Response Status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "PetStore.the_Response_Status_code_should_be(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Update the pet id \u0026 Name",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I send a Put request to update code for petstore endpoint",
  "keyword": "When "
});
formatter.match({
  "location": "PetStore.i_send_a_Put_request_to_update_code_for_petstore_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Response Status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "PetStore.the_Response_Status_code_should_be(Integer)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.stepdefination.PetStore.the_Response_Status_code_should_be(PetStore.java:24)\r\n\tat ✽.The Response Status code should be 200(file:src/test/resources/Features/Task.feature:9)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Create a new response code",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I send a post request to create response code for petstore endpoint",
  "keyword": "When "
});
formatter.match({
  "location": "PetStore.i_send_a_post_request_to_create_response_code_for_petstore_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Response Status code should be 201",
  "keyword": "Then "
});
formatter.match({
  "location": "PetStore.the_Response_Status_code_should_be(Integer)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.stepdefination.PetStore.the_Response_Status_code_should_be(PetStore.java:24)\r\n\tat ✽.The Response Status code should be 201(file:src/test/resources/Features/Task.feature:13)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Remove the response code",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I send a Delete request to delete response code for petstore endpoint",
  "keyword": "When "
});
formatter.match({
  "location": "PetStore.i_send_a_Delete_request_to_delete_response_code_for_petstore_endpoint()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Response Status code should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "PetStore.the_Response_Status_code_should_be(Integer)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.stepdefination.PetStore.the_Response_Status_code_should_be(PetStore.java:24)\r\n\tat ✽.The Response Status code should be 200(file:src/test/resources/Features/Task.feature:17)\r\n",
  "status": "failed"
});
});