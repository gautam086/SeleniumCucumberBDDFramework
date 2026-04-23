package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ReusableComps;

public class FormsPageObject extends ReusableComps {

    public FormsPageObject(WebDriver driver, WebDriverWait webDriverWait) {
        super(driver, webDriverWait);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(@href,'automation-practice-form')]")
    private WebElement practiceForm;

    @FindBy(id="firstName")
    private WebElement firstName;


    public void clickOnPracticeForm(){
        waitForVisibiltyOf(practiceForm);
        practiceForm.click();
    }

    public boolean checkIfElementVisible(){
        return  firstName.isDisplayed();
    }
}
