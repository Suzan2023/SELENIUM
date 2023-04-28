package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) {

        //Driver objesi olusturuldu
        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.get("https://stackoverflow.com/");

        //NAVIGATION COMMANDS

        //back() bir onceki sayfayi acar
        System.out.println("Before navigation Title= " + driver.getTitle());
        driver.navigate().back(); //chrome
        System.out.println("After navigation Title= " + driver.getTitle());

        // Thread.sleep(3000);

        System.out.println("Before navigation Title = " + driver.getTitle());

        // forward() geri gelindikten sonra bir sonraki sayfayi acar
        driver.navigate().forward(); //stackoverflow

        // refresh() sayfayi yeniler
        driver.navigate().refresh(); // stackoverflow

        //to() -> get() methodu ile tamamen ayni islevi yapar
        driver.navigate().to("https://www.linkedin.com/in/suzan-g-26a08a62/); //stackoverflow");

        driver.quit();







    }
}
