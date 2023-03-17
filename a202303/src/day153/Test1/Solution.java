package day153.Test1;

import java.util.Arrays;

//2389. 和有限的最长子序列
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length;
        int m = queries.length;
        int[] res = new int[m];
        int[] f = new int[n + 1];
        for (int i = 0; i < n; i++) {
            f[i + 1] = f[i] + nums[i];
        }
        for (int i = 0; i < m; i++) {
            res[i] = binarySearch(f, queries[i]) - 1;
        }
        return res;
    }

    public int binarySearch(int[] f, int target){
        int low = 1, high =  f.length;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(f[mid] > target){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}
