package com.study.item6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberChecker {
    private static final Pattern NUMBER_PATTERN = Pattern.compile("\\d");

    public static boolean isNumber(String text) {
        return NUMBER_PATTERN.matcher(text).matches();
    }

    public static void test(String text) {
        final Matcher matcher = NUMBER_PATTERN.matcher(text);
        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }

    }
}
