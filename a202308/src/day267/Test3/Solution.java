package day267.Test3;

//2798. 满足目标工作时长的员工数目
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res = 0;
        for (int hour : hours) {
            if(hour >= target) res++;
        }
        return res;
    }
}
