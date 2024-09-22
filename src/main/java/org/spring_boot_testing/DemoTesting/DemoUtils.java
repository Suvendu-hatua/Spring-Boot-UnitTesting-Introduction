package org.spring_boot_testing.DemoTesting;

public class DemoUtils {
    public int addition(int a,int b){
        return a+b;
    }
    public Object nullCheck(Object object){
        if(object!=null){
            return object;
        }
        return null;
    }
}
