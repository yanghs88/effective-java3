package com.study.item42;

public class OperationTest {

public static void main(String[] args) {
    double plus = Operation.PLUS.apply(1, 1);
    System.out.println("result = " + plus);

    double minus = Operation.MINUS.apply(1, 1);
    System.out.println("result = " + minus);

    double times = Operation.TIMES.apply(3, 3);
    System.out.println("result = " + times);

    double divide = Operation.DIVIDE.apply(4, 2);
    System.out.println("result = " + divide);
}

}
