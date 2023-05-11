package cw.tests.Days20;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;

public class C02_ParallelExecution {

    @Test
    public void test01(){
        long id = Thread.currentThread().getId();
        System.out.println("Current threadId is " + id);
    }

    @Test
    public void test02(){
        long id = Thread.currentThread().getId();
        System.out.println("Current threadId is " + id);
    }

    @Test
    public void test03(){
        long id = Thread.currentThread().getId();
        System.out.println("Current threadId is " + id);
    }

    @Test
    public void test04(){
        long id = Thread.currentThread().getId();
        System.out.println("Current threadId is " + id);
    }


    @Test
    public void test05(){
        long id = Thread.currentThread().getId();
        System.out.println("Current threadId is " + id);
    }
}
