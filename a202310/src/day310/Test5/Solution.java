package day310.Test5;

//2520. 统计能整除数字的位数
class Solution {
    public int countDigits(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int res = 0;
        for (char c : arr) {
            if(num % (c - '0') == 0) res++;
        }
        return res;
    }
}
