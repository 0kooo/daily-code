package day214.Test1;

import java.util.ArrayList;
import java.util.List;

//1073. 负二进制数相加
class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        int i = arr1.length - 1, j = arr2.length - 1;
        int carry = 0;
        List<Integer> list = new ArrayList<>();
        while (i >= 0 || j >= 0 || carry != 0){
            int x = carry;
            if(i >= 0){
                x += arr1[i];
            }
            if(j >= 0){
                x += arr2[j];
            }
            if(x >= 2){
                list.add(x - 2);
                carry = -1;
            }else if(x >= 0){
                list.add(x);
                carry = 0;
            }else {
                list.add(1);
                carry = 1;
            }
            --i;
            --j;
        }
        while (list.size() > 1 && list.get(list.size() - 1) == 0){
            list.remove(list.size() - 1);
        }
        int[] res = new int[list.size()];
        for (i = 0, j = list.size() - 1; j >= 0; i++, j--){
            res[i] = list.get(j);
        }
        return res;
    }
}
