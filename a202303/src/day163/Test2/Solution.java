package day163.Test2;


//2367. 算术三元组的数目
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        /*Set<Integer> set = new HashSet<>();
        int res = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if(set.contains(num + diff) && set.contains(num + diff * 2)) res++;
        }
        return res;*/

        int n = nums.length;
        int res = 0;
        for(int i = 0, j = i + 1, k = j + 1; k < n; i++){
            while(j < n && nums[j] - nums[i] < diff){
                j++;
            }
            if(j == n) break;
            k = Math.max(k, j + 1);
            while (k < n && nums[k] - nums[j] < diff){
                k++;
            }
            if(k == n)break;
            if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) res++;
        }
        return res;
    }
}
