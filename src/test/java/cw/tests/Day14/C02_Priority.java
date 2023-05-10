package cw.tests.Day14;

import org.testng.annotations.Test;

public class C02_Priority {

    // herhangi bir Priority vermezsek kafasina gore calisir. Ancak verirsek ona gore calisma duzeni olur.
    // Prioriy'nin default degeri 0 ' dir.

    @Test(priority = 2)
    public void a(){
        System.out.println("a calisiyor");
    }

    @Test(priority = 3)
    public void b(){
        System.out.println("b calisiyor");
    }

    @Test(priority = 1)
    public void c(){
        System.out.println("c calisiyor");
    }
}
