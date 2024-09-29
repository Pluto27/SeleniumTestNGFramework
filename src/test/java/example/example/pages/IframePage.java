package example.example.pages;

import example.example.util.LoggerUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.logging.Logger;

public class IframePage extends BasePage{
    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public IframePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//iframe[@srcdoc='<p>Child Iframe</p>']")
    private WebElement childFrame;

    @FindBy(xpath="//body[text()='Parent frame']")
    private WebElement parentFrameElement;
    @FindBy(xpath="//p[text()='Child Iframe']")
    private WebElement childFrameElement;


    String parentframeID="frame1";

    public void switchToFrame(){
        driver.switchTo().frame(parentframeID);
        waiter.until(ExpectedConditions.visibilityOf(parentFrameElement));
        System.out.println("Switched to Parent Frame");
        System.out.println("Parent Frame Element text: "+parentFrameElement.getText());
        driver.switchTo().frame(childFrame);
        System.out.println("Switched to Child Frame");
        System.out.println("Child Frame Element text: "+childFrameElement.getText());
        driver.switchTo().parentFrame();
        waiter.until(ExpectedConditions.visibilityOf(parentFrameElement));
        System.out.println("Switched back to Parent Frame");
        System.out.println("Switching back to Parent Frame Element text: "+parentFrameElement.getText());
        System.out.println("Switching to default content");
        driver.switchTo().defaultContent();
        System.out.println("Switching main handle: "+driver.getTitle());
    }
}
