package day64.Text1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkPowersOfThree(int n) {
        Map<Double, Integer> map = new HashMap<>();
        boolean flag = false;
        while (n > 0) {
            double count = 0.0;
            while(true){
                if(Math.pow(3.0, count) <= n){
                    count++;
                }else{
                    break;
                }
            }
            if(map.containsKey(count - 1)){
                break;
            }else{
                map.put(count - 1, 1);
            }
            n = (int)(n - Math.pow(3.0, count - 1));
            if(n == 0){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
