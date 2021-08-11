package com.study.item7;

import java.util.EmptyStackException;

public class StackTest {

    public static void main(String[] args) {

        try {
            Stack stack = new Stack();
            stack.push("aaa");
            stack.push("bbb");
            stack.push("ccc");

            Object pop = stack.pop();
            stack.pop();
            stack.pop();

            stack.push("ddd");
            stack.push("eee");

            System.out.println("pop = " + pop);
            System.out.println("stack = " + stack.toString());
        }
        catch (EmptyStackException e) {
            System.out.println("e = " + e);
            System.out.println("!!!! error = " + e.getMessage());
        }

    }
}
