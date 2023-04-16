package day183.Test3;

//1897. 重新分配字符使所有字符串都相等
class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        int[] sum = new int[26];
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                sum[word.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if(sum[i] % n != 0){
                return false;
            }
        }
        return true;
    }
}
