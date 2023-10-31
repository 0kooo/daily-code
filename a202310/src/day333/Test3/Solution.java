package day333.Test3;

//1952. 三除数
class Solution {
    public boolean isThree(int n) {
        int count = 2;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) count++;
            if(count > 3) return false;
        }
        return count == 3 && (int)Math.pow((int)Math.sqrt(n),2) == n;
    }
}