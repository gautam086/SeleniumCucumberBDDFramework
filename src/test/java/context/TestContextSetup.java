package context;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v145.page.Page;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageobjects.PageObjectManager;
import utils.DriverManager;
import utils.ReusableComps;
import utils.TestBase;

import java.io.IOException;
import java.time.Duration;

public class TestContextSetup {
    public WebDriver driver;
    public WebDriverWait webDriverWait;
    public ReusableComps reusableComps;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;

    public TestContextSetup() throws IOException {
        testBase = new TestBase();
        driver = testBase.initDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        pageObjectManager = new PageObjectManager(driver,webDriverWait);
    }
}
