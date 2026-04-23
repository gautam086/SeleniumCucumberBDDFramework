package stepdefinitions;

import context.TestContextSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.BooksPageObject;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class BooksPageStep {

    TestContextSetup testContextSetup;
    BooksPageObject booksPageObject;

    public BooksPageStep(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        booksPageObject = testContextSetup.pageObjectManager.getBooksPageObject();
    }


    @Given("user clicks on login button")
    public void user_clicks_on_login_button() {
        booksPageObject.clickOnLoginButton();
    }
}
