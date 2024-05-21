Feature: Teacher uploading presentation
  @addPresentation
  Scenario: Teacher unsuccessfully uploading presentation in material section
    Given I open logged in a "page"
    When I navigate to My courses
    And I click on course
    Then I click on lesson name
    And I click on presentation
    Then I click on Add presentaion
    And I provide presentation "name" on the section
    Then I provide "description" on the section
    And I click on Review
    Then I click on file that choosen from computer
    And I click on Add
    Then I see message on the corner that "Unable to load credentials"