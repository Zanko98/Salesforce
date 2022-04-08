package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    WebDriver driver;
    String label;
    String selectLocator = "//div[contains(@class,'windowViewMode-n')]//*[text()='%s']/ancestor::div[1]//*[@*='button']",
            elementOfSelect = "//*[text()= '%s']";
    //"[title = '%s']";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String option) {
        driver.findElement(By.xpath(String.format(selectLocator, label))).click();
        driver.findElement(By.xpath(String.format(elementOfSelect, option))).click();
    }
}