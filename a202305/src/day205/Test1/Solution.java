package day205.Test1;

//2437. 有效时间的数目
class Solution {
    public int countTime(String time) {
        int res = 1;
        char[] arr = time.toCharArray();
        if(arr[0] == '?' && (arr[1] - '0') <= 3){
            res *= 3;
        }else if(arr[0] == '?' && (arr[1] - '0') > 3 && arr[1] != '?'){
            res *= 2;
        }else if((arr[0] - '0') <= 1 && arr[1] == '?'){
            res *= 10;
        }else if((arr[0] - '0') == 2 && arr[1] == '?'){
            res *= 3;
        }else if(arr[0] == '?' && arr[1] == '?'){
            res *= 24;
        }
        if(arr[3] == '?') res *= 6;
        if(arr[4] == '?') res *= 10;
        return res;
    }
}
