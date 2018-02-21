package org.junittst;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCase1 {

    public void beforeTests(){
        System.out.println("Before 1");
    }

    @Test
    public void testPrintHelloWorld() {
        System.out.println("Hello world 1");
    }

    public void afterTests(){
        System.out.println("After 1");
    }

}
