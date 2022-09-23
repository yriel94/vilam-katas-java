package com.exalt.company;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorKataTest {
    @ParameterizedTest
    @MethodSource
    void sumNumbersSeparatedByAnySeparator(String numbers, int result) {
        StringCalculatorKata stringCalculator = new StringCalculatorKata();
        assertEquals(result, stringCalculator.add(numbers));
    }

    private static Stream<Arguments> sumNumbersSeparatedByAnySeparator() {
        return Stream.of(
                Arguments.of(null, 0),
                Arguments.of("", 0),
                Arguments.of("1", 1),
                Arguments.of("1,2", 3),
                Arguments.of("1,2,5,9", 17),
                Arguments.of("1,2,5,9,1,10,11,1,1,1", 42),
                Arguments.of("1\n2,3", 6),
                Arguments.of("//;\n1;2", 3));
    }

}
