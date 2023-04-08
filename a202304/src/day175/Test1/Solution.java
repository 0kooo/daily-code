package day175.Test1;

//791. 自定义字符串排序
class Solution {
    public String customSortString(String order, String s) {
        StringBuilder res = new StringBuilder();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            while (arr[c - 'a'] != 0){
                res.append(c);
                arr[c - 'a']--;
            }
        }
        for (int i = 0; i < 26; i++) {
            while (arr[i] != 0){
                res.append((char)(i + 'a'));
                arr[i]--;
            }
        }
        return res.toString();
    }
}
