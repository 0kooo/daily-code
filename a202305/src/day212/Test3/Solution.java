package day212.Test3;

//1295. 统计位数为偶数的数字
class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            int count = 0;
            while (num != 0){
                count++;
                num /= 10;
            }
            if(count % 2 == 0)res++;
        }
        return res;
    }
}
