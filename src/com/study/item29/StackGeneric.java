package com.study.item29;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackGeneric<E> {

    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 1;

    // 배열을 사용한 코드를 제네릭으로 만드는 방법 1
    // 장점 : 가독성이 좋다, 코드가 짧다, 형변환을 배열 생성시 단 한번만 해주면 된다.
    // 배열 elements는 push(E)로 넘어온 E 인스턴스만 담는다
    // 따라서 타입 안정성을 보장하지만, 이 배열의 런타임 타입은 E[] 가 아닌 Object[]다.
    @SuppressWarnings("unchecked")
    public StackGeneric() {
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    // 배열을 사용한 코드를 제네릭으로 만드는 방법 2
    // 배열에 원소에서 읽을때마다 형변환을 해줘야 함.
    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        @SuppressWarnings("unchecked") E result = (E) elements[--size];
        elements[size] = null; // 다쓴 참조 해제
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
