package day287.Test1;

//492. 构造矩形
class Solution {
    public int[] constructRectangle(int area) {
        int w = (int)Math.sqrt(area);
        while (area % w != 0) w--;
        return new int[]{area / w, w};
    }
}
