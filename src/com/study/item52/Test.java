package com.study.item52;

public class Test {

    public static void main(String[] args) {

        // 내부적으로는 Integer a = new Integer(3); 으로 변환하여 동작
        Integer a = 3;
        // Object o = new Integer(3); 으로 동작하여 다형성 적용
        Object o = 3;

    }
}
