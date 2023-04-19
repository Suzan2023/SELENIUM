package Day03;

import org.junit.Assert;
import org.junit.Test;

public class C04_AssertionMethods {

    @Test
    public void assertEqualsTest() {
        // 2 parametre alirsa parametreler karsilastirilir ve esitlerse test passed olur esit degilse AssertionError firlatilir

        Assert.assertEquals(1, 1);

    }

    @Test
    public void assertTrueTest() {
        // 1 parametre alir ve gonderilen parametrenin true olmasi durumunda testimiz passed false olmasi durumnda failed olur
        Assert.assertTrue(true);
    }

    @Test
    public void assertFalseTest() {
        // 1 parametre alir ve gonderilen parametrenin true olmasi durumunda testimiz failed false olmasi durumnda passed olur
        Assert.assertFalse(false);
    }

    @Test
    public void assertNullTest() {
        //Bir parametre alir. Parametre null ise test passed, null degil ise test failed olur
        Assert.assertNull(null);
    }

    @Test
    public void assertNotNullTest() {
        //Bir parametre alir. Parametre null degil ise test passed, null ise test failed olur
        Assert.assertNotNull(5);
    }

    @Test
    public void assertSameTest() {
        // Obje kontrolu deger ve adresler!!!!! ayni olmalidir
        // parametre olarak verilen iki nesnenin aynı nesneye karşılık gelip gelmediğini kontrol eder.
        //Eğer nesneler aynı nesneyi karşılamıyor ise assertionError hatası fırlatır
        Assert.assertSame(new String("Suzan"),new String( "Suzan"));
      //  Assert.assertSame(15,15);
    }

    @Test
    public void assertNotSameTest() {
        //parametre olarak verilen iki nesnenin birbirine eşit olmadığı kontrolünü eder.
        //Eğer aynı nesneye karşılık geliyor ise assertionError hatası fırlatır.
        Assert.assertNotSame(new String("Suzan"), new String("Suzan")); //test passed
    }

    @Test
    public void assertArrayEqualsTest() {
        // 2parametre alir ve verilen arraylarin uzunluklari ve ayni indexteki elemanlarinin birbirine eşit olmali
        int[] arr1 = {1, 2, 3, 4, 5}, arr2 = {1, 2, 3, 4, 5};

        Assert.assertArrayEquals(arr1, arr2);
    }

    @Test
    public void assertEqualsWithMessage() {
        Assert.assertEquals("Bu degerler esit degildir",1,5);
    }

}
