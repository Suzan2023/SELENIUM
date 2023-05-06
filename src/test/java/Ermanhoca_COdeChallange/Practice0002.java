package Ermanhoca_COdeChallange;

import Utilities.Base;
import com.github.javafaker.Faker;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Practice0002 extends Base {

    Faker faker = new Faker();
    String fakemail;
    String fakeFirstName;
    String fakeLastName;
    String fakePassword;


    //Kaynak https://www.techlistic.com/p/selenium-tutorials.html

//    1. Open this url  http://automationpractice.pl/index.php
//    2. Click on sign in link.
//    3. Verify sign in page
//    3. Enter your email address in 'Create and account' section.
//    4. Click on Create an Account button.
//    5. Enter your Personal Information, Address and Contact info.
//    6. Click on Register button.
//    7. Validate that user is created.

    @Test
    public void signIn() {
        driver.get("http://automationpractice.pl/index.php");
        //    2. Click on sign in link.
        WebElement loginButton = driver.findElement(By.cssSelector(".login"));
        loginButton.click();

        //    3. Verify sign in page
        Assert.assertTrue(driver.getCurrentUrl().contains("my-account"));

        //    4. Enter your email address in 'Create and account' section.
        fakemail = faker.internet().emailAddress();
        WebElement emailCreate = driver.findElement(By.id("email_create"));
        emailCreate.sendKeys(fakemail);
        //    4. Click on Create an Account button.
        WebElement emailSubmit = driver.findElement(By.id("SubmitCreate"));
        emailSubmit.click();

        //    5. Enter your Personal Information, Address and Contact info.
        driver.findElement(By.id("uniform-id_gender1")).click();
        WebElement firstNameInput = driver.findElement(By.id("customer_firstname"));
        WebElement lastNameInput = driver.findElement(By.id("customer_lastname"));
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        WebElement dayInput = driver.findElement(By.id("days"));
        WebElement monthInput = driver.findElement(By.id("months"));
        WebElement yearInput = driver.findElement(By.id("years"));
        fakeFirstName = faker.name().firstName();
        fakeLastName = faker.name().lastName();
        fakePassword = faker.internet().password();
        firstNameInput.sendKeys(fakeFirstName);
        lastNameInput.sendKeys(fakeLastName);
        passwordInput.sendKeys(fakePassword);
        dayInput.sendKeys("1");
        monthInput.sendKeys("January");
        yearInput.sendKeys("2001");
        driver.findElement(By.id("submitAccount")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector(".alert-success")).isDisplayed());


    }

    @Test
    public void searchProduct() {
        signIn();
        Actions actions = new Actions(driver);
        WebElement womanTab = driver.findElement(By.xpath("//a[@title='Women']"));
        actions.moveToElement(womanTab).perform();
        WebElement tshirtButton = driver.findElement(By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[1]//a[.='T-shirts']"));
        tshirtButton.click();

        WebElement tshirtText = driver.findElement(By.xpath("//a[contains(.,'Faded Short Sleeve T-shirts')]"));
        String tshirtTextOutput = tshirtText.getAttribute("title");
        System.out.println(tshirtTextOutput);

        WebElement searchBarTop = driver.findElement(By.id("search_query_top"));
        searchBarTop.sendKeys(tshirtTextOutput);
        searchBarTop.submit();
     //   Assert.assertTrue("Tshirt goruntulenmedi",tshirtText.getAttribute("title").contains("Faded Short Sleeve"));
    }

}
