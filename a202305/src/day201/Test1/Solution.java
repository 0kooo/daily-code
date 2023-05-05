package day201.Test1;

//2432. 处理用时最长的那个任务的员工
class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int res = logs[0][0];
        int maxTime = logs[0][1];
        for (int i = 0; i < logs.length - 1; i++) {
            if(logs[i + 1][0] < n && logs[i][0] < n){
                int time = logs[i + 1][1] - logs[i][1];
                if(maxTime < time){
                    maxTime = time;
                    res = logs[i + 1][0];
                }else if(maxTime == time){
                    res = Math.min(res, logs[i + 1][0]);
                }
            }
        }
        return res;
    }
}
