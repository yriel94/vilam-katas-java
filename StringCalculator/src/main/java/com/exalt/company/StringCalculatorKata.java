package com.exalt.company;

import java.util.Arrays;
import java.util.List;

public class StringCalculatorKata {

    int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String[] separatedNumbers = numbers.split(",");
        List<String> listOfNumbers = Arrays.asList(separatedNumbers);

        return listOfNumbers.stream()
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }
}
