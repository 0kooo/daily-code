package day142.Test1;

class Solution {
    public int minimumDeletions(String s) {
        int left = 0, right = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a'){
                right++;
            }
        }

        int res = right;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a'){
                right--;
            }else{
                left++;
            }
            res = Math.min(res, left + right);
        }
        return res;
    }
}
/*
class Solution {
    public int minimumDeletions(String S) {
        var s = S.toCharArray();
        int del = 0;
        for (var c : s)
            del += 'b' - c; // 统计 'a' 的个数
        int ans = del;
        for (var c : s) {
            // 'a' -> -1    'b' -> 1
            del += (c - 'a') * 2 - 1;
            ans = ans - ((ans - del) & ((del - ans) >> 31));
        }
        return ans;
    }
}

* */