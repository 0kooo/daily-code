package day222.Test1;

//2455. 可被三整除的偶数的平均值
class Solution {
    public int averageValue(int[] nums) {
        int count = 0;
        double sum = 0.0;
        for (int num : nums) {
            if(num % 2 == 0 && num % 3 == 0){
                count++;
                sum += num;
            }
        }
        return (int) Math.floor(sum / count);
    }
}
