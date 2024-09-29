package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.BrowserWindowPage;
import example.example.pages.IframePage;
import org.testng.annotations.Test;

public class IframeTest extends BaseTest{

    @Test
    public void IframeTest() {
        driver.get("https://demoqa.com/nestedframes");
        IframePage iframe = PageinstancesFactory.getInstance(IframePage.class);
        iframe.switchToFrame();
    }
}
