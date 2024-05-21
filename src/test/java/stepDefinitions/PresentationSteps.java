package stepDefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import pages.PresentationPage;
import utilities.Driver;

public class PresentationSteps {
    PresentationPage presentationPage = new PresentationPage();

    @Given("I open logged in a {page}")
    public void i_open_logged_in_a(String page) {

    }
    @When("I navigate to My courses")
    public void i_navigate_to_my_courses() {
      presentationPage.myCourses.click();
    }
    @When("I click on course")
    public void i_click_on_course() {
     presentationPage.course.click();
    }
    @Then("I click on lesson name")
    public void i_click_on_lesson_name() {
      presentationPage.lesson.click();
    }
    @Then("I click on presentation")
    public void i_click_on_presentation() {
       presentationPage.presentation.click();
    }
    @Then("I click on Add presentaion")
    public void i_click_on_add_presentaion() {
       presentationPage.addPresentation.click();
    }
    @Then("I provide presentation {string} on the section")
    public void i_provide_presentation_on_the_section(String name) {
        presentationPage.presentationName.sendKeys("materials");
    }
    @Then("I provide {string} on the section")
    public void i_provide_on_the_section(String description) {
        presentationPage.description.sendKeys("material description");
    }
    @Then("I click on Review")
    public void i_click_on_review() {
       presentationPage.review.click();
    }
    @Then("I click on file that choosen from computer")
    public void i_click_on_file_that_choosen_from_computer() {
        presentationPage.review.sendKeys("/Users/nomundari/Desktop/questions/Companies.pdf");
    }
    @Then("I click on Add")
    public void i_click_on_add() {
        presentationPage.add.click();
    }
    @Then("I see message on the corner that {string}")
    public void i_see_message_on_the_corner_that(String string) {
    }
}
