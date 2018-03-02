package org.junittst;

import org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;


public class TestCase1 {

    @Test
    public void testPrintHelloWorld() { System.out.println("Hello world 1"); }

    @Test
    public void testAssumption() { assumeTrue("CI".equals("CI")); }


    @Disabled("for demonstration purposes")
    public void afterTests() {
        System.out.println("After 1");
    }


    @Disabled("for demonstration purposes")
    public void beforeTests() {
        System.out.println("Before 1");
    }

}
