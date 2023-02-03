package day111.Text1;

class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            int sum = 0;
            while(num != 0){
                int ge = num % 10;
                sum += ge;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
/*
* class Solution {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}*/