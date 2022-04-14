package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

@Log4j2
public class Input {
    WebDriver driver;
    String label;
    public final static By WAIT_LOCATOR = By.xpath("//input[@aria-expanded='true']");
    String writeForContact = "//div[contains(@class, 'windowViewMode-n')]//*[text()='%s']/ancestor::*[contains(@class, 'slds-form-element_')][1]//input",
            elementOfSelect = "//span[@title = '%s']";


    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        log.info("Writing {} into {}", text, label);
        driver.findElement(By.xpath(String.format(writeForContact, label))).sendKeys(text);
    }

    public void insertIntoSearch(String text) {
        driver.findElement(By.xpath(String.format(writeForContact, label))).click();
        BasePage.wait(WAIT_LOCATOR);
        driver.findElement(By.xpath(String.format(elementOfSelect, text))).click();
    }
}
