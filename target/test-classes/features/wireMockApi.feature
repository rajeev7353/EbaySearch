Feature: Testing Rest API
  @Wip
  Scenario:Send get request to a web service
    When user sends a get request to the given URI
    Then the status code should be 200
    And response playload matches the location- Lon, Man, Cam, LCS


    Scenario: Send post request to validate new item addition
      When the user sends a POST request to post
      Then response should return all the items
