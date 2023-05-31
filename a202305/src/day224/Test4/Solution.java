package day224.Test4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//893. 特殊等价字符串组
class Solution {
    public int numSpecialEquivGroups(String[] words) {
        Set<String> set = new HashSet<>();
        for (String word : words) {
            int[] arr = new int[52];
            for (int i = 0; i < word.length(); i++) {
                arr[word.charAt(i) - 'a' + 26 * (i % 2)]++;
            }
            set.add(Arrays.toString(arr));
        }
        return set.size();
    }
}
