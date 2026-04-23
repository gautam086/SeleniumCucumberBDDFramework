package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ReusableComps;

public class LandingPageObject extends ReusableComps {

    public LandingPageObject(WebDriver driver, WebDriverWait webDriverWait) {
        super(driver, webDriverWait);
        PageFactory.initElements(driver, this);
    }

    By bookstore = By.xpath("//a[contains(@href,'books')]");
    By forms =  By.xpath("//a[contains(@href,'forms')]");

    public void clickOnBookStore() {
        WebElement e = waitForElementToBeClickable(bookstore);
        clickUsingJavaScript(e);
    }

    public void clickOnForms() {
        WebElement e = waitForElementToBeClickable(forms);
        clickUsingJavaScript(e);
    }
}