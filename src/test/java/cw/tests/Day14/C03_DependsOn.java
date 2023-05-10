package cw.tests.Day14;

import org.testng.annotations.Test;

public class C03_DependsOn {
    @Test
    public void test01(){
        System.out.println("01");
    }

    @Test(
            dependsOnMethods = {"test01" , "test03"}
    )


    public void test02(){
        System.out.println("02");
    }

    @Test
    public void test03(){
        System.out.println("03");
    }


}
