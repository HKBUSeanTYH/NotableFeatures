package java17.examples;

import java.time.LocalDate;
import java.time.Month;

public class SwitchExpressions {
    /*
        Java 14
        Switch expressions allow us to omit break calls inside every case block.
     */

    public int daysOfMonthOld(Month month) {
        int days = 0;

        switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER :
                days = 31;
                break;
            case FEBRUARY :
                days = 28;
                break;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER :
                days = 30;
                break;
            default:
                throw new IllegalStateException();
        }
        return days;
    }

    /*
        In a multi-line switch expression code block, we use the newly introduced 'yield' keyword to yield the value from the code block
     */
    public int daysOfMonthNew(Month month) {
        int days = switch(month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case FEBRUARY -> {
                var year = LocalDate.now().getYear();
                yield (year % 4 == 0 && year % 100 != 0) ? 29 : 28;
            }
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            default -> throw new IllegalStateException();
        };
        return days;
    }
}
