package day301.Test2;

//2124. 检查是否所有 A 都在 B 之前
class Solution {
    public boolean checkString(String s) {
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) == 'b' && s.charAt(i) == 'a') return false;
        }
        return true;
    }
}