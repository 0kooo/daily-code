package day268.Test2;

//1221. 分割平衡字符串
class Solution {
    public int balancedStringSplit(String s) {
        int count1 = 0, count2 = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'R') count1++;
            else if(c == 'L') count2++;
            if(count1 != 0 && count1 == count2){
                res++;
                count1 = 0;
                count2 = 0;
            }
        }
        return res;
    }
}
