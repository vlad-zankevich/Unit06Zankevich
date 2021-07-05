package com.epam.unit06.task02;

public class Time {

    private int hour;
    private int minute;
    private int sec;

    private int [] currentTime;

    public Time() {
        hour = 0;
        minute = 0;
        sec = 0;
        currentTime = new int[] {hour, minute, sec};
    }

    public Time(int _hour, int _minute, int _sec) {

        currentTime = new int[] {0, 0, 0};

        if (_hour > 24) {
            hour = 0;
        } else {
            hour = _hour;
            currentTime[0] = _hour;
        }

        if (_minute > 60) {
            minute = 0;
        } else {
            minute = _minute;
            currentTime[1] = _minute;
        }

        if (_sec > 60) {
            sec = 0;
        } else {
            sec = _sec;
            currentTime[2] = _sec;
        }
    }

    public void setCurrentTime(int hour, int minute, int sec) {

        if (hour <= 24) {
            this.hour = hour;
            currentTime[0] = hour;
        } else {
            throw new RuntimeException("Hours number can't be more than 24");
        }

        if (minute <= 60) {
            this.minute = minute;
            currentTime[1] = minute;
        } else {
            throw new RuntimeException("Minutes can't be more than 60");
        }

        if (sec <= 60) {
            this.sec = sec;
            currentTime[2] = sec;
        } else {
            throw new RuntimeException("Seconds can't be more than 60");
        }

    }

    public void setSec (int sec) {
        if (sec <= 60) {
            this.sec = sec;
            currentTime[2] = sec;
        } else {
            throw new RuntimeException("Seconds can't be more than 60");
        }
    }

    public void setMinute (int minute) {
        if (minute <= 60) {
            this.minute = minute;
            currentTime[1] = minute;
        } else {
            throw new RuntimeException("Minutes can't be more than 60");
        }
    }

    public void setHour (int hour) {
        if (hour <= 24) {
            this.hour = hour;
            currentTime[0] = hour;
        } else {
            throw new RuntimeException("Hours number can't be more than 24");
        }
    }

    public int[] getCurrentTime () {
        return currentTime;
    }

    public int getSec() {
        return sec;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public void addToAllTimeFields(int _hour, int _minute, int _sec) {

        if (_hour <= 24 || hour + _hour <= 24) {
            hour = hour + _hour;
            currentTime[0] = hour;
        } else {
            throw new RuntimeException("Hours number can't be more than 24");
        }

        if (_minute <= 60 || minute + _minute <= 60) {
            minute = minute + _minute;
            currentTime[1] = minute;
        } else {
            throw new RuntimeException("Minutes can't be more than 60");
        }

        if (_sec <= 60 || sec + _sec <= 60) {
            sec = sec + _sec;
            currentTime[2] = sec;
        } else {
            throw new RuntimeException("Seconds can't be more than 60");
        }

    }
}
