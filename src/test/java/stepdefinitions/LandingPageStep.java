package stepdefinitions;

import context.TestContextSetup;
import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.LandingPageObject;
import utils.ReusableComps;

import java.time.Duration;

public class LandingPageStep {

    TestContextSetup testContextSetup;
    LandingPageObject landingPageObject;

    public LandingPageStep(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        landingPageObject = testContextSetup.pageObjectManager.getLandingPageObject();
    }

    @Given("user is on landing page for tools QA")
    public void user_is_on_landing_page_for_tools_qa() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("user navigates to book store application")
    public void user_navigates_to_book_store_application(){
        // Write code here that turns the phrase above into concrete actions
        landingPageObject.clickOnBookStore();
    }

    @Given("user navigates to forms application")
    public void user_navigates_to_forms_application(){
        landingPageObject.clickOnForms();
    }

}
