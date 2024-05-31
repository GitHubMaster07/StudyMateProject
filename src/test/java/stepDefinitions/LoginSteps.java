package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LoginPage;
import utilities.Driver;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("I open the login page")
    public void i_open_the_login_page() {
        Driver.getDriver().get("https://codewise.studymate.us/login");
    }

    @When("I enter a valid username and password")
    public void i_enter_a_valid_username_and_password() {
        loginPage.usernameInput.sendKeys("Emir_77777@mail.ru");
        loginPage.passwordInput.sendKeys("codewise123");
    }

    @And("I click the login button")
    public void i_click_the_login_button() {
        loginPage.loginButton.click();
    }

    @Then("I should see the homepage")
    public void i_should_see_the_homepage() {
        Assert.assertTrue(loginPage.homepageElement.isDisplayed());

    }
}
