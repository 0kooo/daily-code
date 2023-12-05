package day367.Test3;

//2843. 统计对称整数的数目
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for (int i = low; i <= high; i++){
            String str = String.valueOf(i);
            int length = str.length();
            if(length % 2 != 0) continue;
            String s1 = str.substring(0, length / 2);
            String s2 = str.substring(length / 2, length);
            int sum1 = 0, sum2 = 0;
            for (char c : s1.toCharArray()) sum1 += (c - '0');
            for (char c : s2.toCharArray()) sum2 += (c - '0');
            if(sum1 == sum2) res++;
        }
        return res;
    }
}