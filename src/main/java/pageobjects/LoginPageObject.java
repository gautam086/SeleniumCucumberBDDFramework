package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ReusableComps;

public class LoginPageObject extends ReusableComps {

    public LoginPageObject(WebDriver driver, WebDriverWait webDriverWait){
        super(driver,webDriverWait);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "button#newUser")
    private WebElement newUserButton;

    By userName = By.xpath("//input[@id='userName']");

    public void clickOnNewUser(){
        waitForVisibilityOfElementLocated(userName);
        newUserButton.click();
    }
}
