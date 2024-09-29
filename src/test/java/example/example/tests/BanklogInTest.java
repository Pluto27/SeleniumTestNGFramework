package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.BankLogIn;
import example.example.pages.BankPage;
import example.example.util.TestProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BanklogInTest extends BaseTest {

    @Test
    public void LoginPage() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        BankLogIn banklogin = PageinstancesFactory.getInstance(BankLogIn.class);
        String result = banklogin.logIn(TestProperties.getProperty("userName"), TestProperties.getProperty("password"));
        Assert.assertEquals(result,"Welcome"+" "+TestProperties.getProperty("firstName")+" " +TestProperties.getProperty("lastName"));

    }
}