package Day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_WindowCommandsHomework {
    public static void main(String[] args) throws InterruptedException {

     /*  -Invoke Chrome Browser
        -Open URL: https://www.google.com/
        -Maximize the window.
        -Print the position and size of the page.
        -Minimize the page.
        -Wait 5 seconds in the icon state and maximize the page.
        -Print the position and dimensions of the page in maximized state.
        -Make the page fullscreen.
        -Close the Browser. */


        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        // maximize
        driver.manage().window().maximize();
        Thread.sleep(4000);
        //position and size
        Point currentPoint = driver.manage().window().getPosition();
        int xCoordn = currentPoint.getX();
        int yCoordn = currentPoint.getY();
        System.out.println("xCoordn = " + xCoordn);
        System.out.println("yCoordn = " + yCoordn);
        //minimize and maximize
        driver.manage().window().minimize();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        //dimension
        Dimension dimension= driver.manage().window().getSize();
        int width=dimension.getWidth();
        int height=dimension.getHeight();
        //fulsecreen
        driver.manage().window().fullscreen();

        driver.close();



    }
}
