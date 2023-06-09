package day230.Test3;

//1395. 统计作战单位数
class Solution {
    public int numTeams(int[] rating) {
        int res = 0;
        int n = rating.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if((rating[i] > rating[j] && rating[j] > rating[k] )|| (rating[i] < rating[j] && rating[j] < rating[k])){
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
