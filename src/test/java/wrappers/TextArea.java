package wrappers;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class TextArea {
    WebDriver driver;
    String label;
    String writeLocator = "//div//*[text() = '%s']//ancestor-or-self::label//following::textarea";

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        log.info("Writing {} into {}", text, label);
        driver.findElement(By.xpath(String.format(writeLocator, label))).sendKeys(text);
    }
}
