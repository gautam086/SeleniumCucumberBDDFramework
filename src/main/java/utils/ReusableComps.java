package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReusableComps {

    WebDriver driver;
    WebDriverWait webDriverWait;
    JavascriptExecutor js;

    public ReusableComps(WebDriver driver,WebDriverWait webDriverWait){
        this.driver = driver;
        this.webDriverWait = webDriverWait;
        js = (JavascriptExecutor) this.driver;
    }

    //All reusable code and method sits here

    public WebElement waitForElementToBeClickable(By by){
         webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
         return webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void clickUsingJavaScript(WebElement e){
        js.executeScript("arguments[0].scrollIntoView(true);", e);
        js.executeScript("arguments[0].click();",e);
    }

    public void waitForVisibiltyOf(WebElement e){
        webDriverWait.until(ExpectedConditions.visibilityOf(e));
    }

    public void waitForVisibilityOfElementLocated(By by){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


}
