package Day02;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Position;

public class Homework_setSizeSetPosition {
    public static void main(String[] args) throws InterruptedException {

    /*   -Go to the Amazon URL : https://www.amazon.com/
        -Print the position and size of the page.
        -Adjust the position and size of the page as desired.
        -Test that the page is in the position and size you want.
        -Close the page.  */

        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        Point currentPoint= driver.manage().window().getPosition();
        int xCo= currentPoint.getX();
        int yCo= currentPoint.getY();
        System.out.println("xCo = " + xCo);
        System.out.println("yCo = " + yCo);

        System.out.println("size of the page = " + driver.manage().window().getSize());

        Point point= new Point(200,340);
        driver.manage().window().setPosition(point);

        System.out.println("Current position = " + driver.manage().window().getPosition().toString());
        if (driver.manage().window().getPosition().equals(point)){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }
        driver.manage().window().setPosition(new Point(700,500));

        driver.close();


    }
}
