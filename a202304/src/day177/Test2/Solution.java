package day177.Test2;


import java.util.Arrays;

//1460. 通过翻转子数组使两个数组相等
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}