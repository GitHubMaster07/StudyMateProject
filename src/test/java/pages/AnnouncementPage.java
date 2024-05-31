package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AnnouncementPage {
    public AnnouncementPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//li[text()='Announcements']")
    public WebElement announcements;

    @FindBy (className = "MuiButton-startIcon MuiButton-iconSizeMedium css-6xugel")
    public WebElement addAnnouncement;

    @FindBy (id = ":r8:-label")
    public WebElement titleAnnouncement;

    @FindBy (className = "MuiSvgIcon-root MuiSvgIcon-fontSizeMedium MuiSelect-icon MuiSelect-iconOutlined css-1636szt")
    public WebElement dropdown;

    @FindBy (xpath = "//li[text()='Group4']")
    public WebElement choosingGroup;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement addButton;

    @FindBy (className = "sc-ihFKfs eRqYyd")
    public WebElement verifyAnn;
}
