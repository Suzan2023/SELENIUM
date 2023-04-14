package Day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxVerifyTitle {
    //             Invoke FireFox Driver
    //             Go to https://www.youtube.com/
    //             Verify the page title contains the word video.
    //             Close the driver.


    public static void main(String[] args) {

        //Driver objesi olusturuldu
        System.setProperty("webdriver.gecko.driver", "resources/driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();

        driver.quit();

        if (actualTitle.contains("Video")) {
            System.out.println("TEST PASSED....");
        } else {
            System.out.println("TEST FAILED....");
        }
        driver.quit();


    }
}
