Feature: Login Functionality

  Scenario: Successful Login with valid credentials
    Given I open the login page
    When I enter a valid username and password
    And I click the login button
    Then I should see the homepage

