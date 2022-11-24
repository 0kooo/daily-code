package Text2;

class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minIndex = -1;
        int minJL = Integer.MAX_VALUE;
        for(int i = 0; i < points.length; ++i){
            if(x == points[i][0] || y == points[i][1]){
                int res = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if(res < minJL){
                    minJL = res;
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }
}