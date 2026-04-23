package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {
    WebDriver driver;
    Properties properties;
    public WebDriver initDriver() throws IOException {
        String env = System.getProperty("env");
        if(env == null || env.isEmpty()){
            env = "qa";
        }
        FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Config-"+env+".properties");
        properties = new Properties();
        properties.load(fi);
        String browserName=System.getProperty("browser");

        if(browserName==null){
            browserName = properties.getProperty("browser");
        }

        String url = properties.getProperty("URL");
       if(DriverManager.getDriver()==null) {
           if (browserName.equalsIgnoreCase("chrome")) {
               ChromeOptions options = new ChromeOptions();
               options.addArguments("--headless=new");
               options.addArguments("--no-sandbox");
               options.addArguments("--disable-dev-shm-usage");
               driver = new ChromeDriver(options);
               driver.manage().window().maximize();
               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
               driver.get(url);
               DriverManager.setDriver(driver);
           }
       }
      return DriverManager.getDriver();
    }
}
