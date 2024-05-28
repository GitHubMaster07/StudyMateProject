Feature: Trash Functionality
  @TrashClass
 Scenario: Move existing lesson to the trash
    Given user goes to "https://codewise.studymate.us"
    When user login as a teacher
    Then user sees part of course's name "Edited"
    And user clicks on this course
    And user sees lesson Test Trash
    And user clicks on trash bin
    Then user sees message "Are you sure you want to delete lesson Test Trash?"
    And user clicks on button "Delete"
    And user sees pop-up message "Lesson deleted successfully"




 