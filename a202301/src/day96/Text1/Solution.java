package day96.Text1;


class Solution {
    public boolean digitCount(String num) {
        int[] nums = new int[10];
        for (int i = 0; i < num.length(); i++) {
            int number = num.charAt(i) - '0';
            nums[number]++;
        }
        for (int i = 0; i < num.length(); i++) {
            int number = num.charAt(i) - '0';
            int value = nums[i];
            if(number != value){
                return false;
            }
        }
        return true;
    }
}
