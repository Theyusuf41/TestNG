package cw.tests.Day14;

import org.testng.annotations.Test;

public class C05_TimeOut {

    // Bir methodun max calisma suresini set eder
    // Timeout suresini gecerse kod exception firlatir.

    @Test(timeOut = 1000)
    public void test01(){
        System.out.println("1 sn surecek");
    }

    @Test(timeOut = 1000)
    public void test02() throws InterruptedException {
        System.out.println("Test gecmiyor uzun uzun");
        Thread.sleep(1001);
    }
}
