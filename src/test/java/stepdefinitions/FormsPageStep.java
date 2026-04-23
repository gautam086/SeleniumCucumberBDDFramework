package stepdefinitions;

import context.TestContextSetup;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import pageobjects.BooksPageObject;
import pageobjects.FormsPageObject;

public class FormsPageStep {

    TestContextSetup testContextSetup;
    FormsPageObject formsPageObject;

    public FormsPageStep(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        formsPageObject= testContextSetup.pageObjectManager.getFormsPageObject();
    }

    @Given("user clicks on practice form button")
    public void user_clicks_on_practice_form_button() {
        formsPageObject.clickOnPracticeForm();
        Assert.assertFalse(formsPageObject.checkIfElementVisible());
    }
}
