package com.study.item6;

public class NumberCheckerClient {

    public static void main(String[] args) {

        String text = "one: 1, two: 2\n";

        boolean number = NumberChecker.isNumber(text);
        System.out.println("test = " + number);

        NumberChecker.test(text);

        System.out.println("static method = " + isNumber(text));

    }

    static boolean isNumber(String text) {
        return text.matches("\\d");

    }
}
