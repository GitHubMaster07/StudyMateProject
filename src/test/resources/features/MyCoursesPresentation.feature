Feature: Teacher uploading presentation
  @addPresentation
  Scenario: Teacher unsuccessfully uploading presentation in material section
    Given I open the login page
    When I enter a valid username and password
    And I click the login button
    Then I should see the homepage
    And I click on course
    Then I click on lesson name
    And I click on presentation
    Then I click on Add presentation
    And I provide presentation name on the section
    Then I provide description on the section
    And I click on Review
    Then I click on file that chosen from computer
    And I click on Add
    Then it verifies my created presentation appears on the page