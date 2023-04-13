package day180.Test2;

//767. 重构字符串
class Solution {
    public String reorganizeString(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int[] count = new int[26];
        for (char c : arr) {
            count[c - 'a']++;
        }
        int maxIndex = 0;
        for (int i = 0; i < count.length; i++) {
            if(count[i] > count[maxIndex]){
                maxIndex = i;
            }
        }

        if(count[maxIndex] > (n + 1) / 2) return "";

        char[] res = new char[n];
        int i = 0;
        while (count[maxIndex]-- > 0){
            res[i] = (char)('a' + maxIndex);
            i += 2;
        }
        for (int j = 0; j < count.length; j++) {
            while (count[j]-- > 0){
                if(i >= n) i = 1;
                res[i] = (char)('a' + j);
                i += 2;
            }
        }
        return String.valueOf(res);
    }
}
