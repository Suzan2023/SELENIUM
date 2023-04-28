package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class C04_Actions extends Base {

    //    Go to URL: https://demoqa.com/buttons
//    Run the buttons on the page using the Actions Class.
//    Verify the texts that appear after the buttons are operated.
    @Test
    public void test01() {
        driver.get("https://demoqa.com/buttons");
        Actions actions = new Actions(driver);

        WebElement doubleClickButton =driver.findElement(By.id("doubleClickBtn"));
        WebElement rightClickButton =driver.findElement(By.id("rightClickBtn"));
        WebElement clickButton =driver.findElement(By.id("(//button)[4]"));

        actions.doubleClick(doubleClickButton).perform();
        actions.contextClick(rightClickButton).perform();
        actions.click(clickButton).perform();
    }


}
