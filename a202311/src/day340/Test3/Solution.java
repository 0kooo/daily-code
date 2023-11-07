package day340.Test3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//1360. 日期之间隔几天
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate d2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        int res = (int)(d2.toEpochDay() - d1.toEpochDay());
        return d1.isAfter(d2) ? res*(-1) : res;
    }
}