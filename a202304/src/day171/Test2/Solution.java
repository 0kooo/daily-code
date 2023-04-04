package day171.Test2;


//1128. 等价多米诺骨牌对的数量
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] arr = new int[100];
        int res = 0;
        for (int[] d : dominoes) {
            int val = d[0] < d[1] ? d[0] * 10 + d[1] : d[1] * 10 + d[0];
            res += arr[val];
            arr[val]++;
        }
        return res;
    }
}
