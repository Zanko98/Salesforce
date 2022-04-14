package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.TextArea;

import java.time.Duration;

@Log4j2
public class BasePage {
    static WebDriverWait wait;
    WebDriver driver;
    String baseUrl = "https://tms-b.lightning.force.com",
            addedRecord = "//table[contains(@class, 'slds-table forceRec')]//tbody/tr[%s]//a";
    String label;
    DropDown dropDown;
    Input input;
    TextArea textArea;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        dropDown = new DropDown(driver, label);
        input = new Input(driver, label);
        textArea = new TextArea(driver, label);
    }

    public static void wait(By locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException ex) {
            log.error("Cannot find element for using locator {}", locator);
            log.error(ex.getLocalizedMessage());
        }
    }

    public String getNameAddedRecordByIndex(String index) {
        return driver.findElement(By.xpath(String.format(addedRecord, index))).getAttribute("title");
    }
}