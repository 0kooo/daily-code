package day154.Test1;

//1616. 分割两个字符串得到回文串
class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return dfs1(a, b) || dfs1(b, a);
    }

    public boolean dfs1(String a, String b){
        int n = a.length();
        int left = 0, right = n - 1;
        while(left < right && a.charAt(left) == b.charAt(right)){
            left++;
            right--;
        }
        if(left >= right){
            return true;
        }
        return dfs2(a, left, right) || dfs2(b, left, right);
    }

    public boolean dfs2(String a, int left, int right){
        while(left < right && a.charAt(left) == a.charAt(right)){
            left++;
            right--;
        }
        return left >= right;
    }
}
