package com.study.item30;

import java.util.HashSet;
import java.util.Set;

public class Test {

    // 로 타입 사용 문제가 있는 메서드 - badCase
    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    // 제네릭 메서드 - goodCase
    public static <E> Set<E> union2(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        // 컴파일은 되지만 경고 발생 bad case
        Set union = union(Set.of("a"), Set.of(2222));
        System.out.println("union.toString() = " + union.toString());

        // good case
        Set<String> mens = Set.of("victor", "kj", "berry");
        Set<String> womens = Set.of("hazel", "juana");;
        Set<String> team = union2(mens, womens);
        System.out.println("team = " + team);


        Set<Integer> score1 = Set.of(1,2,3);
        Set<Integer> score2 = Set.of(4,5,6);;
        Set<Integer> scoreList = union2(score1, score2);
        System.out.println("scoreList = " + scoreList);
    }

}
