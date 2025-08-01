package com.easy._03orderRecord;

class OrderLog {
    private String[] buffer;
    private int capacity;
    private int current = 0;

    public OrderLog(int n) {
        this.capacity = n;
        this.buffer = new String[n];
    }

    public void record(String orderId) {
        // add element to the current position
        buffer[current] = orderId;
        System.out.printf("Put number %s in position %d%n", orderId, current);

        //check if using the last available position
        if (current + 1 == capacity) {
            current = 0;
        } else {
            current++;
        }
    }

    public String getLast() {
        // get index used just before the current, even if it is zero
        int lastAddedIndex = (current - 1 + capacity) % capacity;
        return buffer[lastAddedIndex];
    }

    public int getCurrent() {
        return current;
    }
}

public class OrderRecordLogger {
    public static void main(String[] args) {
        final OrderLog log = new OrderLog(5);

        log.record("1");
        log.record("2");
        log.record("3");
        log.record("4");
        log.record("5");
        log.record("6");
        log.record("7");

        System.out.printf("Currtent position: %s%n", log.getCurrent());
        System.out.printf("Last added: %s", log.getLast());
    }
}


