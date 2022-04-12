package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public static final By USERNAME = By.id("username"),
            PASSWORD = By.id("password"),
            LOGIN_BUTTON = By.id("Login"),
            ERROR_MESSAGE = By.id("error"),
            CHECKBOX = By.id("rememberUn");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(baseUrl);
        wait(LOGIN_BUTTON);
    }

    public void login(String user, String password) {
        driver.findElement(USERNAME).sendKeys(user);
        driver.findElement(PASSWORD).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }

    public String getError() {
        return driver.findElement(ERROR_MESSAGE).getText();
    }
}
