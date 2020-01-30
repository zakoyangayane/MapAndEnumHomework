package com.homework.year.model;

import com.homework.year.exception.NoSuchDayInMonthException;
import com.homework.year.exception.NoSuchMonthException;

import java.util.Arrays;

public enum MonthOfYear {
    January(1, 31, 1, 20, 25),
    February(2, 29, 2, 14, 17),
    March(3, 31, 8, 10, 17),
    April(4, 30, 1, 5, 8, 10, 12, 15, 19, 22, 24),
    May(5, 31, 5, 10, 23, 25),
    June(6, 30, 14, 19, 21),
    July(7, 31, 3, 4, 31),
    August(8, 31, 29),
    September(9, 30, 7, 19, 27),
    October(10, 31, 12, 31),
    November(11, 30, 1, 3, 11, 14, 26),
    December(12, 31, 11, 24, 25, 26, 31);

    private final int VALUE;
    private int daysInMonth;
    private int[] holidaysInMonth;

    MonthOfYear(int value, int daysInMonth, int... holidaysInMonth) {
        this.VALUE = value;
        setDaysInMonth(daysInMonth);
        setHolidaysInMonth(holidaysInMonth);
    }

    public int getVALUE() {
        return VALUE;
    }

    public static int getDaysInMonth(MonthOfYear month) {
        if (month == null) {
            throw new NoSuchMonthException();
        }
        return month.daysInMonth;
    }

    public void setDaysInMonth(int daysInMonth) {
        if (daysInMonth >= 28)
            this.daysInMonth = daysInMonth;
    }

    public static String getHolidaysInMonth(MonthOfYear month) {
        if (month == null) {
            throw new NoSuchMonthException();
        }
        return Arrays.toString(month.holidaysInMonth);
    }

    public void setHolidaysInMonth(int... holidaysInMonth) {
        if (holidaysInMonth.length <= this.daysInMonth)
            this.holidaysInMonth = holidaysInMonth;
    }

    /*a method for checking whether a day is a public holiday or not*/
    public static boolean checkWhetherHoliday(MonthOfYear month, int day) {
        if (month == null) {
            throw new NoSuchMonthException();
        }
        if (day < 1 || day > month.daysInMonth) {
            throw new NoSuchDayInMonthException();
        }
        for (int i = 0; i < month.holidaysInMonth.length; i++) {
            if (month.holidaysInMonth[i] == day) {
                return true;
            }
        }
        return false;
    }

    /*get the number of holidays in month*/
    public static int numberOfHolidaysInMonth(MonthOfYear month) {
        if (month == null) {
            throw new NoSuchMonthException();
        }
        return month.holidaysInMonth.length;
    }

    /*traverse the name of a month*/
    public static String traverseName(MonthOfYear month) {
        if (month == null) {
            throw new NoSuchMonthException();
        }
        String traverse = "";
        for (int i = month.name().length() - 1; i >= 0; i--) {
            traverse += month.name().charAt(i);
        }
        return traverse.toLowerCase();
    }
}
