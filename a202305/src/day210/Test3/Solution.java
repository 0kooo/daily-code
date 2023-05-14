package day210.Test3;

//1550. 存在连续三个奇数的数组
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i = 0, count = 0;
        while (i < arr.length){
            if(arr[i] % 2 == 1){
                count++;
            }else{
                count = 0;
            }
            if(count == 3) return true;
            i++;
        }
        return false;
    }
}
