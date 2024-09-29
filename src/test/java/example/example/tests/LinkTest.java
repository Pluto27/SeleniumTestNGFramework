package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.BankPage;
import example.example.pages.LinksPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LinkTest extends BaseTest{

    @Test
    public void linkPageTest() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        LinksPage linkpage = PageinstancesFactory.getInstance(LinksPage.class);
        List<WebElement> links=linkpage.linkCount();
        for(WebElement link:links) {
            Assert.assertNotNull(link);
        }
    }


}