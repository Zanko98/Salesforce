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
        contactsPage.createContact(new Contact("Mrs.", "bla", "Press", "bla2",
                "bla3", "TMS", "bla4", "randomName", "blafa@mail.ru", "bla6", "bla7",
                "bla8", "bla9", "bla10", "bla11", "lalala"));
        contactsPage.save();
        contactsPage.open();
        assertEquals(contactsPage.getNameAddedRecordByIndex("1"), "bla Press bla2 bla3");
    }
}
