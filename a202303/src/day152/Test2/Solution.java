package day152.Test2;

class Solution {
    public boolean divisorGame(int n) {
        boolean[] res = new boolean[n + 5];
        res[1] = false;
        res[2] = true;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if((i % j) == 0 && !res[i - j]){
                    res[i] = true;
                    break;
                }
            }
        }
        return res[n];
    }
}
/*
class Solution{
    public boolean divisorGame(int n){
        return n % 2 == 0;
    }
}
* */