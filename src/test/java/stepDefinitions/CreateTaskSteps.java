package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateTaskPage;

public class CreateTaskSteps {

    CreateTaskPage createTaskPage = new CreateTaskPage();
    Faker faker = new Faker();



    @Then("I click on task tab")
    public void i_click_on_task_tab() {createTaskPage.taskTab.click();
    }

    @Then("I click on create task button")
    public void i_click_on_create_task_button() {createTaskPage.createTaskTab.click();
    }
    @Then("I provide task name")
    public void i_provide_task_name() {createTaskPage.taskName.sendKeys(faker.name().title());
    }
    @Then("I provide task description")
    public void i_provide_task_description() {createTaskPage.taskDescription.sendKeys(faker.programmingLanguage().name());
    }
    @Then("I click on calendar button")
    public void i_click_on_calendar_button() {
        createTaskPage.calendarButton.click();
    }
    @Then("I click deadline data")
    public void i_click_deadline_data() {
        createTaskPage.chooseDay.click();
    }

@Then("I push on create button")
    public void i_push_on_create_button() {createTaskPage.createButton.click();
    }
}










