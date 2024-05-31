package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.MyCourseTestPage;

import java.util.List;

public class MyCourseTestSteps {
    MyCourseTestPage mycourseTestPage = new MyCourseTestPage();

    Faker faker = new Faker();

    @Given("I click on the course tab")
    public void i_Click_On_The_Course_Tab() {
        mycourseTestPage.courseClick.click();
    }

    @When("I click on the lesson name tab")
    public void i_Click_On_The_Lesson_NameTab() {
        mycourseTestPage.lessonNameClick.click();
    }

    @And("I click on the link tab")
    public void i_Click_On_The_LinkTab() {
        mycourseTestPage.test.click();
    }
        @Then("I click on create test")
        public void i_click_on_create_test () {
            mycourseTestPage.createTest.click();
        }

        @Then("I write the test name")
        public void i_write_the_test_name () {
            mycourseTestPage.testName.sendKeys(faker.name().title());
        }

        @Then("I write a question in question section")
        public void i_write_a_question_in_question_section () {
            mycourseTestPage.question.sendKeys(faker.name().title());
        }

        @Then("I click on save")
        public void i_click_on_save () {
            mycourseTestPage.saveButton.click();
        }

        @Then("it verifies my saved test appears on the page")
        public void it_verifies_my_saved_test_appears_on_the_page () {
            Assert.assertEquals(mycourseTestPage.verifyTest.getText(), mycourseTestPage.testName.getText());
        }

}
