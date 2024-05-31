package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.PresentationPage;
import utilities.Driver;

public class PresentationSteps {
    PresentationPage presentationPage = new PresentationPage();

    Faker faker = new Faker();
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
    @Then("I click on Add presentation")
    public void i_click_on_add_presentation() {
       presentationPage.addPresentation.click();
    }
    @Then("I provide presentation on the section")
    public void i_provide_presentation_on_the_section() {
        presentationPage.presentationName.sendKeys(faker.name().title());
    }
    @Then("I provide on the section")
    public void i_provide_on_the_section() {
        presentationPage.description.sendKeys(faker.name().title());
    }
    @Then("I click on Review")
    public void i_click_on_review() {
       presentationPage.review.click();
    }
    @Then("I click on file that chosen from computer")
    public void i_click_on_file_that_chosen_from_computer() {
        presentationPage.review.sendKeys("/Users/nomundari/Desktop/questions/Companies.pdf");
    }
    @Then("I click on Add")
    public void i_click_on_add() {
        presentationPage.add.click();
    }
    @Then("it verifies my created presentation appears on the page")
    public void it_verifies_my_created_presentation_appears_on_the_page() {
        Assert.assertEquals(presentationPage.verifyPresentation.getText(),presentationPage.description.getText());
    }
}
