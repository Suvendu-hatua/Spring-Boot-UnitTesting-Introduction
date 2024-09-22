package spring_boot_testing.DemoTesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.spring_boot_testing.DemoTesting.DemoUtils;

class DemoUtilsTest {

    @Test
    public void equalNotEqualTest(){
        DemoUtils demoUtils=new DemoUtils();
        int expected=10;
        Assertions.assertEquals(expected,demoUtils.addition(4,6),"addition of 4,6 must be 10");
    }
}
