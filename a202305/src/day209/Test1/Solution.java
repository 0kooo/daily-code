package day209.Test1;

//2441. 与对应负数同时存在的最大正整数
class Solution {
    public int findMaxK(int[] nums) {
        int[] arr1 = new int[1001];
        int[] arr2 = new int[1001];
        int res = -1;
        for (int num : nums) {
            if(num < 0) arr1[Math.abs(num)]++;
            else arr2[num]++;
            num = Math.abs(num);
            if(arr1[num] >= 1 && arr2[num] >= 1) res = Math.max(res, num);
        }
        return res;
    }
}
