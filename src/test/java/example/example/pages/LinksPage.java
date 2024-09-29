package example.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LinksPage extends BasePage {


    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    List<WebElement> links= driver.findElements(By.tagName("a"));

    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public LinksPage(WebDriver driver) {
        super(driver);
    }


    public List<WebElement> linkCount() {
        for (WebElement link : links) {
            System.out.println(link.getAttribute("href"));
        }
        return links;
    }
}
