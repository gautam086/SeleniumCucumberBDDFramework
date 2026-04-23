package stepdefinitions;

import context.TestContextSetup;
import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.When;


import pageobjects.RegistrationPageObject;


import java.util.List;
import java.util.Map;

public class RegistrationPageStep {

    TestContextSetup testContextSetup;
    RegistrationPageObject registrationPageObject;

    public RegistrationPageStep(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        registrationPageObject = testContextSetup.pageObjectManager.getRegistrationPageObject();
    }

    @When("user enters below details")
    public void user_enters_below_details(DataTable dataTable) {

        List<Map<String,String>> lis = dataTable.asMaps();
        registrationPageObject.enterFieldDetails(lis);
    }

    @When("clicks on register button")
    public void clicks_on_register_button() {
        // Write code here that turns the phrase above into concrete actions
        registrationPageObject.clickOnRegisterButton();
    }
}
