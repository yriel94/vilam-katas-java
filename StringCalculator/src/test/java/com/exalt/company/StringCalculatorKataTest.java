package com.exalt.company;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringCalculatorKataTest {
    @Test
    void numbersIsNullShouldReturnZero() {
        StringCalculatorKata stringCalculator = new StringCalculatorKata();
        assertEquals(0, stringCalculator.add(null));
    }

	@Test
    void numbersIsEmptyShouldReturnZero() {
        StringCalculatorKata stringCalculator = new StringCalculatorKata();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void numbersContainsOneNumberShouldReturnNumbers() {
        StringCalculatorKata stringCalculator = new StringCalculatorKata();
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    void numbersContainsTwoNumberShouldReturnTheSumOfNumbers() {
        StringCalculatorKata stringCalculator = new StringCalculatorKata();
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    void numbersContainsFourNumberShouldReturnTheSumOfNumbers() {
        StringCalculatorKata stringCalculator = new StringCalculatorKata();
        assertEquals(17, stringCalculator.add("1,2,5,9"));
    }

    @Test
    void numbersContainsTenNumberShouldReturnTheSumOfNumbers() {
        StringCalculatorKata stringCalculator = new StringCalculatorKata();
        assertEquals(42, stringCalculator.add("1,2,5,9,1,10,11,1,1,1"));
    }
}
