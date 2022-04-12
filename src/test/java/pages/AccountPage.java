package pages;

import dto.Account;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.TextArea;

@Log4j2
public class AccountPage extends BasePage {

    public static final By SAVE_BUTTON = By.cssSelector("[title ='Save']"),
            NEW_BUTTON = By.cssSelector("[title ='New']"),
            NAME_FORM = By.xpath("//span[text() = 'Account Information']"),
            NAME_PAGE = By.xpath("//lst-breadcrumbs//span[text() = 'Accounts']");


    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void newButtonClick() {
        log.info("Click button 'new'");
        driver.findElement(NEW_BUTTON).click();
        wait(NAME_FORM);
    }

    public void open() {
        log.info("Opening Accounts page");
        driver.get(baseUrl + "/lightning/o/Account/list?filterName=Recent");
        wait(NAME_PAGE);
    }

    public void createAccount(Account account) {
        log.info("Creations of account {}", account);
        new Input(driver, "Account Name").write(account.getName());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Billing City").write(account.getBillingCity());
        new Input(driver, "Billing Zip/Postal Code").write(account.getBillingZipCode());
        new Input(driver, "Billing State/Province").write(account.getBillingStateCode());
        new Input(driver, "Billing Country").write(account.getBillingCountry());
        new Input(driver, "Shipping City").write(account.getShippingCity());
        new Input(driver, "Shipping Zip/Postal Code").write(account.getShippingZipCode());
        new Input(driver, "Shipping State/Province").write(account.getShippingState());
        new Input(driver, "Shipping Country").write(account.getShippingCountry());
        new DropDown(driver, "Type").select(account.getType());
        new DropDown(driver, "Industry").select(account.getIndustry());
        new TextArea(driver, "Description").write(account.getDescription());
        new TextArea(driver, "Billing Street").write(account.getBillingStreet());
        new TextArea(driver, "Shipping Street").write(account.getShippingStreet());
    }

    public void createAccountWithEnteringName(Account account) {
        new Input(driver, "Account Name").write(account.getName());
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
