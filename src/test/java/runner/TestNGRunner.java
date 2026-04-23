package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions
        (
                features = "src/test/resources/Features",
                glue = {"stepdefinitions","hooks"},
                monochrome = true,plugin = {"pretty","html:target/Cucumber.html",
        "json:target/Cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "rerun:target/failed.txt"}
        )
public class TestNGRunner extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios(){
                return super.scenarios();
        }
}
