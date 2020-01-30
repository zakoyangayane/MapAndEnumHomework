package com.homework.year.exceptions;

public class NoSuchDayInMonthException extends RuntimeException {
    @Override
    public String toString() {
        return "There is not such day in the month";
    }
}
