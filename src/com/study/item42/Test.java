package com.study.item42;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("AAA", "AA", "A");

        // 익명 클래스 - 낡은 기법!!!
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        System.out.println("words = " + words);


        // 람다식 이용, 익명함수 대체
        List<String> words2 = Arrays.asList("BBB", "BBBBBB", "BBBB");
        Collections.sort(words, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
        System.out.println("words2 = " + words);


        // 비교자 생성 메서드 사용하는 방법
        List<String> words3 = Arrays.asList("abcd", "abcdefg", "abc");
        Collections.sort(words3, Comparator.comparingInt(String::length));
        System.out.println("words3 = " + words3);


    }


}
