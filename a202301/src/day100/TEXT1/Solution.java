package day100.TEXT1;

class Solution {
    public int minMaxGame(int[] nums) {
        int length = nums.length;
        if(length == 1) return nums[0];

        while(length != 1){
            int[] temp = new int[length / 2];
            for (int i = 0; i < length / 2; i++) {
                if(i % 2 == 0){
                    temp[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                }else{
                    temp[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            length = temp.length;
            nums = temp;
        }
        return nums[0];
    }
}
