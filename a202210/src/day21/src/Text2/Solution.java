package Text2;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] res = new int[len1];
        int sign = 0;
        boolean flge = true;
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if(nums1[i] == nums2[j]){
                    sign = j;
                }
                for(int k = sign; k < len2; k++){
                    if(nums1[i] < nums2[k]){
                        res[i] = nums2[k];
                        flge = false;
                        break;
                    }
                }
                if(flge){
                    res[i] = -1;
                }
            }
        }
        return res;
    }
}