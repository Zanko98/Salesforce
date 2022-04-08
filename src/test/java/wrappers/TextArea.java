package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {
    WebDriver driver;
    String label;
    String writeLocator = "//div//*[text() = '%s']//ancestor-or-self::label//following::textarea";

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        driver.findElement(By.xpath(String.format(writeLocator, label))).sendKeys(text);
    }
}
