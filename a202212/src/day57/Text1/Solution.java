package day57.Text1;

class Solution {
    public int arrangeCoins(int n) {
        /*int left = 1;
        int right = n;
        while(left < right){
            int mid = left + ((right - left) >> 1);
            if((long)mid * (mid + 1) <= (long)2 * n){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return left;*/
        return (int)((Math.sqrt((long)8 * n + 1) - 1) / 2);
    }
}
