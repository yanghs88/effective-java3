package com.study.item40;

import java.util.HashSet;
import java.util.Set;

public class Bigram {
    private final char first;
    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }


    // 잘못 사용한 부분, Object 의 equals 를 재정의 한게 아니라, 다중정의 overloading 를 해버림.
//    public boolean equals(Bigram b) {
//        return b.first == first && b.second == second;
//    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Bigram)) {
            return false;
        }
        Bigram b = (Bigram) obj;
        return b.first == first && b.second == second;
    }

    public int hashCode() {
        return 31 * first * second;
    }

    @Override
    public String toString() {
        return "Bigram{" +
            "first=" + first +
            ", second=" + second +
            '}';
    }

    public static void main(String[] args) {
        Set<Bigram> s = new HashSet<>();

        for (int i=0; i<10; i++) {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                s.add(new Bigram(ch, ch));
            }
        }

        // expect = 26, result = 260... fail
        System.out.println("s.size() = " + s.size());
        System.out.println("s.toString() = " + s.toString());
    }
}
