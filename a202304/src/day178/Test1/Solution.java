package day178.Test1;

//1041. 困于环中的机器人
class Solution {
    public boolean isRobotBounded(String instructions) {
        int[][] arr = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int direcIndex = 0;
        int x = 0, y = 0;
        for (int i = 0; i < instructions.length(); i++) {
            char c = instructions.charAt(i);
            if(c == 'G'){
                x += arr[direcIndex][0];
                y += arr[direcIndex][1];
            }else if(c == 'L'){
                direcIndex += 3;
                direcIndex %= 4;
            }else{
                direcIndex++;
                direcIndex %= 4;
            }
        }
        return direcIndex != 0 || (x == 0 && y == 0);
    }
}
