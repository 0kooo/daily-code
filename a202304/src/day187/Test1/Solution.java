package day187.Test1;

//1400. 构造 K 个回文字符串
class Solution {
    public boolean canConstruct(String s, int k) {
        int right = s.length();
        if(right < k) return false;
        int[] arr = new int[26];
        for (int i = 0; i < right; i++) {
            ++arr[s.charAt(i) - 'a'];
        }
        int left = 0;
        for (int i = 0; i < 26; i++) {
            if(arr[i] % 2 == 1) left++;
        }
        left = Math.max(left, 1);
        return left <= k && k <= right;
    }
}
