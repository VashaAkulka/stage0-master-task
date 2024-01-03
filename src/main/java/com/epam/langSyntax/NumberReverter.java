package com.epam.langSyntax;

public class NumberReverter {
    public void revert(int number) {
        String num = String.valueOf(number);

        num = new StringBuilder(num).reverse().toString();
        System.out.println(num);
    }
}
