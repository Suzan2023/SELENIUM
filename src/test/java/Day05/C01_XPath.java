package Day05;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_XPath extends Base {

    @Test
    public void test01() throws InterruptedException {  //pozitif test senario

        // https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesine git
        //
        //


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//*[@placeholder][@type]"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(4000);

        String actualUrl= driver.getCurrentUrl();
        String expectedUrl= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

        Assert.assertEquals(expectedUrl, actualUrl);

    }
    @Test
    public void test02(){   //negatif test senario
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement username= driver.findElement(By.xpath("//input[starts-with(@name,'user')][contains(@placeholder,'name')"));
        username.sendKeys("Karl");

        WebElement password= driver.findElement(By.xpath("//input[contains(@type,'pass')]"));
        password.sendKeys("admin123");

        WebElement loginButton= driver.findElement(By.xpath("//button[contains(.,'Login')]"));
        loginButton.click();


    }

}
