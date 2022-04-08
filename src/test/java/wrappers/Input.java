package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Input {
    WebDriver driver;
    String label;
    String writeForContact = "//div[contains(@class, 'windowViewMode-n')]//*[text()='%s']/ancestor::*[contains(@class, 'slds-form-element_')][1]//input",
            elementOfSelect = "//span[@title = '%s']";


    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format(writeForContact, label))).sendKeys(text);
    }

    public void insertIntoSearch(String text) {
        driver.findElement(By.xpath(String.format(writeForContact, label))).click();
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath(String.format("//input[@aria-expanded='true']"))));
        driver.findElement(By.xpath(String.format(elementOfSelect, text))).click();
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath(String.format("//input[@placeholder ='%s']", text))));
    }

}
