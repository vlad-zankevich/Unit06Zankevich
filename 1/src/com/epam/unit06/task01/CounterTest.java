package com.epam.unit06.task01;

public class CounterTest {
    public static void main(String[] args) {

        Counter counter = new Counter();
        Counter counter1 = new Counter();
        counter.increase();
        counter.increase();
        counter1.increase();

        System.out.println(counter.getCurrent());
        System.out.println(counter1.getCurrent());
        System.out.println(counter.getMin());
        System.out.println(counter.getMax());

        Counter counter2 = new Counter(-1, 5);

        System.out.println(counter2.getCurrent());
        System.out.println(counter2.getMin());
        System.out.println(counter2.getMax());

        Counter counter3 = new Counter(1, 6, 8);
        counter3.increase();

        System.out.println(counter3.getCurrent());
        System.out.println(counter3.getMin());
        System.out.println(counter3.getMax());

        counter.reset();

        System.out.println(counter.getCurrent());
    }
}
