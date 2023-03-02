package day138.Text3;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] licenseArr = dfs2(licensePlate);
        List<String> list = new ArrayList<>();
        for (String word : words) {
            int[] wordArr = dfs2(word);
            if(dfs1(licenseArr, wordArr)){
                list.add(word);
            }
        }
        int min = 1000;
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i).length();
            if(min > n){
                min = n;
                index = i;
            }
        }
        return list.get(index);
    }

    public boolean dfs1(int[] l, int[] w){
        for (int i = 0; i < l.length; i++) {
            if(l[i] > w[i]){
                return false;
            }
        }
        return true;
    }

    public int[] dfs2(String s){
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c <= 57){
                continue;
            }
            if(c >= 65 && c <= 90){
                arr[c - 65]++;
            }else{
                arr[c - 65 - 32]++;
            }
        }
        return arr;
    }
}
