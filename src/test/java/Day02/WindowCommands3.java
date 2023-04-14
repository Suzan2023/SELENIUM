package Day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowCommands3 {
    public static void main(String[] args) {
        //Driver objesi olusturuldu
        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");


        //setPosition(Point point)
        Point point= new Point(960,540);
        driver.manage().window().setPosition(point);

        System.out.println("Current position = " + driver.manage().window().getPosition().toString());
     //   System.out.println("driver.manage().window().getPosition().toString() = " + driver.manage().window().getPosition().toString());


        //setSize(Dimension dimension)
        driver.manage().window().setSize(new Dimension(500,500));
        System.out.println("Browser size = " + driver.manage().window().getSize());

        driver.quit();


    }
}
