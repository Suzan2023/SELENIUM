package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_WindowCommands {
    public static void main(String[] args) {

        /* Invoke Chrome Browser
Open URL: https://www.google.com/
Maximize the window.
Minimize the page.
Make the page fullscreen. */
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();








    }
}
