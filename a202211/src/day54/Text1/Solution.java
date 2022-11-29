package day54.Text1;

class Solution {
    public boolean isPerfectSquare(int num) {
        /*if(num == 1) return true;
        int number = num / 2;
        for (int i = 0; i < number; i++) {
            if(number * number == num){
                return true;
            }
        }
        return false;*/
        int left = 1;
        int right = num;
        while(left <= right){
            int mid = left + ((right - left) >> 1);
            long newNum = (long)mid * mid;
            if(newNum == num){
                return true;
            }
            else if(newNum < num){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }
}
