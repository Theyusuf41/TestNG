package cw.tests.Day14;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C08_HardSoftAssertions {

    @Test
    public void hardTest(){
        // Assert class ile cagiririz.
        // Test calisma sirasinda hata verirse execution hemen durdurulur.
        System.out.println();
    }


    @Test
    public void softTest(){
        // Softassertte ise obje olusturmak zorundayiz.
        // Butun sartlar saglanana kadar calismaya devam eder

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(1,1, "esit degilse yazar");
    }
}
