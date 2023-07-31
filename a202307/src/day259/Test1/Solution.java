package day259.Test1;

//2652. 倍数求和
class Solution {
    public int sumOfMultiples(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0) res += i;
            else if(i % 5 == 0) res += i;
            else if(i % 7 == 0) res += i;
        }
        return res;
    }
}
