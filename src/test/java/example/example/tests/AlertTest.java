package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.AlertExample;
import example.example.pages.LinksPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

    @Test
    public void AlertOkTest() {
        driver.get("https://demoqa.com/alerts");
        AlertExample alertpage = PageinstancesFactory.getInstance(AlertExample.class);
        boolean ok = alertpage.alert();
        Assert.assertTrue(ok, "clicked");

    }

    @Test
    public void AlertOk5Test() {
        driver.get("https://demoqa.com/alerts");
        AlertExample alertpage = PageinstancesFactory.getInstance(AlertExample.class);
        boolean ok = alertpage.alert2();
        Assert.assertTrue(ok, "clicked");

    }

    @Test
    public void AlertTextTest() {
        driver.get("https://demoqa.com/alerts");
        AlertExample alertpage = PageinstancesFactory.getInstance(AlertExample.class);
        boolean ok = alertpage.alert4();
        Assert.assertTrue(ok, "canceled");

    }
}