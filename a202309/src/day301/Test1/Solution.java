package day301.Test1;

//2582. 递枕头
class Solution {
    public int passThePillow(int n, int time) {
        int res = 1, flag = 1;
        while (time != 0){
            if(time > n - 1){
                if(flag % 2 == 1){
                    res = n;
                    time -= n - 1;
                    flag++;
                }else{
                    res = 1;
                    time -= n -1;
                    flag++;
                }
            }else{
                if(flag % 2 == 1) {
                    res += time;
                    time = 0;
                }else{
                    res -= time;
                    time = 0;
                }
            }
        }
        return res;
    }
}