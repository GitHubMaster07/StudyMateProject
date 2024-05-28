package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CoursePage {
    public CoursePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(text(),\"Edited course name\")]")
    public WebElement course;

    @FindBy(xpath = "//p[contains(text(),'Test Trash')]")
    public WebElement lesson;

    @FindBy(xpath = "//p[contains(text(),'Test Trash')]//following::button[@type='button'][2]")
    public WebElement trash_button;

    @FindBy(xpath = "//p[contains(text(),'Are you sure you want to delete lesson Test Trash ?')]")
    public WebElement trash_message;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    public WebElement delete_button;

    @FindBy(xpath = "//p[text() ='Lesson successfully deleted']")
    public WebElement delete_message;

    @FindBy(linkText = "Trash")
    public WebElement sidebar_trash;

    @FindBy(xpath = "//p[contains(text(),'Items in the cart are automatically deleted after 7 days from the date of adding!')]")
    public WebElement trash_message2;
}
