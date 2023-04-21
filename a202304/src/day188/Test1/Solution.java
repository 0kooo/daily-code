package day188.Test1;

//2413. 最小偶倍数
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n % 2 == 1){
            return n * 2;
        }
        return n;
    }
}
