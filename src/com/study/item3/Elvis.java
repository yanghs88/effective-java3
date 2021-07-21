package com.study.item3;

// public static final field 방식의 싱글턴
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public void leaveTheBuilding() {
    }
}
