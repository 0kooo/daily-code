package day94.Text1;

class Solution {
    public int reinitializePermutation(int n) {
        if(n == 2){
            return 1;
        }
        int step = 1;
        int pow = 2;
        while(pow != 1){
            step++;
            pow = pow * 2 % (n - 1);
        }
        return step;
    }
}
