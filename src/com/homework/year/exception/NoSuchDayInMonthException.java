package com.homework.year.exception;

public class NoSuchDayInMonthException extends RuntimeException {
    @Override
    public String toString() {
        return "There is not such day in the month";
    }
}
