package org.junit;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestParameterized {

    @ParameterizedTest
    @ValueSource(strings = { "race-car", "radar", "able was I ere I saw elba" })
    void palindromes(String candidate) {
    }


}
