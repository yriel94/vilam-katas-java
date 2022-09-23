package com.exalt.company;

import java.util.Arrays;
import java.util.List;

public class StringCalculatorKata {

    int add(String numbers) {
        String separator = ",\\n";
        String newSeparator = "";

        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        if (numbers.length() > 3) {
            newSeparator = numbers.substring(0, 3);

            if (newSeparator.charAt(0) == '/' && newSeparator.charAt(1) == '/') {
                separator = separator.concat(newSeparator.substring(2, 3));
                numbers = numbers.substring(3);
            }
        }

        String[] separatedNumbers = numbers.split("[" + separator +"]");
        List<String> listOfNumbers = Arrays.asList(separatedNumbers);

        return listOfNumbers.stream()
                .filter(number -> !number.isEmpty())
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }
}
