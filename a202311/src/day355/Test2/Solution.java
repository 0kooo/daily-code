package day355.Test2;

//1524. 和为奇数的子数组数目
class Solution {
    public int numOfSubarrays(int[] arr) {
        int res = 0, even = 1, odd = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            res = (res + (sum % 2 == 0 ? odd : even)) % 1000000007;
            if(sum % 2 == 0) even++;
            else odd++;
        }
        return res;
    }
}