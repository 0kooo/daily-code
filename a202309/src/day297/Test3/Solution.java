package day297.Test3;

//1154. 一年中的第几天
class Solution {
    public int dayOfYear(String date) {
        String[] arr = date.split("-");
        int res = 0;
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);
        int[] amount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            ++amount[1];
        }
        for (int i = 0; i < month - 1; i++) {
            res += amount[i];
        }
        return res + day;
    }
}
