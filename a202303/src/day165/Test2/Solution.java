package day165.Test2;

//2562. 找出数组的串联值
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int left = 0, right = nums.length - 1;
        long res = 0;
        while (left <= right){
            if(left == right){
                res += nums[left];
            }
            else res += Integer.parseInt("" + nums[left] +nums[right]);
            left++;
            right--;
        }
        return res;
    }
}
