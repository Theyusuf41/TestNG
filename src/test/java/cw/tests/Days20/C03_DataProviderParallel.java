package cw.tests.Days20;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C03_DataProviderParallel {

    @Test(dataProvider = "data")
    public void test01(String email, String sifre, String hataMesaji){
        System.out.println("Siteye git");
        System.out.println("Kullanici adina "  + email + " yaz");
        System.out.println("Sifreye adina "  + sifre + " yaz");
        System.out.println("Hata mesaji "  + hataMesaji + " oldugunu dogrula");


    }


    // Bu kisimda iki boyutlu Array seklinde datalar olusturulur.
    @DataProvider
    public Object[][] data(){

        // Excelden veri okunup array icine yazilir
        Object[][] data = new Object[6][3];
        data[0] = new Object[]{"yuusf@gmail.com" , "Aa1" , "6 harften kisa"};
        data[1] = new Object[]{"yusuf@gmail.com" , "Aa1asdasdassdasdasasdasd" , "20 harften kisa"};
        data[2] = new Object[]{"yusuf@gmail.com" , "AAAAAA1" , "Kucuk harf yok"};
        data[3] = new Object[]{"yusuf@gmail.com" , "aaaaa1" , "Buyuk harf yok"};
        data[4] = new Object[]{"yusuf@gmail.com" , "Aaaaaaaa" , "Sayi yok"};
        data[5] = new Object[]{"yusuf@gmail.com" , "AAAAaa1" , "Ozel karakter yok"};
        return data;

    }
}
