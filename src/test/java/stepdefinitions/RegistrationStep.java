//package stepdefinitions;
//
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.List;
//import java.util.Map;
//
//public class RegistrationStep {
//    public WebDriver driver;
//    WebDriverWait webDriverWait;
//    @Given("user is on landing page for tools QA")
//    public void user_is_on_landing_page_for_tools_qa() {
//        // Write code here that turns the phrase above into concrete actions
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://demoqa.com/");
//
//    }
//    @Given("user navigates to book store application")
//    public void user_navigates_to_book_store_application() throws InterruptedException {
//        // Write code here that turns the phrase above into concrete actions
//        webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        WebElement bookStore =  webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'books')]")));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", bookStore);
//        js.executeScript("arguments[0].click();",bookStore);
//
//    }
//    @Given("user clicks on login button")
//    public void user_clicks_on_login_button() {
//        // Write code here that turns the phrase above into concrete actions
//        WebElement bookStore = driver.findElement(By.xpath("//div[text()='Book Store Application']/parent::div/parent::span/parent::div"));
//
//        webDriverWait.until(ExpectedConditions.visibilityOf(bookStore));
//        bookStore.findElement(By.xpath(".//ul/li[1]")).click();
//        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userName']")));
//    }
//    @Given("user selects new user")
//    public void user_selects_new_user() {
//        // Write code here that turns the phrase above into concrete actions
//       driver.findElement(By.cssSelector("button#newUser")).click();
//       webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='firstname']")));
//    }
//    @When("user enters below details")
//    public void user_enters_below_details(DataTable dataTable) {
//
//        List<Map<String,String>> lis = dataTable.asMaps();
//        for(Map<String,String>li:lis){
//            driver.findElement(By.id("firstname")).sendKeys(li.get("FirstName"));
//            driver.findElement(By.id("lastname")).sendKeys(li.get("LastName"));
//            driver.findElement(By.id("userName")).sendKeys(li.get("UserName"));
//            driver.findElement(By.cssSelector("#password")).sendKeys(li.get("Password"));
//        }
//
//    }
//    @When("clicks on register button")
//    public void clicks_on_register_button() {
//        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.xpath("//button[@id='register']")).click();
//    }
//}
