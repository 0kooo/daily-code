package day295.Test3;

import java.util.ArrayList;
import java.util.List;

//693. 交替位二进制数
class Solution {
    public boolean hasAlternatingBits(int n) {
        List<Integer> list = new ArrayList<>();
        while (n != 0){
            list.add(n % 2);
            n /= 2;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if(list.get(i) == list.get(i + 1)) return false;
        }
        return true;
    }
}