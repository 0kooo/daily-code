package Text3;

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int len = coordinates.length;
        int x = coordinates[0][0];
        int y = coordinates[0][1];
        for (int i = 0; i < len; i++) {
            coordinates[i][0] -= x;
            coordinates[i][1] -= y;
        }
        int a = coordinates[1][1];
        int b = -coordinates[1][0];
        for (int i = 2; i < len; i++) {
            x = coordinates[i][0];
            y = coordinates[i][1];
            if(a * x + b * y != 0){
                return false;
            }
        }
        return true;
    }
}
