package day279.Test1;

//849. 到最近的人的最大距离
class Solution {
    public int maxDistToClosest(int[] seats) {
        int res = 0, n = seats.length;
        int l = 0;
        while (l < n && seats[l] == 0) l++;
        res = Math.max(res, l);
        while (l < n){
            int r = l + 1;
            while (r < n && seats[r] == 0) r++;
            if(r == n) res = Math.max(res, r - l - 1);
            else res = Math.max(res, (r - l) / 2);
            l = r;
        }
        return res;
    }
}
