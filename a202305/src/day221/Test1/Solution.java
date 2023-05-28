package day221.Test1;

//1170. 比较字符串最小字母出现频次
class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] res = new int[queries.length];
        int index = 0;
        for (String query : queries) {
            for (String word : words) {
                if(f(query) < f(word)){
                    res[index]++;
                }
            }
            index++;
        }
        return res;
    }

    private int f(String s){
        int res = 0;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i : arr) {
            if(i != 0){
                res = i;
                break;
            }
        }
        return res;
    }
}
