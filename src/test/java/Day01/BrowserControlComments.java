package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserControlComments {
    public static void main(String[] args) {

        //  Selenium ile calismaya baslamadan once selenium un hangi driver araciligiyla
        //browser ile iletisim kuracagini belirtmemiz gerekiyor

        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver.exe");

        //Driver yolu belirtildikten sonra yapilacak islem artik driver objesinin olusturulmasidir

        WebDriver driver = new ChromeDriver();


        //Driver ile bir siteyi acmak istersek driver objemizin get() methodunu kullaniriz
        driver.get("https://www.google.com/");


        // BROWSER CONTROL COMMANDS

        // getTitle ()  gecerli sekmenin title ini verir. String return eder.
        String pageTitle = driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);

        if (pageTitle.equals("Google")) {
            System.out.println(" Test Passed");
        } else {
            System.out.println(" Test Failed");
        }

        // getCurrentURL()  gecerli sekmedeki sitenin URL ini verir. String return eder.
        String pageURL = driver.getCurrentUrl();
        System.out.println("pageURL = " + pageURL);


        // getPageSource()  gecerli sayfanin kaynak html kodunu getirir. String return eder.
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);

        //close() gecerli olan sekmeyi kapatir. Eger tek sekme aciksa browseri kapatir
        driver.close();


        //quit() ise tum sekmeleri ve browseri kapatir
        driver.quit();

    }
}
