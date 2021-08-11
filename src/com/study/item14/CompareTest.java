package com.study.item14;

import java.util.Comparator;

public class CompareTest {
    /**
     * 하지말것!
     * 해시코드 값의 차를 기준으로 하는 비교자 - 추이성을 위배한다.
     * 정수 오버플로우를 일으키거나 부동소수점 계산 방식에 따른 오류. 빠르지도 않다.
     */
    static Comparator<Object> hashCodeOrder = (o1, o2) -> o1.hashCode() - o2.hashCode();

    /**
     * 정적 compare 메서드를 활용한 비교자
     */
    static Comparator<Object> hashCodeOrder1 = (o1, o2) -> Integer.compare(o1.hashCode(), o2.hashCode());

    /**
     * 비교자 생성 메서드를 활용한 비교자
     */
    static Comparator<Object> hashCodeOrder2 = Comparator.comparingInt(o -> o.hashCode());

    public static void main(String[] args) {
        int compare = hashCodeOrder.compare(1, 10);
        System.out.println("compare = " + compare);

        System.out.println("===========================");

        int compare1 = hashCodeOrder1.compare(1, 10);
        System.out.println("compare1 = " + compare1);

        System.out.println("===========================");
        int compare2 = hashCodeOrder2.compare(1, 10);
        System.out.println("compare2 = " + compare2);
    }

}
