package day339.Test3;

//1317. 将整数转换为两个无零整数的和
class Solution {
    public int[] getNoZeroIntegers(int n) {
        int num = n -1;
        for (; num >=0; num--){
            boolean flag = true;
            int temp1 = num;
            while(temp1 != 0) {
                if (temp1 % 10 == 0) {
                    flag = false;
                    break;
                }
                temp1 /= 10;
            }
            int temp2 = n - num;
            while (temp2 != 0){
                if (temp2 % 10 == 0) {
                    flag = false;
                    break;
                }
                temp2 /= 10;
            }
            if(flag){
                break;
            }
        }
        return new int[]{n - num, num};
    }
}
