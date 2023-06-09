package day230.Test2;

//1313. 解压缩编码列表
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        int len = 0;
        for (int i = 0; i < n; i += 2) {
            len += nums[i];
        }
        int[] res = new int[len];
        int index = 0;
        for (int i = 1; i < n; i += 2) {
            int temp = nums[i - 1];
            while (temp > 0){
                res[index++] = nums[i];
                temp--;
            }
        }
        return res;
    }
}
