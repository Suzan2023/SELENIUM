package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowCommands {
    public static void main(String[] args) {

        //Driver objesi olusturuldu
        System.setProperty("webdriver.chrome.driver","resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");



        // WINDOW COMMANDS

        //maximize()  pencerenin maximize edilmesini saglar (ortadaki kare butonu)
        driver.manage().window().maximize();

        //minimize() Uygulamanin minimize haline gelmesini saglar (Soldaki cizgi butonu)
        driver.manage().window().minimize();

        //fullscreen() pencerenin tam ekran olmasini saglar (F11 fullscreen)
        driver.manage().window().fullscreen();

        //



    }
}
