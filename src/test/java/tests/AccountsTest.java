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
        accountPage.createAccount(Account.builder()
                .name("TMS")
                .website("bla")
                .phone("bla")
                .billingCity("bla")
                .billingZipCode("bla")
                .billingStateCode("bla")
                .billingCountry("bla")
                .shippingCity("bla")
                .shippingZipCode("bla")
                .shippingState("bla")
                .shippingCountry("bla")
                .type("Press")
                .industry("Banking")
                .description("bla")
                .billingStreet("bla")
                .shippingStreet("bla")
                .build());
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
        accountPage.createAccountWithEnteringName(Account.builder().name("TeachMeSkills").build());
        accountPage.save();
        accountPage.open();
        assertEquals(accountPage.getNameAddedRecordByIndex("1"), "TeachMeSkills");
    }

}
