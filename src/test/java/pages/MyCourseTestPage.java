package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MyCourseTestPage {
    public MyCourseTestPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "MuiTypography-root MuiTypography-h5 MuiTypography-gutterBottom sc-dZTDFv jjibcZ css-1i17kim")
    public WebElement courseClick;

    @FindBy(xpath = "//p[@class='sc-fWHiwC hFASxX' or text()='Unit Test Group#2']")
    public WebElement lessonNameClick;
    @FindBy (xpath = "//a[@class='MuiButtonBase-root MuiTab-root MuiTab-labelIcon MuiTab-textColorPrimary Mui-selected sc-bYMpWt gDLyzc css-1tnnsql']")
    public WebElement test;

    @FindBy (xpath = "//header[@class='sc-eVspGN eShBwr']/button")
    public WebElement createTest;

    @FindBy (css = "input[name='name']")
    public WebElement testName;

    @FindBy (id = ":r1f:-label")
    public WebElement question;

    @FindBy (className = "MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-79mk38")
    public WebElement saveButton;

    @FindBy (className = "css-yfigov")
    public WebElement verifyTest;

}
