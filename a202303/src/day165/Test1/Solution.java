package day165.Test1;

import java.util.Arrays;

//1641. 统计字典序元音字符串的数目
class Solution {
    public int countVowelStrings(int n) {
        //方法一
        int[] arr = new int[5];
        Arrays.fill(arr, 1);
        for (int i = 1; i < n; i++) {
            for(int j = 1; j < 5; i++){
                arr[j] += arr[j - 1];
            }
        }
        return Arrays.stream(arr).sum();
        //方法二
        //return (n + 1) * (n + 2) * (n + 3) * (n + 4) / 24;
    }
}
