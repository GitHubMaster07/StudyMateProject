Feature: Create Link Functionality

  Scenario: Successful create a link to the video file
    Given I open the login page
    When I enter a valid username and password
    And I click the login button
    Then I should see the homepage
    And I click on the course tab
    When I click on the lesson name tab
    And I click on the link tab
    And I click on the Add link button
    Then I add some display text
    And I add some valid link
    Then I click on the Add button
    And I should see the message Link successfully saved