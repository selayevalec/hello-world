package org.junittst;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;



public class TestCase1 {

    @Before
    public void beforeTests(){
        System.out.println("Before 1");
    }

    @Test
    public void testPrintHelloWorld() {
        System.out.println("Hello world 1");
    }

    @After
    public void afterTests(){
        System.out.println("After 1");
    }

}
