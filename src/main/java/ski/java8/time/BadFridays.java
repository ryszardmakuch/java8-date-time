package ski.java8.time;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class BadFridays {
    public static LocalDate next(LocalDate from) {
        LocalDate thirteenthDayOfMonth = findNext13thOfMonth(from);
        while (thirteenthDayOfMonth.getDayOfWeek() != DayOfWeek.FRIDAY) {
            thirteenthDayOfMonth = thirteenthDayOfMonth.plusMonths(1);
        }
        return thirteenthDayOfMonth;
    }

    private static LocalDate findNext13thOfMonth(LocalDate from) {
        LocalDate next13thOfMonth;
        if (from.getDayOfMonth() >= 13) {
            next13thOfMonth = from.plusMonths(1).withDayOfMonth(13);
        } else {
            next13thOfMonth = from.withDayOfMonth(13);
        }
        return next13thOfMonth;
    }
}
