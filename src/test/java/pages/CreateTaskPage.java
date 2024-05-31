package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateTaskPage {

    public CreateTaskPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//a[@class='MuiButtonBase-root MuiTab-root MuiTab-labelIcon MuiTab-textColorPrimary sc-cUEOzv fKrLfV css-1tnnsql'])[2]")
    public WebElement taskTab;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium sc-kGFDUS hTXTcR css-fcwsl0']")
    public WebElement createTaskTab;

    @FindBy(xpath = "//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']")
    public WebElement taskName;

    @FindBy(xpath = "//div[@class='editor-input']")
    public WebElement taskDescription;

    @FindBy(xpath = "//input[@name='deadline']")
    public WebElement calendarButton;

    @FindBy(xpath = "//button[text()='29']")
    public WebElement chooseDay;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-79mk38']")
    public WebElement createButton;








}
