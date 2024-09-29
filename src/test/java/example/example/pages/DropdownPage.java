package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPage extends BasePage {


    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "oldSelectMenu")
    private WebElement oldMenu;

    //@FindBy(xpath="//div[@class='css-1hwfws3']")
    //private WebElement selectOne;
  @FindBy(id="cars")
  private WebElement carSelect;


    public void selectDropdown()
    {
        Select select= new Select(oldMenu);
        select.selectByVisibleText("Green");
    }

    public void getAlltext()
    {
Select select=new Select(oldMenu);
List<WebElement> options= select.getOptions();
for(WebElement option:options)
{
    System.out.println(option.getText());
}
    }

    public void multiSelectDropdown()
    {
        Select select=new Select(carSelect);
        if(select.isMultiple())
        {
            select.selectByValue("saab");
            select.selectByValue("opel");
            select.selectByValue("audi");
        for(WebElement option:select.getAllSelectedOptions())
        {
            System.out.println(option.getText());
        }
        }
    }

}





