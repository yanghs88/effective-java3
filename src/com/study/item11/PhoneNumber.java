package com.study.item11;

import java.util.Objects;

public class PhoneNumber {

    private String firstNumber;
    private String middleNumber;
    private String lastNumber;

    public PhoneNumber(String firstNumber, String middleNumber, String lastNumber) {
        this.firstNumber = firstNumber;
        this.middleNumber = middleNumber;
        this.lastNumber = lastNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(firstNumber, that.firstNumber) && Objects
            .equals(middleNumber, that.middleNumber) && Objects
            .equals(lastNumber, that.lastNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNumber, middleNumber, lastNumber);
    }
}
