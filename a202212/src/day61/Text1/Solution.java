package day61.Text1;

import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
        for (int num : nums1) {
            arr[num]++;
        }
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        for (int num : nums2) {
            if(arr[num] > 0){
                arr[num]--;
                res[index++] = num;
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }
}
