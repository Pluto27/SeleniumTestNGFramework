package example.example.tests;

import example.example.factory.PageinstancesFactory;
import example.example.pages.DropdownPage;
import example.example.pages.IframePage;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest{
    @Test
    public void getAllTextTest() {
        driver.get("https://demoqa.com/select-menu");
        DropdownPage dropdownPage = PageinstancesFactory.getInstance(DropdownPage.class);
        dropdownPage.getAlltext();
    }

    @Test
    public void getTextFromDropdownTest() {
        driver.get("https://demoqa.com/select-menu");
        DropdownPage dropdownPage = PageinstancesFactory.getInstance(DropdownPage.class);
        dropdownPage.selectDropdown();
    }

    @Test
    public void multiselectDropdownTest() {
        driver.get("https://demoqa.com/select-menu");
        DropdownPage dropdownPage = PageinstancesFactory.getInstance(DropdownPage.class);
        dropdownPage.multiSelectDropdown();
    }




}
