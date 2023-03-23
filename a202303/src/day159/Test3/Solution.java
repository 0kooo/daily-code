package day159.Test3;

//567. 字符串的排列
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            char c = s1.charAt(i);
            arr[c - 'a']--;
        }

        int left = 0;
        for(int right = 0; right < m; ++right){
            int x = s2.charAt(right) - 'a';
            ++arr[x];
            while(arr[x] > 0){
                --arr[s2.charAt(left) - 'a'];
                ++left;
            }
            if(right - left + 1 == n){
                return true;
            }
        }
        return false;
    }
}
