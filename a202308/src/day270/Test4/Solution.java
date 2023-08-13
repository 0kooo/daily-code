package day270.Test4;

//134. 加油站
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int i = 0;
        while (i < n){
            int sum1 = 0, sum2 = 0;
            int temp = 0;
            while (temp < n){
                int j = (i + temp) % n;
                sum1 += gas[j];
                sum2 += cost[j];
                if(sum1 < sum2) break;
                temp++;
            }
            if(temp == n) return i;
            else i = i + temp + 1;
        }
        return -1;
    }
}
