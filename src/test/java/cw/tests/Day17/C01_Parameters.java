package cw.tests.Day17;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C01_Parameters {

    // XMl icinde tanimlanan parametreler sirasiyla okunur.
    // Parametreler sadece String olmak zorunda degil ancak conversion yapmamiz gerekebilir

    @Test
    @Parameters("isim")
    public void parameterizedTest(String isim){
        System.out.println("Hello " + isim);

    }


    @Test
    @Parameters({"isim", "soyisim"})
    public void twoParameterTest(String isim, String soyisim){
        System.out.println(isim + soyisim);
    }


}
