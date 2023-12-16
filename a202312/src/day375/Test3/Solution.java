package day375.Test3;

//2894. 分类求和并作差
class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = 0, dif = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
            if(i % m == 0) dif += i;
        }
        return sum - dif * 2;
    }
}