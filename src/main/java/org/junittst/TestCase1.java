package org.junittst;

import junit.framework.Assert;
import org.junit.*;

public class TestCase1 {

    @Before
    public void beforeTests(){
        System.out.println("Before");
    }

    @Test
    public void testPrintHelloWorld() {
        System.out.println("Hello world");
    }

    @After
    public void afterTests(){
        System.out.println("After");
    }

}
