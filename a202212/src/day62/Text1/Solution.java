package day62.Text1;

class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int res = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        for (int i = 0; i < len1; i++) {
            int left = 0;
            int right = len2 - 1;
            while(left < right){
                int mid = left + right + 1 >> 1;
                if(nums2[mid] >= nums1[i]) left = mid;
                else right = mid - 1;
            }
            if(i <= left) res = Math.max(res, left - i);
        }
        return res;
    }
}
