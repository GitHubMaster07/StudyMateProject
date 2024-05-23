package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CreateLinkPage;

import static utilities.Driver.*;

public class CreateLinkSteps {

    CreateLinkPage createLinkPage = new CreateLinkPage();
    Faker faker = new Faker();

    @Given("I click on the course tab")
    public void iClickOnTheCourseTab() {
        createLinkPage.courseTabClick.click();
    }

    @When("I click on the lesson name tab")
    public void iClickOnTheLessonNameTab() {
        createLinkPage.lessonNameTabClick.click();
    }

    @And("I click on the link tab")
    public void iClickOnTheLinkTab() {
        createLinkPage.linkTabClick.click();
    }

    @And("I click on the Add link button")
    public void iClickOnTheAddLinkButton() {
        createLinkPage.addLinkButtonClick.click();
    }

    @Then("I add some display text")
    public void iAddSomeDisplayText() {
        String randomDisplayText = faker.lorem().sentence();
        createLinkPage.addSomeDisplayText.sendKeys(randomDisplayText);
    }

    @And("I add some valid link")
    public void iAddSomeValidLink() {
        String randomLink = "https://" + faker.internet().domainName();
        createLinkPage.addSomeValidLink.sendKeys(randomLink);
    }

    @Then("I click on the Add button")
    public void iClickOnTheAddButton() {
        createLinkPage.addButtonClick.click();
    }

    @And("I should see the message Link successfully saved")
    public void iShouldSeeTheMessageLinkSuccessfullySaved() {
        Assert.assertTrue(createLinkPage.message.isDisplayed());
        Assert.assertEquals("Link successfully saved", createLinkPage.message.getText());
    }

}
