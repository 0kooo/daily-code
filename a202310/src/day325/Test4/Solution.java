package day325.Test4;

//2264. 字符串中最大的 3 位相同数字
class Solution {
    public String largestGoodInteger(String num) {
        String res = "";
        for (int i = 0; i < num.length() - 2; i++) {
            if(num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)){
                if(num.substring(i, i + 3).compareTo(res) > 0)
                    res = num.substring(i, i + 3);
            }
        }
        return res;
    }
}
