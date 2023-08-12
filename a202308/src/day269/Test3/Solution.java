package day269.Test3;

import java.util.Arrays;

//1710. 卡车上的最大单元数
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int res = 0;
        Arrays.sort(boxTypes, (o1, o2) -> o2[1] - o1[1]);
        for (int[] boxType : boxTypes) {
            if(truckSize == 0)break;
            if(truckSize >= boxType[0]){
                res += (boxType[0] * boxType[1]);
                truckSize -= boxType[0];
            }else{
                res += (truckSize * boxType[1]);
                truckSize = 0;
            }
        }
        return res;
    }
}
