package com.homework.year.model;

import com.homework.year.exception.NoSuchMonthException;

import java.util.Arrays;

public enum Month {
    JANUARY(1, 31, 1, 20, 25),
    FEBRUARY(2, 29, 2, 14, 17),
    MARCH(3, 31, 8, 10, 17),
    APRIL(4, 30, 1, 5, 8, 10, 12, 15, 19, 22, 24),
    MAY(5, 31, 5, 10, 23, 25),
    JUNE(6, 30, 14, 19, 21),
    JULY(7, 31, 3, 4, 31),
    AUGUST(8, 31, 29),
    SEPTEMBER(9, 30, 7, 19, 27),
    OCTOBER(10, 31, 12, 31),
    NOVEMBER(11, 30, 1, 3, 11, 14, 26),
    DECEMBER(12, 31, 11, 24, 25, 26, 31);

    private final int VALUE;
    private int daysInMonth;
    private int[] holidaysInMonth;

    Month(int value, int daysInMonth, int... holidaysInMonth) {
        this.VALUE = value;
        setDaysInMonth(daysInMonth);
        setHolidaysInMonth(holidaysInMonth);
    }

    public int getVALUE() {
        return VALUE;
    }

    public static int getDaysInMonth(Month month) {
        if (month == null) {
            throw new NoSuchMonthException();
        }
        return month.daysInMonth;
    }

    public void setDaysInMonth(int daysInMonth) {
        if (daysInMonth >= 28 && daysInMonth <= 31) {
            this.daysInMonth = daysInMonth;
        } else {
            throw new IllegalArgumentException("Number of days in a month should be between 28 and 31");
        }
    }

    public int[] getHolidaysInMonth() {
        return holidaysInMonth;
    }

    public static String getHolidaysInMonth(Month month) {
        if (month == null) {
            throw new NoSuchMonthException();
        }
        return Arrays.toString(month.holidaysInMonth);
    }

    public void setHolidaysInMonth(int... holidaysInMonth) {
        if (holidaysInMonth.length <= this.daysInMonth) {
            this.holidaysInMonth = holidaysInMonth;
        } else {
            throw new IllegalArgumentException("Holidays number can't be bigger than days number in month");
        }
    }
}
