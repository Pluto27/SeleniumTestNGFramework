package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.BrowserWindowPage;
import example.example.pages.LinksPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BrowserWindowTest extends BaseTest{
    @Test
    public void WindowHandleTest() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        BrowserWindowPage linkpage = PageinstancesFactory.getInstance(BrowserWindowPage.class);
        linkpage.testWindows();
    }
}
