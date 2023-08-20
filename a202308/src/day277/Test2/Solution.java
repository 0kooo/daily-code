package day277.Test2;

//2259. 移除指定数字得到的最大结果
class Solution {
    public String removeDigit(String number, char digit) {
        StringBuilder res = new StringBuilder();
        int n = number.length(), last = -1;
        for (int i = 0; i < n; i++) {
            if(number.charAt(i) == digit){
                last = i;
                if(i < n - 1 && number.charAt(i) < number.charAt(i + 1)) {
                    break;
                }
            }
        }
        res.append(number.substring(0, last)).append(number.substring(last + 1));
        return res.toString();
    }
}
