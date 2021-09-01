package com.study.item29;

import java.util.stream.IntStream;

public class StackTest {

    public static void main(String[] args) {
        Stack stack = new Stack();
        IntStream.rangeClosed(1, 20).mapToObj(i -> "test" + i).forEach(stack::push);
        IntStream.rangeClosed(1, 20).forEach(it -> System.out.println("stack = " + stack.pop()));
    }

}
