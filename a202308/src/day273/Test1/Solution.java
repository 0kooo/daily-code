package day273.Test1;

//1974. 使用特殊打字机键入单词的最少时间
class Solution {
    public int minTimeToType(String word) {
        int res = 0, per = 0;
        for (int i = 0; i < word.length(); i++) {
            int cur = word.charAt(i) - 'a';
            int dis = Math.abs(cur - per);
            res += (1 + Math.min(dis, 26 - dis));
            per = cur;
        }
        return res;
    }
}
