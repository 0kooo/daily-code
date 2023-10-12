package day314.Test1;

//2595. 奇偶位数
class Solution {
    public int[] evenOddBit(int n) {
        final int MASK = 0x5555;
        return new int[]{Integer.bitCount(n & MASK), Integer.bitCount(n & (MASK >> 1))};
    }
}