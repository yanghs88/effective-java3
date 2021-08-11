package com.study.item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    //보안 허점이 숨어있다. 길이가 0이 아닌 배열은 모두 변경이 가능하다.(?)
    public static final Thing[] VALUES = new Thing[]{Thing.A, Thing.B, Thing.C};

    private static final Thing[] PRIVATE_VALUES = {Thing.A, Thing.C, Thing.B};

    public static final List<Thing> VALUES2 = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    private static final Thing[] values() {
        return PRIVATE_VALUES.clone();
    }

    public static void main(String[] args) {

        for (Thing value : Test.VALUES) {
            System.out.println("value = " + value.name());
        }

        System.out.println("==========================");

        for (Thing value2 : VALUES2) {
            System.out.println("thing = " + value2);
        }

        System.out.println("==========================");

        for (Thing value3 : values()) {
            System.out.println("value = " + value3);
        }
    }
}
