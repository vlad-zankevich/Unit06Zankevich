package com.epam.unit06.task01;


public class Counter {

    private final int min;
    private final int max;

    private int current;

    public Counter() {

        min = 0;
        max = 100;

        current = min;
    }

    public Counter(int _min, int _max) {
        if(_min >= _max) {
            throw new RuntimeException("Counter Min value must be less then Max value.");
        }

        min = _min;
        max = _max;

        current = min;
    }

    public Counter(int _min, int _max, int _start) {
        if(_min >= _max) {
            throw new RuntimeException("Counter Min value must be less then Max value.");
        }
        if(_start < _min || _start > _max) {
            throw new RuntimeException("Counter Start value must be within the Min and Max values");
        }

        min = _min;
        max = _max;

        current = _start;
    }

    public void increase() {
        int increse = current + 1;
        if (increse <= max) {
            current = increse;
        }
    }

    public void decrease() {
        int decrease = current - 1;
        if (decrease >= min) {
            current = decrease;
        }
    }

    public void reset () {
        current = 0;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getCurrent() {
        return current;
    }

}
