package com.homework.year.exceptions;

public class NoSuchMonthException extends RuntimeException {
    @Override
    public String toString() {
        return "Not existing such month";
    }
}
