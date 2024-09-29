package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BankLogIn extends BasePage{
    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public BankLogIn(WebDriver driver) {
        super(driver);

    }

    @FindBy(name="username")
    WebElement userNamelogin;

    @FindBy(name="password")
    WebElement passwordlogin;

    @FindBy(xpath="//input[@value='Log In']")
    WebElement submitlogin;

    @FindBy(xpath="//p[@class='smallText']")
    WebElement successloginText;

    @FindBy(xpath="(//p[@class='smallText'])[1]")
    WebElement example;
    public String logIn(String userName1, String password1)
    {
        userNamelogin.sendKeys(userName1);
        passwordlogin.sendKeys(password1);
        submitlogin.click();
        waiter.until(ExpectedConditions.visibilityOf(successloginText));
        return successloginText.getText();


    }


}
