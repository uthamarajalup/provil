Feature: Testing the API endpoint with RestAssured

Scenario: Verify & Find the pet id
When I send a Get request to get response code for petstore endpoint
Then The Response Status code should be 200

Scenario: Update the pet id & Name
When I send a Put request to update code for petstore endpoint
Then The Response Status code should be updated

Scenario: Create a new response code 
When I send a post request to create response code for petstore endpoint
Then The Response Status code should be created

Scenario: Remove the response code
When I send a Delete request to delete response code for petstore endpoint
Then The Response Status code should be deleted
