package EllyHocaTASKCOZUMU.Day1;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class T28_FileUploadHomework extends Base {

    //Go to URL: https://www.monsterindia.com/seeker/registration
    //Upload file.

    @Test
    public void uploadFileTest() throws InterruptedException {
        driver.get("https://www.monsterindia.com/seeker/registration");

        String filePath=System.getProperty("user.dir") + System.getProperty("file.separator") + "src/test/java/Utilities/imageCssSelector.png";

        WebElement uploadResume= driver.findElement(By.xpath("//input[@type='file']"));
        Thread.sleep(2000);
        uploadResume.sendKeys(filePath);
        Thread.sleep(2000);
        Assert.assertTrue("File is not upload successful", driver.findElement(By.xpath("//div[@class='f15']")).isDisplayed());
    }
}
