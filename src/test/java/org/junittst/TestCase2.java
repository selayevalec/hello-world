package org.junittst;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TestCase2 {



    public void beforeTests(){
        System.out.println("Before 2");
    }

    @Test
    public void testPrintHelloWorld() {
        System.out.println("Hello world 2");
    }

    @Test
    public void testPrintHelloWorld2() {
        System.out.println("Hello world 2.2");
    }

    @Test
    @Tag("test.it.fast")
    public void testPrintHelloWorld3() {
        System.out.println("Hello world 2.3");
    }


    public void afterTests(){
        System.out.println("After 2");
    }
}
