package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_BrowserCommands {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // BROWSER COMMANDS

      /*   Open google home page: https://www.google.com
 Verify Title on page
 Verify Current URL on page
 Close/Quit the browser  */
        driver.get("https://www.google.com/");
        String pageTitle = driver.getTitle();

        if (pageTitle.equals("Google")) {
            System.out.println(" Test Passed");
        } else {
            System.out.println(" Test Failed");
        }
        System.out.println("pageTitle = " + pageTitle);

        String pageURL = driver.getCurrentUrl();
        System.out.println("pageURL = " + pageURL);
        if (pageURL.equals("https://www.google.com/")) {
            System.out.println(" Test Passed");
        } else {
            System.out.println(" Test Failed");
        }
        driver.quit();
        System.out.println("********************************");
/*  Open google home page: https://stackoverflow.com
 Verify Title on page
 Verify Current URL on page
 Close/Quit the browser*/
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://stackoverflow.com/");
        String pageTitle1 = driver1.getTitle();
        if (pageTitle1.equals("Stack Overflow - Where Developers Learn, Share, & Build Careers")) {
            System.out.println(" Test Passed");
        } else {
            System.out.println(" Test Failed");
        }
        System.out.println("pageTitle = " + pageTitle1);
        String pageURL1 = driver1.getCurrentUrl();
        if (pageURL1.equals("https://stackoverflow.com/")) {
            System.out.println(" Test Passed");
        } else {
            System.out.println(" Test Failed");
        }
        System.out.println("pageURL = " + pageURL1);

        driver1.close();
        System.out.println("********************************");
/*  Open google home page: https://www.linkedin.com
 Verify Title on page
 Verify Current URL on page
 Close/Quit the browser */
        WebDriver driver3 = new ChromeDriver();
        driver3.get("https://www.linkedin.com/home");
        String pageTitle3 = driver3.getTitle();
        System.out.println("pageTitle3 = " + pageTitle3);
        String pageURL3 = driver3.getCurrentUrl();
        if (pageURL3.equals("https://www.linkedin.com/home")) {
            System.out.println(" Test Passed");
        } else {
            System.out.println(" Test Failed");
        }
        System.out.println("pageURL3 = " + pageURL3);
        driver3.close();

        System.out.println("********************************");


    }
}
