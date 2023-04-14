package Day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowCommand2 {
    public static void main(String[] args) throws InterruptedException {
        //Driver objesi olusturuldu
        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");


        //getPosition()  browser'imizin suanki pozisyonunu verir. Point objesi return eder

        Thread.sleep(7000);
        Point currentPoint = driver.manage().window().getPosition();

        int xCoord = currentPoint.getX();  // Bulunan noktanin x koordinatini verir
        int yCoord = currentPoint.getY();  // Bulunan noktanin y koordinatini verir
        System.out.println("xCoord = " + xCoord);
        System.out.println("yCoord = " + yCoord);

        //getSize()   browser imizin suanki en ve boyunu verir

        Dimension currentSize = driver.manage().window().getSize();

        int width = currentSize.getWidth();  // browser in enini verir
        int height = currentSize.getHeight();  // browser in boyunu verir

        System.out.println("width = " + width);
        System.out.println("height = " + height);

        driver.quit();
    }
}
