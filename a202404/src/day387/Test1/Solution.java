package day387.Test1;

import java.util.ArrayList;
import java.util.List;

//386. 字典序排数
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        int k = 1;
        for (int i = 0; i < n; i++) {
            res.add(k);
            if(k * 10 <= n) k *= 10;
            else{
                while (k % 10 == 9 || k + 1 > n){
                    k /= 10;
                }
                k++;
            }
        }
        return res;
    }
}