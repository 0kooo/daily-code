package day198.Test3;

//2605. 从两个数字数组里生成最小数字
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int n1 = nums1[i];
                int n2 = nums2[j];
                if(n1 == n2){
                    res = Math.min(res, nums1[i]);
                }
                else{
                    res = Math.min(res, n1 * 10 + n2);
                    res = Math.min(res, n2 * 10 + n1);
                }
            }
        }
        return res;
    }
}
