package org.junittst;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCase3 {

    @Before
    public void beforeTests(){
        System.out.println("Before 3");
    }

    @Test
    public void testPrintHelloWorld() {
        System.out.println("Hello world 3");
    }

    @After
    public void afterTests(){
        System.out.println("After 3");
    }
}
