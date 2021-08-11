package com.study.item11;

import java.util.HashMap;
import java.util.Map;

public class Example {

    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<>();

        m.put(new PhoneNumber("010","3305","0150"), "빅터");

        String name = m.get(new PhoneNumber("010", "3305", "0150"));

        // expected = "victor , but : null
        System.out.println("name = " + name);
    }
}
