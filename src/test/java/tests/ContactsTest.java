package tests;

import dto.Contact;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ContactsTest extends BaseTest {

    @Test
    public void contactCreate() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        contactsPage.open();
        contactsPage.NewButtonClick();
        contactsPage.createContact(
                Contact.builder()
                        .salutation("Mrs.")
                        .firstName("bla")
                        .middleName("bla")
                        .lastName("Press")
                        .suffix("bla2")
                        .accountName("TMS")
                        .title("TMS")
                        .Department("bla4")
                        .email("blafa@mail.ru")
                        .fax("bla6")
                        .phone("bla7")
                        .mobile("bla8")
                        .mailingCountry("bla9")
                        .mailingCity("bla10")
                        .mailingZip("bla11")
                        .mailingStreet("lalala")
                        .build());
        contactsPage.save();
        contactsPage.open();
        assertEquals(contactsPage.getNameAddedRecordByIndex("1"), "bla bla Press bla2");
    }
}
