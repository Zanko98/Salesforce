package pages;

import dto.Contact;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.DropDown;
import wrappers.Input;
import wrappers.TextArea;

@Log4j2
public class ContactsPage extends BasePage {

    public static final By SAVE_BUTTON = By.xpath("//div[contains(@class, 'windowViewMode-n')]//button[@name= 'SaveEdit']"),
            NAME_PAGE = By.xpath("//div[contains(@class, 'slds-bre')]//span[text() = 'Contacts']"),
            NEW_BUTTON = By.cssSelector("[title ='New']"),
            TITLE_FORM = By.xpath("//span[text() = 'Address Information']"),
            TITLE_CONTACT = By.xpath("//div[text()='Contact']");

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    public void NewButtonClick() {
        driver.findElement(NEW_BUTTON).click();
        wait(TITLE_FORM);
    }

    public void open() {
        driver.get(baseUrl + "/lightning/o/Contact/list?filterName=Recent");
        wait(NAME_PAGE);
    }

    public void createContact(Contact contact) {
        log.info("Creations of contact {}", contact);
        new DropDown(driver, "Salutation").select(contact.getSalutation());
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Middle Name").write(contact.getMiddleName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "Suffix").write(contact.getSuffix());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Department").write(contact.getDepartment());
        new Input(driver, "Account Name").insertIntoSearch(contact.getAccountName());
        new Input(driver, "Email").write(contact.getEmail());
        new Input(driver, "Fax").write(contact.getFax());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZip());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());
        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
        wait(TITLE_CONTACT);
    }
}
