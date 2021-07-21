package com.study.item6;

public class Test {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        sum();

        long duration = System.currentTimeMillis() - startTime;
        System.out.println("autoboxing = " + duration);

        long startTime2 = System.currentTimeMillis();
        sum2();

        long duration2 = System.currentTimeMillis() - startTime2;
        System.out.println("duration2 = " + duration2);
    }

    // 오토박싱이 되어있는 잘못된 사용방법
    private static long sum() {
        Long sum = 0L;

        for (long i = 0; i<= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }

    private static long sum2() {
        long sum = 0L;

        for (long i = 0; i<= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }


}
