package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CoursePage;
import pages.LoginPage;
import utilities.Driver;

public class TrashSteps {
    LoginPage loginPage = new LoginPage();
    CoursePage coursePage = new CoursePage();
    @Given("user goes to {string}")
    public void user_goes_to(String string) {
        Driver.getDriver().get("https://codewise.studymate.us/login");
    }
    @When("user login as a teacher")
    public void user_login_as_a_teacher() {
    loginPage.usernameInput.sendKeys("annashanel1980@gmail.com");
    loginPage.passwordInput.sendKeys("11091980");
    loginPage.loginButton.click();
    }
    @Then("user sees part of course's name {string}")
    public void user_sees_part_of_course_s_name(String string) {
        String verify_course = "Edited course name";
        Assert.assertEquals("User sees course's name", coursePage.course.getText(), "Edited course name");
    }
    @Then("user clicks on this course")
    public void user_clicks_on_this_course() {
    coursePage.course.click();
    }
    @Then("user sees lesson Test Trash")
    public void user_sees_lesson_test_trash() {
    String verify_lesson = "Test Trash";
    Assert.assertEquals("User sees lesson Test Trash", verify_lesson, coursePage.lesson.getText());


    }
    @Then("user clicks on trash bin")
    public void user_clicks_on_trash_bin() {
        coursePage.trash_button.click();
    }
    @Then("user sees message {string}")
    public void user_sees_message(String string) {
    String verify_message = "Are you sure you want to delete lesson Test Trash ?" ;
    Assert.assertEquals("User sees message about deleting", verify_message, coursePage.trash_message.getText());

    }
    @Then("user clicks on button {string}")
    public void user_clicks_on_button(String string) {
    coursePage.delete_button.click();
    }
    @Then("user sees pop-up message {string}")
    public void user_sees_pop_up_message(String string) throws InterruptedException {
        Thread.sleep(3000);
    Assert.assertEquals("Delete message is existed", "Lesson successfully deleted", coursePage.delete_message.getText());
    }



}
