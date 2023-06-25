package day241.Test1;

//1401. 圆和矩形是否有重叠
class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int dis = 0;
        if(x1 > xCenter || x2 < xCenter){
            dis += Math.min(Math.pow(x1 - xCenter, 2), Math.pow(x2 - xCenter, 2));
        }
        if(y1 > yCenter || y2 < yCenter){
            dis += Math.min(Math.pow(y1 - yCenter, 2), Math.pow(y2 - yCenter, 2));
        }
        return dis <= radius * radius;
    }
}
