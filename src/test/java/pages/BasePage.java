package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.TextArea;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
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

    public void wait(By element) {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}