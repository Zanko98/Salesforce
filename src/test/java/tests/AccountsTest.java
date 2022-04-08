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
        accountPage.NewButtonClick();
        accountPage.createAccount(new Account("TMS", "bla", "bla", "bla", "bla",
                "bla", "bla", "bla", "bla", "bla",
                "bla", "Press", "Banking", "bla", "bla", "bla"));
        accountPage.save();
        accountPage.open();
        assertEquals(accountPage.getNameAddedAccount(), "TMS");
    }
}
