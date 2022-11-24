package Text2;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int subtractProductAndSum(int n) {
        List<Integer> list = new ArrayList<>();
        while(n != 0){
            int ge = n % 10;
            n = (n - ge) / 10;
            list.add(ge);
        }
        int sum1 = 0;
        int sum2 = 1;
        for (int i = 0; i < list.size(); i++) {
            int ge = list.get(i);
            sum1 += ge;
            sum2 *= ge;
        }
        return sum1 - sum2;
    }
}
