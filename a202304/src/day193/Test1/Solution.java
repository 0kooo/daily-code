package day193.Test1;

//1031. 两个非重叠子数组的最大和
class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        /*int left = 0, right = firstLen;
        int max1 = 0, max2 = 0;
        int n = nums.length;
        while (right < n){
            int sum = 0;
            for(int i = left; i < right; i++){
                sum += nums[i];
            }
            if(max1 < sum) max1 = sum;
            System.out.print(max1 + " ");
            left++;
            right++;
        }
        System.out.println("------------");
        int l = 0, r = secondLen;
        while (r < n){
            int sum = 0;
            for(int i = l; i < r; i++){
                sum += nums[i];
            }
            if(max2 < sum) max2 = sum;
            System.out.print(max2 + " ");
            l++;
            r++;
        }
        return max1 + max2;*/
        return Math.max(help(nums, firstLen, secondLen), help(nums, secondLen, firstLen));
    }

    private int help(int[] nums, int firstLen, int secondLen) {
        int suml = 0;
        for (int i = 0; i < firstLen; i++) {
            suml += nums[i];
        }
        int maxSumL = suml;
        int sumr = 0;
        for(int i = firstLen; i < firstLen + secondLen; ++i){
            sumr += nums[i];
        }
        int res = maxSumL + sumr;
        for(int i = firstLen + secondLen, j = firstLen; i < nums.length; ++i, ++j){
            suml += nums[j] - nums[j - firstLen];
            maxSumL = Math.max(maxSumL, suml);
            sumr += nums[i] - nums[i - secondLen];
            res = Math.max(res, maxSumL + sumr);
        }
        return res;
    }
}
