package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.BankPage;
import example.example.pages.FacebookLoginPage;
import example.example.util.TestProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest{

    @Test
    public void registerPage()
    {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        BankPage bankpage = PageinstancesFactory.getInstance(BankPage.class);
        boolean result=bankpage.register(TestProperties.getProperty("firstName"),TestProperties.getProperty("lastName"),TestProperties.getProperty("address"),TestProperties.getProperty("city"),TestProperties.getProperty("state"),TestProperties.getProperty("zipCode"),
                TestProperties.getProperty("phoneNumber"),TestProperties.getProperty("ssn"),TestProperties.getProperty("userName"),TestProperties.getProperty("password"),TestProperties.getProperty("confirmPassword"));
        Assert.assertTrue(result, "Registered sucessfully");

    }


}
