package com.epam.langSyntax;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        number = number % 100 / 10 + number % 10 + number / 100;
        System.out.println(number);
    }
}
