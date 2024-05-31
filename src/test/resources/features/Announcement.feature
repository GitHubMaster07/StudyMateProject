Feature: Teacher creating a announcement
  Scenario: Creating a announcement successfully
    Given I open the login page
    When I enter a valid username and password
    And I click the login button
    Then I should see the homepage
    And I click on announcements
    Then I click on add on announcement
    And I provide title of announcement
    Then I click on dropdown menu
    Then I choose a group
    And I click on add
    And it verifies my saved announcement appears on the page