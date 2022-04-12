package tests;

import dto.Account;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AccountsTest extends BaseTest {

    @Test
    public void accountCreate() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        accountPage.open();
        accountPage.newButtonClick();
        accountPage.createAccount(new Account("TMS", "bla", "bla", "bla", "bla",
                "bla", "bla", "bla", "bla", "bla",
                "bla", "Press", "Banking", "bla", "bla", "bla"));
        accountPage.save();
        accountPage.open();
        assertEquals(accountPage.getNameAddedRecordByIndex("1"), "TMS");
    }

    @Test
    public void accountCreateWithEnteringName() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        accountPage.open();
        accountPage.newButtonClick();
        accountPage.createAccountWithEnteringName(new Account("TeachMeSkills"));
        accountPage.save();
        accountPage.open();
        assertEquals(accountPage.getNameAddedRecordByIndex("1"), "TeachMeSkills");
    }

}
