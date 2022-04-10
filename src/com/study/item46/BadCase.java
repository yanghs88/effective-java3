package com.study.item46;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class BadCase {

    public static void main(String[] args) {

        // 스트림 패러다임을 이해하지 못한채 사용, - 따라하지 말것
        // 스트림 코드를 가장한 반복적 코드, 이점 살리지 못함, 길고, 읽기 어렵고, 유지보수에도 좋지 않다.
        // 외부 상태를 수정하는 람다 실행 문제;
        Map<String, Long> freq = new HashMap<>();

//        try (Stream<String> words = new Scanner(file).tokens()) {
//            words.forEach(word -> {
//                freq.merge(word.toLowerCase(), 1L, Long::sum);
//            });
//        }


    }
}
