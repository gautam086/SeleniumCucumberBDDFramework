package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ReusableComps;

public class BooksPageObject extends ReusableComps {

    public BooksPageObject(WebDriver driver, WebDriverWait webDriverWait) {
        super(driver, webDriverWait);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[text()='Book Store Application']/parent::div/parent::span/parent::div")
    private WebElement bookStore;

    public void clickOnLoginButton(){
        waitForVisibiltyOf(bookStore);
        bookStore.findElement(By.xpath(".//ul/li[1]")).click();
    }
}
