package Text2;

class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int indexNew = 0;
        int indexNow = 0;
        while(indexNow < len){
            if(nums[indexNow] != 0){
                nums[indexNew++] = nums[indexNow];
            }
            indexNow++;
        }
        for (int i = indexNew; i < len; i++) {
            nums[indexNew] = 0;
        }
    }
}
