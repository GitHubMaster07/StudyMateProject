package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateLinkPage {

    public CreateLinkPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='MuiTypography-root MuiTypography-h5 MuiTypography-gutterBottom sc-dZTDFv jjibcZ css-1i17kim' or text()='Edited course name']")
    public WebElement courseTabClick;

    @FindBy(xpath = "//p[@class='sc-fWHiwC hFASxX' or text()='Unit Test Group#2']")
    public WebElement lessonNameTabClick;

    @FindBy(xpath = "(//a[@class='MuiButtonBase-root MuiTab-root MuiTab-labelIcon MuiTab-textColorPrimary sc-cUEOzv fKrLfV css-1tnnsql'])[3]")
    public WebElement linkTabClick;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-79mk38']")
    public WebElement addLinkButtonClick;

    @FindBy(name = "displayText")
    public WebElement addSomeDisplayText;

    @FindBy(name = "link")
    public WebElement addSomeValidLink;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement addButtonClick;

    @FindBy(xpath = "//*[contains(text(), 'Link successfully saved')]")
    public WebElement message;



}
