package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ReusableComps;

import java.util.List;
import java.util.Map;

public class RegistrationPageObject extends ReusableComps {

    public RegistrationPageObject(WebDriver driver, WebDriverWait webDriverWait) {
        super(driver, webDriverWait);
        PageFactory.initElements(driver,this);
    }

    By firstName = By.xpath("//input[@id='firstname']");
    @FindBy(id="firstname")
    private WebElement firstname;

    @FindBy(id="lastname")
    private WebElement lastname;

    @FindBy(id="userName")
    private WebElement username;

    @FindBy(css = "#password")
    private WebElement password;

    @FindBy(xpath = "//button[@id='register']")
    private WebElement registerButtton;

    public void enterFieldDetails(List<Map<String,String>> lis){
        waitForVisibilityOfElementLocated(firstName);
        for(Map<String,String> li:lis){
            firstname.sendKeys(li.get("FirstName"));
            lastname.sendKeys(li.get("LastName"));
            username.sendKeys(li.get("UserName"));
            password.sendKeys(li.get("Password"));
        }
    }

    public void clickOnRegisterButton(){
        registerButtton.click();
    }
}
