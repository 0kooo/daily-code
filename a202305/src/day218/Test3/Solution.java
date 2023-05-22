package day218.Test3;

//2078. 两栋颜色不同且距离最远的房子
class Solution {
    public int maxDistance(int[] colors) {
        int length = colors.length;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if(colors[i] != colors[j]){
                    res = Math.max(res, j - i);
                }
            }
        }
        return res;
    }
}
