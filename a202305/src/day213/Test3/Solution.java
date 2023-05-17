package day213.Test3;

import java.util.Arrays;

//1046. 最后一块石头的重量
class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        if(n == 1) return stones[0];
        if(n == 2) return Math.abs(stones[1] - stones[0]);
        while (true){
            Arrays.sort(stones);
            if(stones[n - 1] != 0 && stones[n - 2] == 0 || (stones[n - 1] == 0 && stones[n - 2] == 0))break;
            stones[n - 1] = stones[n - 1] - stones[n - 2];
            stones[n - 2] = 0;
            System.out.println(stones[n - 1]);
        }
        return stones[n - 1];
    }
}
