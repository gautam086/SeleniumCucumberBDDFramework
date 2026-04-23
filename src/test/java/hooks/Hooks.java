package hooks;


import context.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.messages.types.Hook;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.DriverManager;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

public class Hooks {

    TestContextSetup testContextSetup;

    public Hooks(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
    }

    @After
    public void closeDriver(){
        if(DriverManager.getDriver()!=null){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }

    }

    @AfterStep
    public void addScreenshot(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            File src = ((TakesScreenshot)testContextSetup.driver).getScreenshotAs(OutputType.FILE);

            byte[] byteArray = FileUtils.readFileToByteArray(src);
            scenario.attach(byteArray,"image/png",scenario.getName());
        }
    }
}