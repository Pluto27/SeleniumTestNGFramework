package example.example.pages;

import example.example.util.LoggerUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BankPage extends BasePage{


    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public BankPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText="Register")
    private WebElement registerLinktext ;


    @FindBy(id="customer.firstName")
    private WebElement firstName;

    @FindBy(id="customer.lastName")
    private WebElement lastName;

   @FindBy(id="customer.address.street")
    private WebElement address;

    @FindBy(id="customer.address.city")
    private WebElement city;

    @FindBy(id="customer.address.state")
    private WebElement state;

    @FindBy(id="customer.address.zipCode")
    private WebElement zipCode;

    @FindBy(id="customer.phoneNumber")
    private WebElement phoneNumber;

    @FindBy(id="customer.ssn")
    private WebElement ssn;

    @FindBy(id="customer.username")
    private WebElement userName;

    @FindBy(id="customer.password")
    private WebElement password;

    @FindBy(id="repeatedPassword")
    private WebElement confirmPassword;

    @FindBy(xpath="//input[@value='Register']")
    private WebElement submit;

    @FindBy(xpath = "//h1[@class='title']")
    private WebElement sucesstext;

    public boolean register(String firstName1, String lastName1, String address1, String city1, String state1,
                                String zipCode1, String phoneNumber1, String ssn1, String userName1, String password1, String confirmPassword1)
    {

        registerLinktext.click();
        firstName.sendKeys(firstName1);
        lastName.sendKeys(lastName1);
        address.sendKeys(address1);
        city.sendKeys(city1);
        state.sendKeys(state1);
        zipCode.sendKeys(zipCode1);
        phoneNumber.sendKeys(phoneNumber1);
        ssn.sendKeys(ssn1);
        userName.sendKeys(userName1);
        password.sendKeys(password1);
        confirmPassword.sendKeys(confirmPassword1);
        submit.click();
        waiter.until(ExpectedConditions.visibilityOf(sucesstext));
        String txt=sucesstext.getText();
        System.out.println(txt);
        return txt.contains("Welcome");
    }


}
