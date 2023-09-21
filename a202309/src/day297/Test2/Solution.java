package day297.Test2;

//717. 1 比特与 2 比特字符
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length, i = 0;
        while (i < n - 1){
            i += bits[i] + 1;
        }
        return i == n - 1;
    }
}
