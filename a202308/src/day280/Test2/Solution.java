package day280.Test2;

//2600. K 件物品的最大和
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        return k <= (numOnes + numZeros) ? Math.min(k, numOnes) : numOnes - (k - numOnes - numZeros);
    }
}
