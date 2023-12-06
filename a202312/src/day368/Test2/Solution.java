package day368.Test2;

//2433. 找出前缀异或的原始数组
class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int[] res = new int[n];
        res[0] = pref[0];
        int temp = pref[0];
        for (int i = 1; i < n; i++) {
            res[i] = temp ^ pref[i];
            temp = pref[i];
        }
        return res;
    }
}