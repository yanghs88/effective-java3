package com.study.item52;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetList {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        System.out.println(set + " " + list);
        //[-3, -2, -1, 0, 1, 2] [-3, -2, -1, 0, 1, 2]

        for (int i = 0; i < 3; i++) {
            set.remove(i);
            // list.remove()는 Object를 받는 경우와 index(int)를 받는 경우 두가지 형태로 다중정의 되어있는데, 여기서 넘긴 i값을 integer로 해석해서 인덱스로 삭제하는 일이 발생한다.
            list.remove(i);
//            list.remove(new Integer(i));
        }
        System.out.println(set + " " + list);

        // 비정상 [-3, -2, -1] [-2, 0, 2]
        // 정상 [-3, -2, -1] [-3, -2, -1]
    }
}
