package example.example.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class BrowserWindowPage extends BasePage{
    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public BrowserWindowPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Instantiates a new base page.
     *
     * @param
     */

            // Set up WebDriver (e.g., ChromeDriver)
          public void testWindows(){
              System.out.println("First tab title: " + driver.getTitle());

              // Store the current window handle (first tab)
              String originalWindow = driver.getWindowHandle();

              // Use JavaScriptExecutor to open a new tab
              JavascriptExecutor js = (JavascriptExecutor) driver;
              js.executeScript("window.open('https://www.google.com', '_blank', 'width=800,height=600');");
              // Get all window handles
              Set<String> allWindowHandles = driver.getWindowHandles();

              // Switch to the new tab
              for (String windowHandle : allWindowHandles) {
                  if (!windowHandle.equals(originalWindow)) {
                      driver.switchTo().window(windowHandle);
                      break;
                  }
              }

              // Now you are on the new tab
              System.out.println("Second tab title: " + driver.getTitle());

              // Perform actions on the new tab (Google in this case)

              // Optionally switch back to the original tab
              driver.switchTo().window(originalWindow);
              System.out.println("Back to the first tab title: " + driver.getTitle());

              // Close the browser
              driver.quit();

          }
    }

