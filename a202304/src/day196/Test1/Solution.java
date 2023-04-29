package day196.Test1;

import java.util.HashSet;

//2423. 删除字符使频率相同
class Solution {
    public boolean equalFrequency(String word) {
        int[] arr = new int[26];
        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) {
                continue;
            }
            arr[i]--;
            HashSet<Integer> hs = new HashSet<Integer>();
            for (int f : arr) {
                if (f > 0) {
                    hs.add(f);
                }
            }
            if (hs.size() == 1) {
                return true;
            }
            arr[i]++;
        }
        return false;
    }
}