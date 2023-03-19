package day155.Test3;

//680. 验证回文串 II
class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left <= right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);
            if(c1 == c2){
                left++;
                right--;
                continue;
            }else{
                return dfs(s, left + 1, right) || dfs(s, left, right - 1);
            }
        }
        return true;
    }

    public boolean dfs(String s, int left , int right){
        for(int i = left , j = right; i < j; i++, j--){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(c1 != c2){
                return false;
            }
        }
        return true;
    }
}
