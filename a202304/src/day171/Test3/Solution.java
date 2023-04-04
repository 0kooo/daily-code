package day171.Test3;

//1160. 拼写单词
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] arr = new int[26];
        int res = 0;
        for (int i = 0; i < chars.length(); i++) {
            arr[chars.charAt(i) - 'a']++;
        }
        for (String word : words) {
            int[] temp = new int[26];
            boolean flag = true;
            for (int i = 0; i < word.length(); i++) {
                temp[word.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if(arr[i] < temp[i]){
                    flag = false;
                    break;
                }
            }
            if(flag) res += word.length();
        }
        return res;
    }
}
