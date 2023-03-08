package day144.Test2;

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int m = image[0].length;
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = m - 1;
            while(left < right){
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                ++left;
                --right;
            }
        }
        for (int i = 0; i < n * n; i++) {
            if(image[i / n][i % n] == 0){
                image[i / n][i % n] = 1;
            }else{
                image[i / n][i % n] = 0;
            }
        }
        return image;
    }
}
