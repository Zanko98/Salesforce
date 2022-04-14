package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class DropDown {
    WebDriver driver;
    String label;
    String selectLocator = "//div[contains(@class,'windowViewMode-n')]//*[text()='%s']/ancestor::div[1]//*[@*='button']",
            elementOfSelect = "//*[text()= '%s']";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String option) {
        log.info("Selection from the drop-down list {} into {}", option, label);
        driver.findElement(By.xpath(String.format(selectLocator, label))).click();
        driver.findElement(By.xpath(String.format(elementOfSelect, option))).click();
    }
}