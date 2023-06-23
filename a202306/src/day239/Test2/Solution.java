package day239.Test2;

//1413. 逐步求和得到正数的最小值
class Solution {
    public int minStartValue(int[] nums) {
        int res = 1;
        while (true){
            boolean flag = true;
            int temp = res;
            for (int num : nums) {
                temp += num;
                if(temp < 1){
                    flag = false;
                    break;
                }
            }
            if(flag) break;
            res++;
        }
        return res;
    }
}
