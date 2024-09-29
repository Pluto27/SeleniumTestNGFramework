package example.example.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class WindowHandlePage extends BasePage{
    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public WindowHandlePage(WebDriver driver) {
        super(driver);
    }

@FindBy(xpath="(//button[@class='btn btn-primary'])[1]")
    WebElement tab;

    public void switchTab()
    {
        String OriginalWindow= driver.getWindowHandle();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.open('https://demoqa.com/sample','_blank');");
        Set<String> allwindowhandles=driver.getWindowHandles();
        for(String windowhandle:allwindowhandles)
        {
            if(!windowhandle.equals(OriginalWindow))
            {
                driver.switchTo().window(windowhandle);
                break;
            }
        }
        System.out.println(driver.getTitle());
        driver.switchTo().window(OriginalWindow);
        System.out.println(driver.getTitle());

    }
}
