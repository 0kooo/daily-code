package day232.Test2;

//944. 删列造序
class Solution {
    public int minDeletionSize(String[] strs) {
        int res = 0;
        int m = strs.length;
        int n = strs[0].length();
        for (int j = 0; j < n; j++) {
            for (int i = 1; i < m; i++) {
                if(strs[i - 1].charAt(j) > strs[i].charAt(j)){
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
