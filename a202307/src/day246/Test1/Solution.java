package day246.Test1;

//2149. 按符号重排数组
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] temp1 = new int[n / 2];
        int[] temp2 = new int[n / 2];
        int index1 = 0, index2 = 0;
        for (int num : nums) {
            if (num < 0) temp1[index1++] = num;
            else temp2[index2++] = num;
        }
        index1 = 0;
        index2 = 0;
        for (int i = 0; i < n; i++){
            if(i % 2 == 1) res[i] = temp1[index1++];
            else res[i] = temp2[index2++];
        }
        return res;
    }
}
