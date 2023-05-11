package cw.tests.Days20;

import cw.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class C01_DriverClas {
    @Test
    public void tst01(){
        // WebDriveri initialize etmek icin iki farkli yontem var :
        //WebDriver driver = Driver.driver().get("https://www.amazon.com");
        Driver.getDriver().get("https://www.amazon.com");
    }
}
