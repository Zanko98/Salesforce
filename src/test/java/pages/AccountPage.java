package pages;

import dto.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.TextArea;

public class AccountPage extends BasePage {

    public static final By SAVE_BUTTON = By.cssSelector("[title ='Save']"),
            NEW_BUTTON = By.cssSelector("[title ='New']"),
            NAME_FORM = By.xpath("//span[text() = 'Account Information']"),
            NAME_PAGE = By.xpath("//lst-breadcrumbs//span[text() = 'Accounts']"),
            ADDED_ACCOUNT = By.xpath("//table[contains(@class, 'slds-table forceRec')]//tbody/tr[1]//a");
    String url = "https://tms-b.lightning.force.com/lightning/o/Account/list?filterName=Recent";

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void NewButtonClick() {
        driver.findElement(NEW_BUTTON).click();
        wait(NAME_FORM);
    }

    public void open() {
        driver.get(url);
        wait(NAME_PAGE);
    }

    public void createAccount(Account account) {
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

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }

    public String getNameAddedAccount() {
        return driver.findElement(ADDED_ACCOUNT).getAttribute("title");
    }
}
