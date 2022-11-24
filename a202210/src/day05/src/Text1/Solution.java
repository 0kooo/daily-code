package Text1;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[Math.min(len1,len2)];
        int index = 0;
        int index1 = 0;
        int index2 = 0;
        while(index1 < len1 && index2 < len2){
            if(nums1[index1] > nums2[index2]){
                index2++;
            }else if(nums1[index1] < nums2[index2]){
                index1++;
            }else{
                result[index] = nums1[index1];
                index1++;
                index2++;
                index++;
            }
        }
        return Arrays.copyOfRange(result,0,index);
    }
}
