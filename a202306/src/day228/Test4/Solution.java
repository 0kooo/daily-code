package day228.Test4;

//318. 最大单词长度乘积
class Solution {
    public int maxProduct(String[] words) {
        int res = 0;
        int n = words.length;
        int[] masks = new int[n];
        for (int i = 0; i < n; i++) {
            String word = words[i];
            int length = word.length();
            for (int j = 0; j < length; j++) {
                masks[i] |= 1 << (word.charAt(j) - 'a');
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if((masks[i] & masks[j]) == 0){
                    res = Math.max(res, words[i].length() * words[j].length());
                }
            }
        }
        return res;
    }
}
