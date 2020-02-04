package com.homework.year.service;

import com.homework.year.exception.NoSuchDayInMonthException;
import com.homework.year.exception.NoSuchMonthException;
import com.homework.year.model.Month;

public class MonthService {
    public final Month[] months = Month.values();

    /*a method for checking whether a day is a public holiday or not*/
    public static boolean checkWhetherHoliday(Month month, int day) {
        if (month == null) {
            throw new NoSuchMonthException();
        }
        if (day < 1 || day > Month.getDaysInMonth(month)) {
            throw new NoSuchDayInMonthException();
        }
        for (int i = 0; i < month.getHolidaysInMonth().length; i++) {
            if (month.getHolidaysInMonth()[i] == day) {
                return true;
            }
        }
        return false;
    }

    public static void printMessageOfWhetherHoliday(Month month, int day) {
        System.out.print(month.name() + " " + day);
        if (checkWhetherHoliday(month, day)) {
            System.out.println(" is a holiday");
        } else {
            System.out.println(" is not a holiday");
        }
    }

    /*get the number of holidays in month*/
    public static int numberOfHolidaysInMonth(Month month) {
        if (month == null) {
            throw new NoSuchMonthException();
        }
        return month.getHolidaysInMonth().length;
    }

    /*traverse the name of a month*/
    public static void traverseName(Month[] month) {
        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i].name());
        }
    }
}
