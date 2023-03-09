package day145.Test1;

class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0, right = 0;
        int count = 0;
        while(right < k){
            count += blocks.charAt(right) == 'W' ? 1 : 0;
            right++;
        }
        int ret = count;
        while(right < blocks.length()){
            count += blocks.charAt(right) == 'W' ? 1 : 0;
            count -= blocks.charAt(left) == 'W' ? 1 : 0;
            ret = Math.min(ret, count);
            right++;
            left++;
        }
        return ret;
    }
}
