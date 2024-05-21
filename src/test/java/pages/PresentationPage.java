package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PresentationPage {
    public PresentationPage() {
        PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(css = "a[href='/instructor/courses']")
    public WebElement myCourses;
    @FindBy(className = "sc-hlzHbZ exYlyu")
    public WebElement course;
    @FindBy(xpath = "//p[text()='Unit Test Group#2']")
    public WebElement lesson;
    @FindBy(css = "a[href='/instructor/courses/5/materials/6/presentation']")
    public WebElement presentation;
    @FindBy(className = "MuiButton-startIcon MuiButton-iconSizeMedium css-6xugel")
    public WebElement addPresentation;
    @FindBy(id = ":r24:-label")
    public WebElement presentationName;
    @FindBy (xpath = "//input[@id=':r25:']")
    public WebElement description;
    @FindBy (xpath = "//button[text()='Review...']")
    public WebElement review;
    @FindBy (css = "button[type='submit']")
    public WebElement add;

}
