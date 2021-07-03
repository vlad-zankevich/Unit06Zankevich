package com.epam.unit06.task02;

import java.util.Arrays;

public class TestTime {

    public static void main(String[] args) {

        Time time = new Time();

        time.setCurrentTime(10, 55, 41);

        System.out.println(Arrays.toString(time.getCurrentTime()));

        time.setHour(4);

        System.out.println(Arrays.toString(time.getCurrentTime()));

        time.setSec(80);

        System.out.println(Arrays.toString(time.getCurrentTime()));
    }
}
