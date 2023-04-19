package Day03;

import junit.framework.Assert;
import org.junit.Test;

public class C03_Assertions {

    public int divide(int a, int b) {
        return a / b;
    }
    // divide diye bir fonksiyon var 2 parametre alir ilk parametreyi ikinciye boler. Bu method u bizim icin test eder misin?

    // Senaryo 1: Birbirine tam bolunen iki sayi methoda saglanirsa cikti bolumleri olmalidir. ORN divide(10,2) == 5

    // Senaryo 2: Birbirine tam bolunemeyen iki sayi methoda saglanirsa cikti virgullu sayi olmali? ORN: 5,2 == 2.5


    @Test
    public void scenario1() {
        int expected = 5;
        int actual = divide(10, 2);

        //Assert.assertEquals() metodu icerisine gonderilen 2 deger esitligi sagliyor mu kontrol eder
        // Degerler esit degil ise AssertionError firlatilir

        Assert.assertEquals(expected, actual);

        //Expected==actual?
    }

    @Test
    public void secanario2() {
        double expected = 2.5;
        double actual = divide(5, 2);

        //assertTrue() methodu icerisine gonderilen boolean ifade true olursa test passed olur false olursa failed olur
        //AssertionError firlatilir

        Assert.assertTrue(expected==actual);

    }




}
