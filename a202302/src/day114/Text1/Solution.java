package day114.Text1;

class Solution {
    public boolean isUgly(int n) {
        if(n <= 0) return false;
        int[] base = {2, 3, 5};
        for (int i : base) {
            while(n % i == 0){
                n /= i;
            }
        }
        return n == 1;
    }
}
/*
* class Solution {
    public boolean isUgly(int n) {
        if(n <= 0){
            return false;
        }
        while(n % 5 == 0){
            n /= 5;
        }
        while (n % 3 == 0){
            n /= 3;
        }
        while (n % 2 == 0){
            n /= 2;
        }
        return n == 1;
    }
}*/