package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AnnouncementPage;

public class AnnouncementSteps {
    AnnouncementPage announcementPage = new AnnouncementPage();
    Faker faker = new Faker();

    @Then("I click on announcements")
    public void i_click_on_announcements() {
        announcementPage.announcements.click();
    }
    @Then("I click on add on announcement")
    public void i_click_on_add_on_announcement() {
        announcementPage.addAnnouncement.click();
    }
    @Then("I provide title of announcement")
    public void i_provide_title_of_announcement() {
        announcementPage.titleAnnouncement.sendKeys(faker.name().title());
    }
    @Then("I click on dropdown menu")
    public void i_click_on_dropdown_menu() {
        announcementPage.dropdown.click();
    }
    @Then("I choose a group")
    public void i_choose_a_group() {
        announcementPage.choosingGroup.click();
    }
    @Then("I click on add")
    public void i_click_on_add() {
        announcementPage.addButton.click();
    }
    @Then("it verifies my saved announcement appears on the page")
    public void it_verifies_my_saved_announcement_appears_on_the_page() {
        Assert.assertEquals(announcementPage.verifyAnn.getText(),announcementPage.titleAnnouncement.getText());
    }


}
