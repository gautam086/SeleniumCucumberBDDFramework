package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectManager {
    LandingPageObject landingPageObject;
    BooksPageObject booksPageObject;
    LoginPageObject loginPageObject;
    RegistrationPageObject registrationPageObject;
    FormsPageObject formsPageObject;

    WebDriver driver;
    WebDriverWait webDriverWait;

    public PageObjectManager(WebDriver driver,WebDriverWait webDriverWait){
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }

    public FormsPageObject getFormsPageObject(){
        if(formsPageObject==null){
            formsPageObject = new FormsPageObject(driver,webDriverWait);
        }
        return formsPageObject;
    }

    public LandingPageObject getLandingPageObject(){
        if(landingPageObject==null){
            landingPageObject = new LandingPageObject(driver,webDriverWait);
        }
        return landingPageObject;
    }

    public BooksPageObject getBooksPageObject(){
        if(booksPageObject==null){
            booksPageObject = new BooksPageObject(driver,webDriverWait);
        }
        return booksPageObject;
    }

    public LoginPageObject getLoginPageObject(){
        if(loginPageObject==null){
            loginPageObject = new LoginPageObject(driver,webDriverWait);
        }
        return loginPageObject;
    }

    public RegistrationPageObject getRegistrationPageObject(){
        if(registrationPageObject==null){
            registrationPageObject = new RegistrationPageObject(driver,webDriverWait);
        }
        return registrationPageObject;
    }
}
