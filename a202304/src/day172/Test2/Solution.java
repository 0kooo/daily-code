package day172.Test2;

//395. 至少有 K 个重复字符的最长子串
class Solution {
    public int longestSubstring(String s, int k) {
        int res = 0;
        int n = s.length();
        for (int i = 1; i <= 26; i++) {
            int l = 0, r = 0;
            int[] arr = new int[26];
            int tot = 0;
            int less = 0;
            while (r < n){
                int index1 = s.charAt(r) - 'a';
                arr[index1]++;
                if(arr[index1] == 1){
                    tot++;
                    less++;
                }
                if(arr[index1] == k){
                    less--;
                }

                while (tot > i){
                    int index2 = s.charAt(l) - 'a';
                    if(arr[index2] == k - 1){
                        less++;
                    }
                    if(arr[index2] == 0){
                        tot--;
                        less--;
                    }
                    l++;
                }
                if(less == 0) res = Math.max(res, r - l + 1);
                r++;
            }
        }
        return res;
    }
}