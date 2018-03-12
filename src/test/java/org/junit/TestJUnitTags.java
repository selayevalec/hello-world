package org.junit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Tag")
public class TestJUnitTags {


    @Test
    @Tag("Hello")
    public void TestHello(){

        System.out.println("Hello world with tag");
    }

    @Test
    @Tag("Farewell")
    public void TestHello2(){

        System.out.println("Farewell world with tag 2");
    }


}
