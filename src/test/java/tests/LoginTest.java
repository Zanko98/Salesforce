package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTest extends BaseTest {

    @DataProvider(name = "Входящие данные для негативных тестов на логин")
    public Object[][] loginDate() {
        return new Object[][]{
                {"test", "", "Please enter your password."},
                {"test", "test", "Please check your username and password. If you still can't log in, contact your Salesforce administrator."},
        };
    }

    @Test(dataProvider = "Входящие данные для негативных тестов на логин")
    public void login(String name, String password, String error) {
        loginPage.open();
        loginPage.login(name, password);
        assertEquals(loginPage.getError(), error);
    }
}
