package day137.Text2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if(getDividingNumber(i)){
                res.add(i);
            }
        }
        return res;
    }

    public boolean getDividingNumber(int x){
        int temp = x;
        while(temp != 0){
            int ge = temp % 10;
            temp /= 10;
            if(ge == 0){
                return false;
            }
            if(x % ge != 0){
                return false;
            }
        }
        return true;
    }
}
