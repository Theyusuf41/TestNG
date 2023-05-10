package cw.tests.Day16;

import org.testng.annotations.Test;

public class C01_Groups {
    @Test (groups = {"smoke"})
    public void smokeTest(){
        System.out.println("smoke test reunning");
    }

    @Test (groups = {"regression"})
    public void regressionTest(){
        System.out.println("Regression test running");
    }
    @Test (groups = {"smoke", "regression"})
    public void smokeRegressionTest(){
        System.out.println("Smoke and regression test running");
    }


}
