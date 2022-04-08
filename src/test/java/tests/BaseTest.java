package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.AccountPage;
import pages.ContactsPage;
import pages.LoginPage;

import java.time.Duration;

public class BaseTest {
    public static final String USER = "zank1998-n3ba@force.com",
            PASSWORD = "Zanko0998";

    WebDriver driver;
    LoginPage loginPage;
    AccountPage accountPage;
    ContactsPage contactsPage;


    @Parameters({"browser"})
    @BeforeMethod
    public void setup(@Optional("chrome") String browser, ITestContext testContext) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        testContext.setAttribute("driver", driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        contactsPage = new ContactsPage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        driver.quit();
    }
}
