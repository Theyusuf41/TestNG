package cw.tests.Day14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C07_Assertions {

    @Test
    public void test01(){
        Assert.assertEquals(1,1, " Sayilar esit degil");
    }
}
