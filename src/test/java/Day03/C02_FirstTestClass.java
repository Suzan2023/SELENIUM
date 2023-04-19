package Day03;

import org.junit.*;

public class C02_FirstTestClass {

    @Before
    public void beforeTestMethod() {
        System.out.println("\tTestten once yapilacak islemler yapildi");
    }


    @Test              //@Test annotations eklenir
    public void test01() {

        System.out.println("\t\tTest executed....");
    }

    @Test
    public void test02() {
        System.out.println("\t\tTest02 executed....");
    }
    @Ignore
    @Test
    public void test03() {
        System.out.println("\tIgnore edildi");
    }

    @After
    public void afterTestMethod() {
        System.out.println("\tBrowser imiz kapatildi...");
    }

    @BeforeClass
    public static void beforeClassMethod() {
        System.out.println("Before class calisti");    }
    @AfterClass
    public static void afterClassMethod() {
        System.out.println("After class calisti"); }
    }



