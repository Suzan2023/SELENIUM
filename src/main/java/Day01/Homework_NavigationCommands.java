package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_NavigationCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");
        /* - Invoke Chrome Browser
- Navigate to URL: https://clarusway.com/
- Navigate to URL: https://amazon.com/
- Come back to the Clarusway using the back command.
- Verify the current URL is https://clarusway.com/
- Again go back to the amazon website using forward command
- Verify the current URL is https://amazon.com/
- Refresh the Browser using refresh command.
- Close the Browser. */
        WebDriver driver = new ChromeDriver();
        driver.get(" https://clarusway.com/");
        driver.get("https://amazon.com/");

        driver.navigate().back();

        String pageURLW = driver.getCurrentUrl();
        if (pageURLW.equals("https://clarusway.com/")) {
            System.out.println("CurrentUrl clarusway is true");
        } else {
            System.out.println("CurrentUrl is false");
        }
        System.out.println("pageURLw = " + pageURLW);

        driver.navigate().forward();

        String pageCurrentURL = driver.getCurrentUrl();

        System.out.println(pageCurrentURL.equals("https://www.amazon.com/") ? "CurrentUrl is true" : "CurrentUrl is false");

        driver.navigate().refresh();
        driver.close();
    }
}
