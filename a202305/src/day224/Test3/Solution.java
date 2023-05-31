package day224.Test3;

//2148. 元素计数
class Solution {
    public int countElements(int[] nums) {
        int res = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        for (int num : nums) {
            if(min < num && num < max){
                res++;
            }
        }
        return res;
    }
}
