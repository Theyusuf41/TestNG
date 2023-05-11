package cw.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    // ToDo: getDriveri crossbrowser haline getir

    private static WebDriver driver;

    public static WebDriver getDriver(){
        // driver objesi eger olusturulmadiysa driver i olustur
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
        }
    }

}
