package day286.Test1;

//2240. 买钢笔和铅笔的方案数
class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if(cost1 < cost2) return waysToBuyPensPencils(total, cost2, cost1);
        long res = 0, cnt = 0;
        while (cnt * cost1 <= total){
            res += (total - cnt * cost1) / cost2 + 1;
            cnt++;
        }
        return res;
    }
}
