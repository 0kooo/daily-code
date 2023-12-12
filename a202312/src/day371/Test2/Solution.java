package day371.Test2;

//2120. 执行所有后缀指令
class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int len = s.length();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            int count = len - i, y = startPos[0], x = startPos[1];
            for (int j = i; j < len; j++) {
                char c = s.charAt(j);
                if(c == 'L'){
                    --x;
                }else if(c == 'R'){
                    ++x;
                } else if(c == 'U'){
                    --y;
                }else{
                    ++y;
                }
                if(y < 0 || y >= n || x < 0 || x >= n){
                    count = j - i;
                    break;
                }
            }
            res[i] = count;
        }
        return res;
    }
}