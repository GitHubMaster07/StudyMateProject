Feature: Create Task Functionality

  Scenario: Successful create a task
    Given I open the login page
    When I enter a valid username and password
    And I click the login button
    Then I should see the homepage
    And I click on the course tab
    When I click on the lesson name tab
    Then I click on task tab
    And I click on create task button
    And I provide task name
    And I provide task description
    And I click on calendar button
    And I push on create button