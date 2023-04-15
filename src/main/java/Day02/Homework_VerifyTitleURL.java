package Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_VerifyTitleURL {
    public static void main(String[] args) {

        /*  Invoke Chrome Driver
            Navigate to Facebook homepage URL: https://www.facebook.com/
            Verify expected equals actual URL.
            Verify expected contains Facebook Word.

       (Testleri gerceklestirmeyi unutmayin) */

        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        String actualURL = driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        if (actualURL.equals("https://www.facebook.com")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }

        if (actualURL.equals("Facebook")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }
        driver.close();


    }
}
