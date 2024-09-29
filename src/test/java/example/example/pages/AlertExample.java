package example.example.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertExample extends BasePage{
    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public AlertExample(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="(//button[@class='btn btn-primary'])[1]")
    private WebElement alert1;

    @FindBy(xpath ="(//button[@class='btn btn-primary'])[2]")
    private WebElement alert2;

    @FindBy(xpath ="(//button[@class='btn btn-primary'])[3]")
    private WebElement alert3;

    @FindBy(xpath ="(//button[@class='btn btn-primary'])[4]")
    private WebElement alert4;



    public boolean alert()
    {
        waiter.until(ExpectedConditions.visibilityOf(alert1));
        alert1.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        return true;
    }

    public boolean alert2()  {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waiter.until(ExpectedConditions.visibilityOf(alert2));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",alert2);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Alert alert=driver.switchTo().alert();
        alert.accept();
        return true;
    }

    public boolean alert3() {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",alert3);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        return true;
    }

    public boolean alert4(){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",alert4);
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("text");
return true;
    }
}
