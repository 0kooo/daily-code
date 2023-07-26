package day255.Test1;

//2553. 分割数组中数字的数位
class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num);
        }
        int n = sb.toString().length();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = sb.charAt(i) - '0';
        }
        return res;
    }
}