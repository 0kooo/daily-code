package day388.Test1;

//2923. 找到冠军 I
class Solution {
    public int findChampion(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(i != j){
                    if( grid[i][j] == 1 && grid[res][j] == 0){
                        res = i;
                    }
                }
            }
        }
        return res;
    }
}