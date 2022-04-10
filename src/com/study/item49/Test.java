package com.study.item49;

import java.util.Objects;

public class Test {

    public static void main(String[] args) {

//        Integer test = null;
//        Integer integer = Objects.requireNonNull(test, "에러 발생!!!");
//        System.out.println("integer = " + integer);

        int[] items = {1, 2, 3, 4};

        try {
            sort(null, -1, 5);
        } catch (AssertionError ex) {
            System.out.println("ex = " + ex);
        }
    }

    private static void sort(int a[], int offset, int length) {
        assert a != null;
        assert offset >= 0 && offset <= a.length;
        assert length >= 0 && length <= a.length - offset;

        System.out.println("유효성 검증 통과");
    }
}
