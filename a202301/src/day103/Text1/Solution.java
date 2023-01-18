package day103.Text1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if(entry.getValue() > n / 2){
                res = entry.getKey();
            }
        }
        return res;
    }
}
/*
* class Solution {
    public int majorityElement(int[] nums) {
        int res=nums[0],cnt=1;
        for(int x:nums)
        {
            if(x==res) cnt++;
            else if(--cnt==0)
            {
                res=x;
                cnt=1;
            }
        }
        return res;
    }
}*/
