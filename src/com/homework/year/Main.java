package com.homework.year;

import com.homework.year.model.Month;
import com.homework.year.service.MonthService;

public class Main {
    public static void main(String[] args) {
        MonthService monthService = new MonthService();

        //print number of holidays in some months
        System.out.println("July has " + Month.numberOfHolidaysInMonth(monthService.JULY)
                + " holidays");
        System.out.println("November has " + Month.numberOfHolidaysInMonth(monthService.NOVEMBER)
                + " holidays");

        //print holidays of a april
        System.out.println("Holidays of April " + Month.getHolidaysInMonth(monthService.APRIL));

        //print number of days in march
        System.out.println("March has " + Month.getDaysInMonth(monthService.MARCH) + " days");

        //traversing and printing all month names
        System.out.println("Traversed names of months");
        Month.traverseName(monthService.months);

        //check whether the current day is a public holiday or not
        System.out.println(Month.checkWhetherHoliday(monthService.MARCH, 21) ?
                "March 21 is holiday" : "March 21 isn't a holiday");
        System.out.println(Month.checkWhetherHoliday(monthService.MARCH, 8) ?
                "March 8 is a holiday" : "March 8 isn't a holiday");
    }
}
