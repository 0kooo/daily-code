package day353.Test3;

//1791. 找出星型图的中心节点
class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length + 1;
        int[] count = new int[n + 1];
        for (int[] edge : edges) {
            count[edge[0]]++;
            count[edge[1]]++;
        }
        int res = 0;
        for(int i = 1; ;i++) {
            if(count[i] == n - 1){
                res = i;
                break;
            }
        }
        return res;
    }
}