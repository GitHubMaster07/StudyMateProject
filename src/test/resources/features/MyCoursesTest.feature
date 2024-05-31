Feature: Teacher creating a test
  Scenario: Creating a test successfully
    Given I open the login page
    When I enter a valid username and password
    And I click the login button
    Then I should see the homepage
    And I click on course
    Then I click on lesson name
    And I click on create test
    Then I write the test name
    And I write a question in question section
    Then I click on save
    And it verifies my saved test appears on the page