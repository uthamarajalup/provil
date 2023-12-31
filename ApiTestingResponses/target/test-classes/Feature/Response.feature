Feature: Testing the API endpoint with RestAssured

  Scenario: Verify & Find the pet id
    When I send a Get request to get response code for petstore endpoint
    Then the response body should contains correct Response body
    And The Response Status code should be 200

  Scenario: Create a new response code
    When I send a post request to create response body for petstore endpoint
    Then the response body should contains created Response body """ {"name":"bird"} """
    And The Response Status code should be created with expected code 405

  Scenario: Update the pet id & Name
    When I send a Put request to update response body for petstore endpoint
    Then the response body should contains updated Response body """ {"name":"puppy"} """
    And The Response Status code should be updated with expected code 405

  Scenario: Remove the response code
    When I send a Delete request to delete response code for petstore endpoint
    Then The Response Status code should be deleted with expected code 405
