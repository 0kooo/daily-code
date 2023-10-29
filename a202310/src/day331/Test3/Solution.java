package day331.Test3;

//1185. 一周中的第几天
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] str = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sumDay = 365 * (year - 1971) + (year - 1969) / 4;
        for (int i = 0; i < month - 1; i++) {
            sumDay += arr[i];
        }
        sumDay += day;
        if((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month >= 3) sumDay++;
        return str[(sumDay + 3) % 7];
    }
}
