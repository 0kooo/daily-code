package Text3;

import java.util.TreeMap;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int count = 0;
        int temp = -1;
        for (int i = 0; i < len; i++) {
            if(flowerbed[i] == 1){
                if(temp < 0){
                    count += i / 2;
                }else{
                    count += (i - temp - 2) / 2;
                }
                if(count >= n){
                    return true;
                }
                temp=i;
            }
        }
        if(temp < 0){
            count += (len + 1) / 2;
        }else{
            count += (len - temp - 1) / 2;
        }
        return count >= n;
    }
}
