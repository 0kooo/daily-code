package day215.Test1;

//1629. 按键持续时间最长的键
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
        int max = releaseTimes[0];
        char res = keysPressed.charAt(0);
        for (int i = 1; i < n; i++) {
            char c = keysPressed.charAt(i);
            int temp = releaseTimes[i] - releaseTimes[i - 1];
            if(max < temp || (max == temp && c > res)){
                max = temp;
                res = c;
            }
        }
        return res;
    }
}
