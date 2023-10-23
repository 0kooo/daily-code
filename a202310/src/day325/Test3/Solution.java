package day325.Test3;

import java.util.Arrays;

//825. 适龄的朋友
class Solution {
    public int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int res = 0, l = 0, r = 0;
        for (int age : ages) {
            if(age < 15) continue;
            while (ages[l] <= 0.5 * age + 7) l++;
            while (r + 1 < ages.length && ages[r + 1] <= age) r++;
            res += r - l;
        }
        return res;
    }
}
