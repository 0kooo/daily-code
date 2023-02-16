package day124.Text1;

import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] res = new int[n1 + n2];
        int index = 0, index1 = 0, index2 = 0;
        while(index1 < n1 && index2 < n2){
            int num1 = nums1[index1];
            int num2 = nums2[index2];
            if(num1 == num2){
                if(index == 0 || num1 != res[index - 1]){
                    res[index++] = num1;
                }
                index1++;
                index2++;
            }else if(num1 < num2){
                index1++;
            }else{
                index2++;
            }
        }

        return Arrays.copyOfRange(res, 0, index);
    }
}