package com.homework.year.exception;

public class NoSuchMonthException extends RuntimeException {
    @Override
    public String toString() {
        return "Not existing such month";
    }
}
