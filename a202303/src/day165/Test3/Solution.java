package day165.Test3;


//2570. 合并两个二维数组 - 求和法
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[] temp = new int[1001];
        int res = 0;
        for (int i = 0; i < nums1.length; i++) {
            if(temp[nums1[i][0]] == 0) res++;
            temp[nums1[i][0]] += nums1[i][1];
        }
        for (int i = 0; i < nums2.length; i++) {
            if(temp[nums2[i][0]] == 0)res++;
            temp[nums2[i][0]] += nums2[i][1];
        }
        int[][] ans = new int[res][2];
        int j = 0;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] != 0){
                ans[j][0] = i;
                ans[j][1] = temp[i];
                j++;
            }
        }
        return ans;
    }
}
