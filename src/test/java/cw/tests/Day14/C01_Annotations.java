package cw.tests.Day14;

import org.testng.annotations.*;

public class C01_Annotations {
    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("beforeSuit");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("afterSuit");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");

    }

    @Test
    public void test01(){
        System.out.println("test01");

    }

    @Test
    public void test02(){
        System.out.println("test02");

    }
}
