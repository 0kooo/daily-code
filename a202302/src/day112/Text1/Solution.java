package day112.Text1;

class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 1; i < nums.length; i++) {
            sum -= i;
        }
        if(sum == 0){
            return 0;
        }
        return -sum;
    }
}
