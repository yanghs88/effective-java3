package com.study.item3;

public class TicketMaker {
    private static final TicketMaker INSTANCE = new TicketMaker();
    private TicketMaker() {
    }
    public static TicketMaker getInstance() {
        return INSTANCE;
    }

    private int ticket = 0;
    public int getNextTicketNumber() {
        return ticket++;
    }

    public static void main(String[] args) {
        TicketMaker.getInstance().getNextTicketNumber()

    }
}

