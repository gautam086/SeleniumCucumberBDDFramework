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
import pageobjects.LoginPageObject;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class LoginPageStep {
    TestContextSetup testContextSetup;
    LoginPageObject loginPageObject;

    public LoginPageStep(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        loginPageObject = testContextSetup.pageObjectManager.getLoginPageObject();
    }

    @Given("user selects new user")
    public void user_selects_new_user() {
        // Write code here that turns the phrase above into concrete actions
        loginPageObject.clickOnNewUser();
    }

}
