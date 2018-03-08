package org.junittst;


import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;

public class TestParameterized {

    @ParameterizedTest
    @ValueSource(strings = { "race-car", "radar", "able was I ere I saw elba" })
    void palindromes(String candidate) {
    }


}
