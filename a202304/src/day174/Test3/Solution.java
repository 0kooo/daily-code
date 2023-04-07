package day174.Test3;


//1370. 上升下降字符串
class Solution {
    public String sortString(String s) {
        int n = s.length();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        StringBuilder res = new StringBuilder();
        while (res.length() < n){
            for (int i = 0; i < 26; i++) {
                if(arr[i] > 0){
                    res.append((char)(i + 'a'));
                    arr[i]--;
                }
            }
            for(int i = 25; i >= 0; i--){
                if(arr[i] > 0){
                    res.append((char)(i + 'a'));
                    arr[i]--;
                }
            }
        }
        return res.toString();
    }
}
