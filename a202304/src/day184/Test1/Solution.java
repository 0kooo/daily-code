package day184.Test1;


//2409. 统计共同度过的日子数
class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] sumDay = new int[13];
        for (int i = 0; i < 12; i++){
            sumDay[i + 1] = sumDay[i] + monthDay[i];
        }
        int AliceArriveDay = dfs(arriveAlice, sumDay);
        int AliceLeaveDay = dfs(leaveAlice, sumDay);
        int BobArriveDay = dfs(arriveBob, sumDay);
        int BobLeaveDay = dfs(leaveBob, sumDay);
        return Math.max(0, Math.min(AliceLeaveDay, BobLeaveDay) - Math.max(AliceArriveDay, BobArriveDay) + 1);
    }

    private int dfs(String s, int[] sumDay) {
        int month = Integer.parseInt(s.substring(0, 2));
        int day = Integer.parseInt(s.substring(3));
        return sumDay[month - 1] + day;
    }
}