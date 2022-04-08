package tests;

import dto.Contact;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ContactsTest extends BaseTest {

    @Test
    public void accountCreate() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        contactsPage.open();
        contactsPage.NewButtonClick();
        contactsPage.createContact(new Contact("Mrs.", "bla1", "Press", "bla2", "bla3", "4",
                "bla4", "bla5", "blaa@mail.ru", "bla6", "bla7", "bla8", "bla9",
                "bla10", "bla11", "blablabla"));
        contactsPage.save();
        contactsPage.open();
        assertEquals(contactsPage.getNameAddedContact(), "bla1 Press bla2 bla3");
    }
}
