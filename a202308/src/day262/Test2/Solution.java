package day262.Test2;

//2682. 找出转圈游戏输家
class Solution {
    public int[] circularGameLosers(int n, int k) {
        var vis = new boolean[n];
        int m = n;
        for (int i = 0, d = k; !vis[i]; d += k, m--){
            vis[i] = true;
            i = (i + d) % n;
        }
        var res = new int[m];
        for (int i = 0, j = 0; i < n; i++){
            if(!vis[i]) res[j++] = i + 1;
        }
        return res;
    }
}
