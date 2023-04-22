package day189.Test3;

import java.util.*;

//2094. 找出 3 位偶数
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        int n = digits.length;
        Arrays.sort(digits);
        for (int i = 0; i < n; i++) {
            int x = digits[i];
            for (int j = i + 1; j < n; j++) {
                int y = digits[j];
                for (int k = j + 1; k < n; k++) {
                    int z = digits[k];
                    if(x % 2 == 0){
                        set.add(y * 100 + z * 10 + x);
                        set.add(z * 100 + y * 10 + x);
                    }
                    if(y % 2 == 0){
                        set.add(x * 100 + z * 10 + y);
                        set.add(z * 100 + x * 10 + y);
                    }
                    if(z % 2 == 0){
                        set.add(x * 100 + y * 10 + z);
                        set.add(y * 100 + x * 10 + z);
                    }
                }
            }
        }
        List<Integer> nums = new ArrayList<>();
        for(int x : set){
            if(x >= 100){
                nums.add(x);
            }
        }
        Collections.sort(nums);
        int nn = nums.size();
        int[] res = new int[nn];
        for (int i = 0; i < nn; i++) {
            res[i] = nums.get(i);
        }
        return res;
    }
}
