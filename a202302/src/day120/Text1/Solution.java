package day120.Text1;

import java.util.Arrays;

class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if(amount[2] >= amount[1] + amount[0]){
            return amount[2];
        }
        return (amount[1] + amount[0] + amount[2] + 1) / 2;
    }
}
