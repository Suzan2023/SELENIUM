package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class BaseReport {

    protected WebDriver driver; // baska package lardan extende edilen class lar icin protected
    protected Actions actions; //actions metodu olusturuldu,diger claslarda actionsu cagirirken kullanmak icin
    protected Faker faker = new Faker();

    protected static ExtentReports extentReports; // raporlama islemini gerceklestirir

    protected static ExtentSparkReporter extentHtmlReporter; // raporu HTML olarak duzenler

    protected static ExtentTest extentTest; // testimizin pass veya fail oldugunu saklayan objemiz. Ekran goruntuleri icin de kullanilir
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        actions=new Actions((driver));

        //Extent report objelerimizi de olusturuyoruz
        extentReports = new ExtentReports();

        // Kaydedecegimiz dosya icin tarih stringi olusturuldu
        String currentDate = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
        String filePath = System.getProperty("user.dir") + "/test-output/reports/testReport_" + currentDate + ".html";

        // HTML raporu olusturacak obje dosya yoluyla initialize edildi
        extentHtmlReporter = new ExtentSparkReporter(filePath);

        // Raporlama yapan extentreport objemize HTML reporter baglandi
        extentReports.attachReporter(extentHtmlReporter);

        // Rapor ile alakali ekstra opsiyonel bilgiler verildi
        extentReports.setSystemInfo("Environment", "QA");
        extentReports.setSystemInfo("Browser", "Chrome");
        extentReports.setSystemInfo("Tester", "Karl");

        // HTML raporunda goruntulemek istedigimiz konfigurasyonlar yapildi
        extentHtmlReporter.config().setDocumentTitle("CWReport");
        extentHtmlReporter.config().setReportName("Test run report");
    }

    @After
    public void teardown(){
        //driver.quit();
    }

    @AfterClass
    public static void afterClass(){
        extentReports.flush();
    }


    public void waitAndClick(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void waitForVisibility(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));

    }






}
