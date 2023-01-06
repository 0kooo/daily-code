package day91.Text1;

class Solution {
    public int countEven(int num) {
        int res = 0;
        for (int i = 1; i <= num; i++) {
            int sum = 0;
            int temp = i;
            while(temp != 0){
                int ge = temp % 10;
                temp /= 10;
                sum += ge;
            }
            if(sum % 2 == 0){
                res++;
            }
        }
        return res;
    }
}
